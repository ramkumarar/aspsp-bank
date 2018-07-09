package com.rbsg.ob.aspspbank.controller;

import com.rbsg.ob.aspspbank.common.OBHttpRequestHelper;
import com.rbsg.ob.aspspbank.common.PispResources;
import com.rbsg.ob.aspspbank.model.PaymentSetupPOSTRequest;
import com.rbsg.ob.aspspbank.model.PaymentSetupPOSTResponse;
import com.rbsg.ob.aspspbank.model.TrustedBeneficiaryDTO;
import com.rbsg.ob.aspspbank.repo.TrustedBeneficiary;
import com.rbsg.ob.aspspbank.repo.TrustedBeneficiaryRepository;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Controller
public class PaymentsApiController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    OBHttpRequestHelper obHttpRequestHelper;



    @ApiOperation(value = "Create a single immediate payment", notes = "Create a single immediate payment", response = PaymentSetupPOSTResponse.class, authorizations = {
            @Authorization(value = "TPPOAuth2Security", scopes = {
                    @AuthorizationScope(scope = "payments", description = "Generic payment scope")
            })
    }, tags={ "OB Payment Initiation", })
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Payment setup resource successfully created", response = PaymentSetupPOSTResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = Void.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
            @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
            @ApiResponse(code = 405, message = "Method Not Allowed", response = Void.class),
            @ApiResponse(code = 406, message = "Not Acceptable", response = Void.class),
            @ApiResponse(code = 429, message = "Too Many Requests", response = Void.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Void.class) })

    //@PreAuthorize("#oauth2.hasScope('openpay')")
    @RequestMapping(value = "/payments",
            produces = { "application/json; charset=utf-8" },
            consumes = { "application/json; charset=utf-8" },
            method = RequestMethod.POST)
    public ResponseEntity<PaymentSetupPOSTResponse> createSingleImmediatePayment(@ApiParam(value = "Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours." ,required=true) @RequestHeader(value="x-idempotency-key", required=true) String xIdempotencyKey,
                                                                                 @ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true) @RequestHeader(value="x-fapi-financial-id", required=true) String xFapiFinancialId,
                                                                                 @ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
                                                                                 @ApiParam(value = "Setup a single immediate payment" ,required=true )  @Valid @RequestBody PaymentSetupPOSTRequest body,
                                                                                 @ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC" ) @RequestHeader(value="x-fapi-customer-last-logged-time", required=false) String xFapiCustomerLastLoggedTime,
                                                                                 @ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,
                                                                                 @ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId,
                                                                                 @ApiParam(value = "DO NOT USE. Header containing a detached JWS signature of the body of the payload." ) @RequestHeader(value="x-jws-signature", required=false) String xJwsSignature) {

        String resourceUrl= new StringBuilder().append(obHttpRequestHelper.getBaseUrl()).append("/")
                                               .append(PispResources.PAYMENT_INITIATION.toString())
                                               .toString();
        HttpEntity<PaymentSetupPOSTRequest> entity = new HttpEntity<>(body, obHttpRequestHelper.setupOBRequestHeaders());
        ResponseEntity<PaymentSetupPOSTResponse> response= restTemplate.exchange(resourceUrl, HttpMethod.POST, entity, PaymentSetupPOSTResponse.class);

        return response;
    }

    @ApiOperation(value = "Get a single immediate payment", notes = "Get a single immediate payment", response = PaymentSetupPOSTResponse.class, authorizations = {
            @Authorization(value = "PSUOAuth2Security", scopes = {
                    @AuthorizationScope(scope = "payments", description = "Generic payment scope")
            }),
            @Authorization(value = "TPPOAuth2Security", scopes = {
                    @AuthorizationScope(scope = "payments", description = "Generic payment scope")
            })
    }, tags={ "OB Payment Initiation", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Payment resource successfully retrieved", response = PaymentSetupPOSTResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = Void.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
            @ApiResponse(code = 403, message = "Forbidden", response = Void.class),
            @ApiResponse(code = 405, message = "Method Not Allowed", response = Void.class),
            @ApiResponse(code = 406, message = "Not Acceptable", response = Void.class),
            @ApiResponse(code = 429, message = "Too Many Requests", response = Void.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Void.class) })

    @RequestMapping(value = "/payments/{PaymentId}",
            produces = { "application/json; charset=utf-8" },
            method = RequestMethod.GET)
    public ResponseEntity<PaymentSetupPOSTResponse> getSingleImmediatePayment(@ApiParam(value = "Unique identification as assigned by the ASPSP to uniquely identify the payment setup resource.",required=true ) @PathVariable("PaymentId") String paymentId,
        @ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true) @RequestHeader(value="x-fapi-financial-id", required=true) String xFapiFinancialId,
        @ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC" ) @RequestHeader(value="x-fapi-customer-last-logged-time", required=false) String xFapiCustomerLastLoggedTime,
        @ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,
        @ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId) {

        String resourceUrl= new StringBuilder().append(obHttpRequestHelper.getBaseUrl()).append("/")
                .append(PispResources.PAYMENT_INITIATION.toString())
                .append("/")
                .append(paymentId)
                .toString();
        HttpEntity<?> entity = new HttpEntity<>( obHttpRequestHelper.setupOBRequestHeaders());
        return restTemplate.exchange(resourceUrl, HttpMethod.GET, entity, PaymentSetupPOSTResponse.class);

    }





}
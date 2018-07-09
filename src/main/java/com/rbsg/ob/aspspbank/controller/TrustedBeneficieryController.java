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


@RestController
public class TrustedBeneficieryController {

    @Autowired
    TrustedBeneficiaryRepository trustedBeneficiaryRepository;

    @RequestMapping(value = "/trustedBeneficiaries",
            produces = { "application/json; charset=utf-8" },
            method = RequestMethod.GET)

    public List<TrustedBeneficiaryDTO> fetchTrustedBeneficiary(){

        List<TrustedBeneficiaryDTO> beneficiaries= new ArrayList();
        for (TrustedBeneficiary trustedBeneficiary : trustedBeneficiaryRepository.findAll()) {
            System.out.println(trustedBeneficiary.toString());
            beneficiaries.add(new TrustedBeneficiaryDTO(trustedBeneficiary.getCreditorName(),
                    trustedBeneficiary.getBenificiaryIdentity().getCreditorAgentIdentification(),
                    trustedBeneficiary.getBenificiaryIdentity().getCreditorAccountIdentification()));
        }

        return beneficiaries;



    }


}
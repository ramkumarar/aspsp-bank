package com.rbsg.ob.aspspbank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.joda.time.DateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Reflection of The Main Data Payload, with Created Resource ID, Status and Timestamp
 */
@ApiModel(description = "Reflection of The Main Data Payload, with Created Resource ID, Status and Timestamp")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-07T19:11:20.507+05:30")

public class PaymentSetupResponse   {
  @JsonProperty("PaymentId")
  private String paymentId = null;

  /**
   * Specifies the status of the payment resource.
   */
  public enum StatusEnum {
    ACCEPTEDCUSTOMERPROFILE("AcceptedCustomerProfile"),
    
    ACCEPTEDTECHNICALVALIDATION("AcceptedTechnicalValidation"),
    
    PENDING("Pending"),
    
    REJECTED("Rejected");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Status")
  private StatusEnum status = null;

  @JsonProperty("CreationDateTime")
  private DateTime creationDateTime = null;

  @JsonProperty("Initiation")
  private PaymentSetupResponseInitiation initiation = null;

  public PaymentSetupResponse paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the payment setup resource.
   * @return paymentId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the payment setup resource.")
  @NotNull

 @Size(min=1,max=128)
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentSetupResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Specifies the status of the payment resource.
   * @return status
  **/
  @ApiModelProperty(value = "Specifies the status of the payment resource.")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public PaymentSetupResponse creationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

   /**
   * Date and time at which the resource was created.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the resource was created.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public PaymentSetupResponse initiation(PaymentSetupResponseInitiation initiation) {
    this.initiation = initiation;
    return this;
  }

   /**
   * Get initiation
   * @return initiation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentSetupResponseInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(PaymentSetupResponseInitiation initiation) {
    this.initiation = initiation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSetupResponse paymentSetupResponse = (PaymentSetupResponse) o;
    return Objects.equals(this.paymentId, paymentSetupResponse.paymentId) &&
        Objects.equals(this.status, paymentSetupResponse.status) &&
        Objects.equals(this.creationDateTime, paymentSetupResponse.creationDateTime) &&
        Objects.equals(this.initiation, paymentSetupResponse.initiation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, status, creationDateTime, initiation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupResponse {\n");
    
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


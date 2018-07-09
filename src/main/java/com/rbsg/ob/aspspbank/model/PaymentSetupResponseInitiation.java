package com.rbsg.ob.aspspbank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor.
 */
@ApiModel(description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-07T19:11:20.507+05:30")

public class PaymentSetupResponseInitiation   {
  @JsonProperty("InstructionIdentification")
  private String instructionIdentification = null;

  @JsonProperty("EndToEndIdentification")
  private String endToEndIdentification = null;

  @JsonProperty("InstructedAmount")
  private PaymentSetupInitiationInstructedAmount instructedAmount = null;

  @JsonProperty("DebtorAgent")
  private DebtorAgent debtorAgent = null;

  @JsonProperty("DebtorAccount")
  private DebtorAccount debtorAccount = null;

  @JsonProperty("CreditorAgent")
  private CreditorAgent creditorAgent = null;

  @JsonProperty("CreditorAccount")
  private CreditorAccount creditorAccount = null;

  @JsonProperty("RemittanceInformation")
  private RemittanceInformation remittanceInformation = null;

  public PaymentSetupResponseInitiation instructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
    return this;
  }

   /**
   * Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
   * @return instructionIdentification
  **/
  @ApiModelProperty(required = true, value = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.")
  @NotNull

 @Size(min=1,max=35)
  public String getInstructionIdentification() {
    return instructionIdentification;
  }

  public void setInstructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
  }

  public PaymentSetupResponseInitiation endToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
    return this;
  }

   /**
   * Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.
   * @return endToEndIdentification
  **/
  @ApiModelProperty(required = true, value = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.")
  @NotNull

 @Size(min=1,max=35)
  public String getEndToEndIdentification() {
    return endToEndIdentification;
  }

  public void setEndToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
  }

  public PaymentSetupResponseInitiation instructedAmount(PaymentSetupInitiationInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

   /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentSetupInitiationInstructedAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(PaymentSetupInitiationInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public PaymentSetupResponseInitiation debtorAgent(DebtorAgent debtorAgent) {
    this.debtorAgent = debtorAgent;
    return this;
  }

   /**
   * Get debtorAgent
   * @return debtorAgent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DebtorAgent getDebtorAgent() {
    return debtorAgent;
  }

  public void setDebtorAgent(DebtorAgent debtorAgent) {
    this.debtorAgent = debtorAgent;
  }

  public PaymentSetupResponseInitiation debtorAccount(DebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

   /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DebtorAccount getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(DebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public PaymentSetupResponseInitiation creditorAgent(CreditorAgent creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

   /**
   * Get creditorAgent
   * @return creditorAgent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CreditorAgent getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(CreditorAgent creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public PaymentSetupResponseInitiation creditorAccount(CreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

   /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CreditorAccount getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(CreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public PaymentSetupResponseInitiation remittanceInformation(RemittanceInformation remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
    return this;
  }

   /**
   * Get remittanceInformation
   * @return remittanceInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RemittanceInformation getRemittanceInformation() {
    return remittanceInformation;
  }

  public void setRemittanceInformation(RemittanceInformation remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSetupResponseInitiation paymentSetupResponseInitiation = (PaymentSetupResponseInitiation) o;
    return Objects.equals(this.instructionIdentification, paymentSetupResponseInitiation.instructionIdentification) &&
        Objects.equals(this.endToEndIdentification, paymentSetupResponseInitiation.endToEndIdentification) &&
        Objects.equals(this.instructedAmount, paymentSetupResponseInitiation.instructedAmount) &&
        Objects.equals(this.debtorAgent, paymentSetupResponseInitiation.debtorAgent) &&
        Objects.equals(this.debtorAccount, paymentSetupResponseInitiation.debtorAccount) &&
        Objects.equals(this.creditorAgent, paymentSetupResponseInitiation.creditorAgent) &&
        Objects.equals(this.creditorAccount, paymentSetupResponseInitiation.creditorAccount) &&
        Objects.equals(this.remittanceInformation, paymentSetupResponseInitiation.remittanceInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructionIdentification, endToEndIdentification, instructedAmount, debtorAgent, debtorAccount, creditorAgent, creditorAccount, remittanceInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupResponseInitiation {\n");
    
    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
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


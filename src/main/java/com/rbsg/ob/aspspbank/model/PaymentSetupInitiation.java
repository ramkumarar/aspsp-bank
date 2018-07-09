package com.rbsg.ob.aspspbank.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-07T19:11:20.507+05:30")

public class PaymentSetupInitiation   {
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

  public PaymentSetupInitiation instructionIdentification(String instructionIdentification) {
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

  public PaymentSetupInitiation endToEndIdentification(String endToEndIdentification) {
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

  public PaymentSetupInitiation instructedAmount(PaymentSetupInitiationInstructedAmount instructedAmount) {
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

  public PaymentSetupInitiation debtorAgent(DebtorAgent debtorAgent) {
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

  public PaymentSetupInitiation debtorAccount(DebtorAccount debtorAccount) {
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

  public PaymentSetupInitiation creditorAgent(CreditorAgent creditorAgent) {
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

  public PaymentSetupInitiation creditorAccount(CreditorAccount creditorAccount) {
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

  public PaymentSetupInitiation remittanceInformation(RemittanceInformation remittanceInformation) {
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
    PaymentSetupInitiation paymentSetupInitiation = (PaymentSetupInitiation) o;
    return Objects.equals(this.instructionIdentification, paymentSetupInitiation.instructionIdentification) &&
        Objects.equals(this.endToEndIdentification, paymentSetupInitiation.endToEndIdentification) &&
        Objects.equals(this.instructedAmount, paymentSetupInitiation.instructedAmount) &&
        Objects.equals(this.debtorAgent, paymentSetupInitiation.debtorAgent) &&
        Objects.equals(this.debtorAccount, paymentSetupInitiation.debtorAccount) &&
        Objects.equals(this.creditorAgent, paymentSetupInitiation.creditorAgent) &&
        Objects.equals(this.creditorAccount, paymentSetupInitiation.creditorAccount) &&
        Objects.equals(this.remittanceInformation, paymentSetupInitiation.remittanceInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructionIdentification, endToEndIdentification, instructedAmount, debtorAgent, debtorAccount, creditorAgent, creditorAccount, remittanceInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupInitiation {\n");
    
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


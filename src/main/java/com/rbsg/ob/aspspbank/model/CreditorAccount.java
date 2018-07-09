package com.rbsg.ob.aspspbank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction.
 */
@ApiModel(description = "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-07T19:11:20.507+05:30")

public class CreditorAccount   {
  /**
   * Name of the identification scheme, in a coded form as published in an external list.
   */
  public enum SchemeNameEnum {
    IBAN("IBAN");
    

    private String value;

    SchemeNameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SchemeNameEnum fromValue(String text) {
      for (SchemeNameEnum b : SchemeNameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("SchemeName")
  private SchemeNameEnum schemeName = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("SecondaryIdentification")
  private String secondaryIdentification = null;

  public CreditorAccount schemeName(SchemeNameEnum schemeName) {
    this.schemeName = schemeName;
    return this;
  }

   /**
   * Name of the identification scheme, in a coded form as published in an external list.
   * @return schemeName
  **/
  @ApiModelProperty(required = true, value = "Name of the identification scheme, in a coded form as published in an external list.")
  @NotNull


  public SchemeNameEnum getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(SchemeNameEnum schemeName) {
    this.schemeName = schemeName;
  }

  public CreditorAccount identification(String identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Identification assigned by an institution to identify an account. This identification is known by the account owner.
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "Identification assigned by an institution to identify an account. This identification is known by the account owner.")
  @NotNull

 @Size(min=1,max=34)
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public CreditorAccount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account. Usage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number. ASPSPs may carry out name validation for Confirmation of Payee, but it is not mandatory.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account. Usage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number. ASPSPs may carry out name validation for Confirmation of Payee, but it is not mandatory.")
  @NotNull

 @Size(min=1,max=70)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreditorAccount secondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
    return this;
  }

   /**
   * This is secondary identification of the account, as assigned by the account servicing institution. This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).
   * @return secondaryIdentification
  **/
  @ApiModelProperty(value = "This is secondary identification of the account, as assigned by the account servicing institution. This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).")

 @Size(min=1,max=34)
  public String getSecondaryIdentification() {
    return secondaryIdentification;
  }

  public void setSecondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditorAccount creditorAccount = (CreditorAccount) o;
    return Objects.equals(this.schemeName, creditorAccount.schemeName) &&
        Objects.equals(this.identification, creditorAccount.identification) &&
        Objects.equals(this.name, creditorAccount.name) &&
        Objects.equals(this.secondaryIdentification, creditorAccount.secondaryIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name, secondaryIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditorAccount {\n");
    
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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


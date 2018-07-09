package com.rbsg.ob.aspspbank.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

/**
 * PaymentSetupPOSTResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-07T19:11:20.507+05:30")

public class PaymentSetupPOSTResponse   {
  @JsonProperty("Data")
  private PaymentSetupResponse data = null;

  @JsonProperty("Risk")
  private Risk1 risk = null;

  @JsonProperty("Links")
  private PaymentSetupPOSTResponseLinks links = null;

  @JsonProperty("Meta")
  private PaymentSetupPOSTResponseMeta meta = null;

  public PaymentSetupPOSTResponse data(PaymentSetupResponse data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentSetupResponse getData() {
    return data;
  }

  public void setData(PaymentSetupResponse data) {
    this.data = data;
  }

  public PaymentSetupPOSTResponse risk(Risk1 risk) {
    this.risk = risk;
    return this;
  }

   /**
   * Get risk
   * @return risk
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Risk1 getRisk() {
    return risk;
  }

  public void setRisk(Risk1 risk) {
    this.risk = risk;
  }

  public PaymentSetupPOSTResponse links(PaymentSetupPOSTResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentSetupPOSTResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PaymentSetupPOSTResponseLinks links) {
    this.links = links;
  }

  public PaymentSetupPOSTResponse meta(PaymentSetupPOSTResponseMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentSetupPOSTResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(PaymentSetupPOSTResponseMeta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSetupPOSTResponse paymentSetupPOSTResponse = (PaymentSetupPOSTResponse) o;
    return Objects.equals(this.data, paymentSetupPOSTResponse.data) &&
        Objects.equals(this.risk, paymentSetupPOSTResponse.risk) &&
        Objects.equals(this.links, paymentSetupPOSTResponse.links) &&
        Objects.equals(this.meta, paymentSetupPOSTResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupPOSTResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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


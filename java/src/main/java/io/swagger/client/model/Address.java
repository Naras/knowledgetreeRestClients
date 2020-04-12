/*
 * OpenAPI definition
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Address
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-12T15:49:33.774Z[GMT]")
public class Address {
  @SerializedName("state")
  private String state = null;

  @SerializedName("district")
  private String district = null;

  @SerializedName("zipcode")
  private String zipcode = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("country")
  private String country = null;

  public Address state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address district(String district) {
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @Schema(description = "")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public Address zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }

   /**
   * Get zipcode
   * @return zipcode
  **/
  @Schema(description = "")
  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public Address address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(description = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.state, address.state) &&
        Objects.equals(this.district, address.district) &&
        Objects.equals(this.zipcode, address.zipcode) &&
        Objects.equals(this.address, address.address) &&
        Objects.equals(this.country, address.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, district, zipcode, address, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

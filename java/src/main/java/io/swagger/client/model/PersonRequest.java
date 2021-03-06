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
import io.swagger.client.model.Address;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * PersonRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-12T15:49:33.774Z[GMT]")
public class PersonRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("birthdate")
  private OffsetDateTime birthdate = null;

  @SerializedName("deathdate")
  private OffsetDateTime deathdate = null;

  @SerializedName("alive")
  private Boolean alive = null;

  @SerializedName("biography")
  private String biography = null;

  @SerializedName("period")
  private String period = null;

  @SerializedName("affiliation")
  private String affiliation = null;

  @SerializedName("address")
  private Address address = null;

  public PersonRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PersonRequest birthdate(OffsetDateTime birthdate) {
    this.birthdate = birthdate;
    return this;
  }

   /**
   * Get birthdate
   * @return birthdate
  **/
  @Schema(description = "")
  public OffsetDateTime getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(OffsetDateTime birthdate) {
    this.birthdate = birthdate;
  }

  public PersonRequest deathdate(OffsetDateTime deathdate) {
    this.deathdate = deathdate;
    return this;
  }

   /**
   * Get deathdate
   * @return deathdate
  **/
  @Schema(description = "")
  public OffsetDateTime getDeathdate() {
    return deathdate;
  }

  public void setDeathdate(OffsetDateTime deathdate) {
    this.deathdate = deathdate;
  }

  public PersonRequest alive(Boolean alive) {
    this.alive = alive;
    return this;
  }

   /**
   * Get alive
   * @return alive
  **/
  @Schema(description = "")
  public Boolean isAlive() {
    return alive;
  }

  public void setAlive(Boolean alive) {
    this.alive = alive;
  }

  public PersonRequest biography(String biography) {
    this.biography = biography;
    return this;
  }

   /**
   * Get biography
   * @return biography
  **/
  @Schema(description = "")
  public String getBiography() {
    return biography;
  }

  public void setBiography(String biography) {
    this.biography = biography;
  }

  public PersonRequest period(String period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public PersonRequest affiliation(String affiliation) {
    this.affiliation = affiliation;
    return this;
  }

   /**
   * Get affiliation
   * @return affiliation
  **/
  @Schema(description = "")
  public String getAffiliation() {
    return affiliation;
  }

  public void setAffiliation(String affiliation) {
    this.affiliation = affiliation;
  }

  public PersonRequest address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonRequest personRequest = (PersonRequest) o;
    return Objects.equals(this.name, personRequest.name) &&
        Objects.equals(this.birthdate, personRequest.birthdate) &&
        Objects.equals(this.deathdate, personRequest.deathdate) &&
        Objects.equals(this.alive, personRequest.alive) &&
        Objects.equals(this.biography, personRequest.biography) &&
        Objects.equals(this.period, personRequest.period) &&
        Objects.equals(this.affiliation, personRequest.affiliation) &&
        Objects.equals(this.address, personRequest.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, birthdate, deathdate, alive, biography, period, affiliation, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    deathdate: ").append(toIndentedString(deathdate)).append("\n");
    sb.append("    alive: ").append(toIndentedString(alive)).append("\n");
    sb.append("    biography: ").append(toIndentedString(biography)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    affiliation: ").append(toIndentedString(affiliation)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

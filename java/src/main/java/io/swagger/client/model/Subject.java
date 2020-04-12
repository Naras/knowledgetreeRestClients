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
import io.swagger.client.model.Link;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Subject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-12T15:49:33.774Z[GMT]")
public class Subject {
  @SerializedName("get_id")
  private String getId = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("subject_relations")
  private List<Link> subjectRelations = null;

  @SerializedName("subject_parents")
  private List<Link> subjectParents = null;

  @SerializedName("subject_work_relations")
  private List<Link> subjectWorkRelations = null;

  public Subject getId(String getId) {
    this.getId = getId;
    return this;
  }

   /**
   * Get getId
   * @return getId
  **/
  @Schema(description = "")
  public String getGetId() {
    return getId;
  }

  public void setGetId(String getId) {
    this.getId = getId;
  }

  public Subject title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Subject description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Subject subjectRelations(List<Link> subjectRelations) {
    this.subjectRelations = subjectRelations;
    return this;
  }

  public Subject addSubjectRelationsItem(Link subjectRelationsItem) {
    if (this.subjectRelations == null) {
      this.subjectRelations = new ArrayList<Link>();
    }
    this.subjectRelations.add(subjectRelationsItem);
    return this;
  }

   /**
   * Get subjectRelations
   * @return subjectRelations
  **/
  @Schema(description = "")
  public List<Link> getSubjectRelations() {
    return subjectRelations;
  }

  public void setSubjectRelations(List<Link> subjectRelations) {
    this.subjectRelations = subjectRelations;
  }

  public Subject subjectParents(List<Link> subjectParents) {
    this.subjectParents = subjectParents;
    return this;
  }

  public Subject addSubjectParentsItem(Link subjectParentsItem) {
    if (this.subjectParents == null) {
      this.subjectParents = new ArrayList<Link>();
    }
    this.subjectParents.add(subjectParentsItem);
    return this;
  }

   /**
   * Get subjectParents
   * @return subjectParents
  **/
  @Schema(description = "")
  public List<Link> getSubjectParents() {
    return subjectParents;
  }

  public void setSubjectParents(List<Link> subjectParents) {
    this.subjectParents = subjectParents;
  }

  public Subject subjectWorkRelations(List<Link> subjectWorkRelations) {
    this.subjectWorkRelations = subjectWorkRelations;
    return this;
  }

  public Subject addSubjectWorkRelationsItem(Link subjectWorkRelationsItem) {
    if (this.subjectWorkRelations == null) {
      this.subjectWorkRelations = new ArrayList<Link>();
    }
    this.subjectWorkRelations.add(subjectWorkRelationsItem);
    return this;
  }

   /**
   * Get subjectWorkRelations
   * @return subjectWorkRelations
  **/
  @Schema(description = "")
  public List<Link> getSubjectWorkRelations() {
    return subjectWorkRelations;
  }

  public void setSubjectWorkRelations(List<Link> subjectWorkRelations) {
    this.subjectWorkRelations = subjectWorkRelations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subject subject = (Subject) o;
    return Objects.equals(this.getId, subject.getId) &&
        Objects.equals(this.title, subject.title) &&
        Objects.equals(this.description, subject.description) &&
        Objects.equals(this.subjectRelations, subject.subjectRelations) &&
        Objects.equals(this.subjectParents, subject.subjectParents) &&
        Objects.equals(this.subjectWorkRelations, subject.subjectWorkRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId, title, description, subjectRelations, subjectParents, subjectWorkRelations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subject {\n");
    
    sb.append("    getId: ").append(toIndentedString(getId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subjectRelations: ").append(toIndentedString(subjectRelations)).append("\n");
    sb.append("    subjectParents: ").append(toIndentedString(subjectParents)).append("\n");
    sb.append("    subjectWorkRelations: ").append(toIndentedString(subjectWorkRelations)).append("\n");
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

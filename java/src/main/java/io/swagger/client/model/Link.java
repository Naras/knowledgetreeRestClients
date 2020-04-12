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
 * Link
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-12T15:49:33.774Z[GMT]")
public class Link {
  @SerializedName("id")
  private String id = null;

  /**
   * Gets or Sets persontype
   */
  @JsonAdapter(PersontypeEnum.Adapter.class)
  public enum PersontypeEnum {
    GURUSHISHYA("GURUSHISHYA"),
    CONTEMPORARY("CONTEMPORARY");

    private String value;

    PersontypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PersontypeEnum fromValue(String text) {
      for (PersontypeEnum b : PersontypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PersontypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PersontypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PersontypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PersontypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("persontype")
  private PersontypeEnum persontype = null;

  /**
   * Gets or Sets personworktype
   */
  @JsonAdapter(PersonworktypeEnum.Adapter.class)
  public enum PersonworktypeEnum {
    COMMENTATOR("COMMENTATOR"),
    CREATOR("CREATOR"),
    EDITOR("EDITOR"),
    PRAMAANA_PRAMATHA("PRAMAANA_PRAMATHA"),
    REVIEWER("REVIEWER");

    private String value;

    PersonworktypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PersonworktypeEnum fromValue(String text) {
      for (PersonworktypeEnum b : PersonworktypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PersonworktypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PersonworktypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PersonworktypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PersonworktypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("personworktype")
  private PersonworktypeEnum personworktype = null;

  /**
   * Gets or Sets subjecttype
   */
  @JsonAdapter(SubjecttypeEnum.Adapter.class)
  public enum SubjecttypeEnum {
    ADHAARA_ADHAARI("ADHAARA_ADHAARI"),
    ANGA_ANGI("ANGA_ANGI"),
    ANONYA_ASHRAYA("ANONYA_ASHRAYA"),
    ASHRAYA_ASHREYI("ASHRAYA_ASHREYI"),
    AVAYAVI("AVAYAVI"),
    DARSHANA("DARSHANA"),
    DHARMA_DHARMI("DHARMA_DHARMI"),
    JANYA_JANAKA("JANYA_JANAKA"),
    KAARYA_KAARANA("KAARYA_KAARANA"),
    NIRUPYA_NIRUPAKA("NIRUPYA_NIRUPAKA"),
    ANGA("ANGA"),
    PRAKAARA_PRAKAARI("PRAKAARA_PRAKAARI"),
    COMMON_PARENT("COMMON_PARENT"),
    UDDHESHYA_VIDHEYA("UDDHESHYA_VIDHEYA"),
    UPAVEDA("UPAVEDA"),
    UPABRAHMYA_UPABRAHMANA("UPABRAHMYA_UPABRAHMANA"),
    UPANISHAD("UPANISHAD"),
    VISHAYA_VISHAYI("VISHAYA_VISHAYI");

    private String value;

    SubjecttypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SubjecttypeEnum fromValue(String text) {
      for (SubjecttypeEnum b : SubjecttypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SubjecttypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubjecttypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubjecttypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubjecttypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("subjecttype")
  private SubjecttypeEnum subjecttype = null;

  /**
   * Gets or Sets worktype
   */
  @JsonAdapter(WorktypeEnum.Adapter.class)
  public enum WorktypeEnum {
    ADHAARA_ADHAARI("ADHAARA_ADHAARI"),
    ANGA_ANGI("ANGA_ANGI"),
    ANONYA_ASHRAYA("ANONYA_ASHRAYA"),
    ASHRAYA_ASHREYI("ASHRAYA_ASHREYI"),
    AVAYAVI("AVAYAVI"),
    CHAPTER("CHAPTER"),
    COMMENTARY_ON_COMMENTARY("COMMENTARY_ON_COMMENTARY"),
    COMMENTARY("COMMENTARY"),
    DARSHANA("DARSHANA"),
    DERIVED("DERIVED"),
    DHARMA_DHARMI("DHARMA_DHARMI"),
    JANYA_JANAKA("JANYA_JANAKA"),
    KAARYA_KAARANA("KAARYA_KAARANA"),
    NIRUPYA_NIRUPAKA("NIRUPYA_NIRUPAKA"),
    ORIGINAL("ORIGINAL"),
    ANGA("ANGA"),
    PART_WHOLE_RELATION("PART_WHOLE_RELATION"),
    PRAKAARA_PRAKAARI("PRAKAARA_PRAKAARI"),
    REVIEW("REVIEW"),
    SECTION("SECTION"),
    COMMON_PARENT("COMMON_PARENT"),
    SUB_COMMENTARY("SUB_COMMENTARY"),
    SUB_SECTION("SUB_SECTION"),
    UDDHESHYA_VIDHEYA("UDDHESHYA_VIDHEYA"),
    UPAVEDA("UPAVEDA"),
    UPABRAHMYA_UPABRAHMANA("UPABRAHMYA_UPABRAHMANA"),
    UPANISHAD("UPANISHAD"),
    VISHAYA_VISHAYI("VISHAYA_VISHAYI"),
    VOLUME("VOLUME");

    private String value;

    WorktypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static WorktypeEnum fromValue(String text) {
      for (WorktypeEnum b : WorktypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<WorktypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WorktypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WorktypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WorktypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("worktype")
  private WorktypeEnum worktype = null;

  /**
   * Gets or Sets subjectworktype
   */
  @JsonAdapter(SubjectworktypeEnum.Adapter.class)
  public enum SubjectworktypeEnum {
    COMMENTARY_ON_COMMENTARY("COMMENTARY_ON_COMMENTARY"),
    COMMENTARY("COMMENTARY"),
    COMPILATION("COMPILATION"),
    ORIGINAL_WORK("ORIGINAL_WORK"),
    PRAMANA_PRAMEYA("PRAMANA_PRAMEYA"),
    RECITATION("RECITATION"),
    SUB_COMMENTARY("SUB_COMMENTARY"),
    TRANSLATION("TRANSLATION"),
    TREATISE("TREATISE"),
    UPABRAHMYA_UPABRAHMANA("UPABRAHMYA_UPABRAHMANA"),
    VRITTHI("VRITTHI");

    private String value;

    SubjectworktypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SubjectworktypeEnum fromValue(String text) {
      for (SubjectworktypeEnum b : SubjectworktypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SubjectworktypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubjectworktypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubjectworktypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubjectworktypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("subjectworktype")
  private SubjectworktypeEnum subjectworktype = null;

  @SerializedName("links")
  private List<Link> links = null;

  public Link id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Link persontype(PersontypeEnum persontype) {
    this.persontype = persontype;
    return this;
  }

   /**
   * Get persontype
   * @return persontype
  **/
  @Schema(description = "")
  public PersontypeEnum getPersontype() {
    return persontype;
  }

  public void setPersontype(PersontypeEnum persontype) {
    this.persontype = persontype;
  }

  public Link personworktype(PersonworktypeEnum personworktype) {
    this.personworktype = personworktype;
    return this;
  }

   /**
   * Get personworktype
   * @return personworktype
  **/
  @Schema(description = "")
  public PersonworktypeEnum getPersonworktype() {
    return personworktype;
  }

  public void setPersonworktype(PersonworktypeEnum personworktype) {
    this.personworktype = personworktype;
  }

  public Link subjecttype(SubjecttypeEnum subjecttype) {
    this.subjecttype = subjecttype;
    return this;
  }

   /**
   * Get subjecttype
   * @return subjecttype
  **/
  @Schema(description = "")
  public SubjecttypeEnum getSubjecttype() {
    return subjecttype;
  }

  public void setSubjecttype(SubjecttypeEnum subjecttype) {
    this.subjecttype = subjecttype;
  }

  public Link worktype(WorktypeEnum worktype) {
    this.worktype = worktype;
    return this;
  }

   /**
   * Get worktype
   * @return worktype
  **/
  @Schema(description = "")
  public WorktypeEnum getWorktype() {
    return worktype;
  }

  public void setWorktype(WorktypeEnum worktype) {
    this.worktype = worktype;
  }

  public Link subjectworktype(SubjectworktypeEnum subjectworktype) {
    this.subjectworktype = subjectworktype;
    return this;
  }

   /**
   * Get subjectworktype
   * @return subjectworktype
  **/
  @Schema(description = "")
  public SubjectworktypeEnum getSubjectworktype() {
    return subjectworktype;
  }

  public void setSubjectworktype(SubjectworktypeEnum subjectworktype) {
    this.subjectworktype = subjectworktype;
  }

  public Link links(List<Link> links) {
    this.links = links;
    return this;
  }

  public Link addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Schema(description = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.id, link.id) &&
        Objects.equals(this.persontype, link.persontype) &&
        Objects.equals(this.personworktype, link.personworktype) &&
        Objects.equals(this.subjecttype, link.subjecttype) &&
        Objects.equals(this.worktype, link.worktype) &&
        Objects.equals(this.subjectworktype, link.subjectworktype) &&
        Objects.equals(this.links, link.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, persontype, personworktype, subjecttype, worktype, subjectworktype, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    persontype: ").append(toIndentedString(persontype)).append("\n");
    sb.append("    personworktype: ").append(toIndentedString(personworktype)).append("\n");
    sb.append("    subjecttype: ").append(toIndentedString(subjecttype)).append("\n");
    sb.append("    worktype: ").append(toIndentedString(worktype)).append("\n");
    sb.append("    subjectworktype: ").append(toIndentedString(subjectworktype)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
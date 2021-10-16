/*
 * Clever API
 * The Clever API
 *
 * OpenAPI spec version: 3.0.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Event;
import io.swagger.client.model.SchoolObject;
import java.io.IOException;

/**
 * SchoolsUpdated
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-05T11:24:52.001Z")
public class SchoolsUpdated extends Event {
  @SerializedName("data")
  private SchoolObject data = null;

  @SerializedName("previous_attributes")
  private Object previousAttributes = null;

  public SchoolsUpdated data(SchoolObject data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public SchoolObject getData() {
    return data;
  }

  public void setData(SchoolObject data) {
    this.data = data;
  }

  public SchoolsUpdated previousAttributes(Object previousAttributes) {
    this.previousAttributes = previousAttributes;
    return this;
  }

   /**
   * Get previousAttributes
   * @return previousAttributes
  **/
  @ApiModelProperty(value = "")
  public Object getPreviousAttributes() {
    return previousAttributes;
  }

  public void setPreviousAttributes(Object previousAttributes) {
    this.previousAttributes = previousAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchoolsUpdated schoolsUpdated = (SchoolsUpdated) o;
    return Objects.equals(this.data, schoolsUpdated.data) &&
        Objects.equals(this.previousAttributes, schoolsUpdated.previousAttributes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, previousAttributes, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchoolsUpdated {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    previousAttributes: ").append(toIndentedString(previousAttributes)).append("\n");
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


/*
 * Swagger Petstore (Simple)
 * A sample API that uses a petstore as an example to demonstrate features in the swagger-2.0 specification
 *
 * OpenAPI spec version: 1.0.0
 * Contact: foo@example.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ServiceDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-13T16:31:41.035Z")
public class ServiceDTO {
  @SerializedName("password")
  private Map<String, Map<String, String>> password = null;

  public ServiceDTO password(Map<String, Map<String, String>> password) {
    this.password = password;
    return this;
  }

  public ServiceDTO putPasswordItem(String key, Map<String, String> passwordItem) {
    if (this.password == null) {
      this.password = new HashMap<String, Map<String, String>>();
    }
    this.password.put(key, passwordItem);
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public Map<String, Map<String, String>> getPassword() {
    return password;
  }

  public void setPassword(Map<String, Map<String, String>> password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDTO serviceDTO = (ServiceDTO) o;
    return Objects.equals(this.password, serviceDTO.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDTO {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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


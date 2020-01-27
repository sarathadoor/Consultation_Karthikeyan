package com.bytatech.ayoos.client.activiti_rest_api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessEngineInfoResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T17:01:52.038+05:30[Asia/Kolkata]")

public class ProcessEngineInfoResponse   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("resourceUrl")
  private String resourceUrl = null;

  @JsonProperty("exception")
  private String exception = null;

  @JsonProperty("version")
  private String version = null;

  public ProcessEngineInfoResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProcessEngineInfoResponse resourceUrl(String resourceUrl) {
    this.resourceUrl = resourceUrl;
    return this;
  }

  /**
   * Get resourceUrl
   * @return resourceUrl
  **/
  @ApiModelProperty(value = "")


  public String getResourceUrl() {
    return resourceUrl;
  }

  public void setResourceUrl(String resourceUrl) {
    this.resourceUrl = resourceUrl;
  }

  public ProcessEngineInfoResponse exception(String exception) {
    this.exception = exception;
    return this;
  }

  /**
   * Get exception
   * @return exception
  **/
  @ApiModelProperty(value = "")


  public String getException() {
    return exception;
  }

  public void setException(String exception) {
    this.exception = exception;
  }

  public ProcessEngineInfoResponse version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessEngineInfoResponse processEngineInfoResponse = (ProcessEngineInfoResponse) o;
    return Objects.equals(this.name, processEngineInfoResponse.name) &&
        Objects.equals(this.resourceUrl, processEngineInfoResponse.resourceUrl) &&
        Objects.equals(this.exception, processEngineInfoResponse.exception) &&
        Objects.equals(this.version, processEngineInfoResponse.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, resourceUrl, exception, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessEngineInfoResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceUrl: ").append(toIndentedString(resourceUrl)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


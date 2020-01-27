package com.bytatech.ayoos.client.activiti_rest_api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AttachmentResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T17:01:52.038+05:30[Asia/Kolkata]")

public class AttachmentResponse   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("taskUrl")
  private String taskUrl = null;

  @JsonProperty("processInstanceUrl")
  private String processInstanceUrl = null;

  @JsonProperty("externalUrl")
  private String externalUrl = null;

  @JsonProperty("contentUrl")
  private String contentUrl = null;

  @JsonProperty("time")
  private OffsetDateTime time = null;

  public AttachmentResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AttachmentResponse url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AttachmentResponse name(String name) {
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

  public AttachmentResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public AttachmentResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AttachmentResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Can be any arbitrary value. When a valid formatted media-type (e.g. application/xml, text/plain) is included, the binary content HTTP response content-type will be set the the given value.
   * @return type
  **/
  @ApiModelProperty(value = "Can be any arbitrary value. When a valid formatted media-type (e.g. application/xml, text/plain) is included, the binary content HTTP response content-type will be set the the given value.")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AttachmentResponse taskUrl(String taskUrl) {
    this.taskUrl = taskUrl;
    return this;
  }

  /**
   * Get taskUrl
   * @return taskUrl
  **/
  @ApiModelProperty(value = "")


  public String getTaskUrl() {
    return taskUrl;
  }

  public void setTaskUrl(String taskUrl) {
    this.taskUrl = taskUrl;
  }

  public AttachmentResponse processInstanceUrl(String processInstanceUrl) {
    this.processInstanceUrl = processInstanceUrl;
    return this;
  }

  /**
   * Get processInstanceUrl
   * @return processInstanceUrl
  **/
  @ApiModelProperty(value = "")


  public String getProcessInstanceUrl() {
    return processInstanceUrl;
  }

  public void setProcessInstanceUrl(String processInstanceUrl) {
    this.processInstanceUrl = processInstanceUrl;
  }

  public AttachmentResponse externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

  /**
   * contentUrl:In case the attachment is a link to an external resource, the externalUrl contains the URL to the external content. If the attachment content is present in the Activiti engine, the contentUrl will contain an URL where the binary content can be streamed from.
   * @return externalUrl
  **/
  @ApiModelProperty(value = "contentUrl:In case the attachment is a link to an external resource, the externalUrl contains the URL to the external content. If the attachment content is present in the Activiti engine, the contentUrl will contain an URL where the binary content can be streamed from.")


  public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public AttachmentResponse contentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }

  /**
   * Get contentUrl
   * @return contentUrl
  **/
  @ApiModelProperty(value = "")


  public String getContentUrl() {
    return contentUrl;
  }

  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }

  public AttachmentResponse time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentResponse attachmentResponse = (AttachmentResponse) o;
    return Objects.equals(this.id, attachmentResponse.id) &&
        Objects.equals(this.url, attachmentResponse.url) &&
        Objects.equals(this.name, attachmentResponse.name) &&
        Objects.equals(this.userId, attachmentResponse.userId) &&
        Objects.equals(this.description, attachmentResponse.description) &&
        Objects.equals(this.type, attachmentResponse.type) &&
        Objects.equals(this.taskUrl, attachmentResponse.taskUrl) &&
        Objects.equals(this.processInstanceUrl, attachmentResponse.processInstanceUrl) &&
        Objects.equals(this.externalUrl, attachmentResponse.externalUrl) &&
        Objects.equals(this.contentUrl, attachmentResponse.contentUrl) &&
        Objects.equals(this.time, attachmentResponse.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, name, userId, description, type, taskUrl, processInstanceUrl, externalUrl, contentUrl, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    taskUrl: ").append(toIndentedString(taskUrl)).append("\n");
    sb.append("    processInstanceUrl: ").append(toIndentedString(processInstanceUrl)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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


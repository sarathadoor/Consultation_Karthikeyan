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
 * HistoricActivityInstanceQueryRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T17:01:52.038+05:30[Asia/Kolkata]")

public class HistoricActivityInstanceQueryRequest   {
  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("sort")
  private String sort = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("activityInstanceId")
  private String activityInstanceId = null;

  @JsonProperty("activityName")
  private String activityName = null;

  @JsonProperty("activityType")
  private String activityType = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("finished")
  private Boolean finished = false;

  @JsonProperty("taskAssignee")
  private String taskAssignee = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("tenantIdLike")
  private String tenantIdLike = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = false;

  public HistoricActivityInstanceQueryRequest start(Integer start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")


  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public HistoricActivityInstanceQueryRequest size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")


  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public HistoricActivityInstanceQueryRequest sort(String sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(value = "")


  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public HistoricActivityInstanceQueryRequest order(String order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")


  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public HistoricActivityInstanceQueryRequest activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * Get activityId
   * @return activityId
  **/
  @ApiModelProperty(value = "")


  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public HistoricActivityInstanceQueryRequest activityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
    return this;
  }

  /**
   * Get activityInstanceId
   * @return activityInstanceId
  **/
  @ApiModelProperty(value = "")


  public String getActivityInstanceId() {
    return activityInstanceId;
  }

  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }

  public HistoricActivityInstanceQueryRequest activityName(String activityName) {
    this.activityName = activityName;
    return this;
  }

  /**
   * Get activityName
   * @return activityName
  **/
  @ApiModelProperty(value = "")


  public String getActivityName() {
    return activityName;
  }

  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }

  public HistoricActivityInstanceQueryRequest activityType(String activityType) {
    this.activityType = activityType;
    return this;
  }

  /**
   * Get activityType
   * @return activityType
  **/
  @ApiModelProperty(value = "")


  public String getActivityType() {
    return activityType;
  }

  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }

  public HistoricActivityInstanceQueryRequest executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * Get executionId
   * @return executionId
  **/
  @ApiModelProperty(value = "")


  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public HistoricActivityInstanceQueryRequest finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

  /**
   * Get finished
   * @return finished
  **/
  @ApiModelProperty(value = "")


  public Boolean isFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public HistoricActivityInstanceQueryRequest taskAssignee(String taskAssignee) {
    this.taskAssignee = taskAssignee;
    return this;
  }

  /**
   * Get taskAssignee
   * @return taskAssignee
  **/
  @ApiModelProperty(value = "")


  public String getTaskAssignee() {
    return taskAssignee;
  }

  public void setTaskAssignee(String taskAssignee) {
    this.taskAssignee = taskAssignee;
  }

  public HistoricActivityInstanceQueryRequest processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * Get processInstanceId
   * @return processInstanceId
  **/
  @ApiModelProperty(value = "")


  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public HistoricActivityInstanceQueryRequest processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Get processDefinitionId
   * @return processDefinitionId
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricActivityInstanceQueryRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")


  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public HistoricActivityInstanceQueryRequest tenantIdLike(String tenantIdLike) {
    this.tenantIdLike = tenantIdLike;
    return this;
  }

  /**
   * Get tenantIdLike
   * @return tenantIdLike
  **/
  @ApiModelProperty(value = "")


  public String getTenantIdLike() {
    return tenantIdLike;
  }

  public void setTenantIdLike(String tenantIdLike) {
    this.tenantIdLike = tenantIdLike;
  }

  public HistoricActivityInstanceQueryRequest withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Get withoutTenantId
   * @return withoutTenantId
  **/
  @ApiModelProperty(value = "")


  public Boolean isWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricActivityInstanceQueryRequest historicActivityInstanceQueryRequest = (HistoricActivityInstanceQueryRequest) o;
    return Objects.equals(this.start, historicActivityInstanceQueryRequest.start) &&
        Objects.equals(this.size, historicActivityInstanceQueryRequest.size) &&
        Objects.equals(this.sort, historicActivityInstanceQueryRequest.sort) &&
        Objects.equals(this.order, historicActivityInstanceQueryRequest.order) &&
        Objects.equals(this.activityId, historicActivityInstanceQueryRequest.activityId) &&
        Objects.equals(this.activityInstanceId, historicActivityInstanceQueryRequest.activityInstanceId) &&
        Objects.equals(this.activityName, historicActivityInstanceQueryRequest.activityName) &&
        Objects.equals(this.activityType, historicActivityInstanceQueryRequest.activityType) &&
        Objects.equals(this.executionId, historicActivityInstanceQueryRequest.executionId) &&
        Objects.equals(this.finished, historicActivityInstanceQueryRequest.finished) &&
        Objects.equals(this.taskAssignee, historicActivityInstanceQueryRequest.taskAssignee) &&
        Objects.equals(this.processInstanceId, historicActivityInstanceQueryRequest.processInstanceId) &&
        Objects.equals(this.processDefinitionId, historicActivityInstanceQueryRequest.processDefinitionId) &&
        Objects.equals(this.tenantId, historicActivityInstanceQueryRequest.tenantId) &&
        Objects.equals(this.tenantIdLike, historicActivityInstanceQueryRequest.tenantIdLike) &&
        Objects.equals(this.withoutTenantId, historicActivityInstanceQueryRequest.withoutTenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, size, sort, order, activityId, activityInstanceId, activityName, activityType, executionId, finished, taskAssignee, processInstanceId, processDefinitionId, tenantId, tenantIdLike, withoutTenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricActivityInstanceQueryRequest {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    taskAssignee: ").append(toIndentedString(taskAssignee)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantIdLike: ").append(toIndentedString(tenantIdLike)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
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


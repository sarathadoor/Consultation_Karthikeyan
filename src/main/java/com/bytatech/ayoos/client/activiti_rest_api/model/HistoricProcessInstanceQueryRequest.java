package com.bytatech.ayoos.client.activiti_rest_api.model;

import java.util.Objects;
import com.bytatech.ayoos.client.activiti_rest_api.model.QueryVariable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HistoricProcessInstanceQueryRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T17:01:52.038+05:30[Asia/Kolkata]")

public class HistoricProcessInstanceQueryRequest   {
  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("sort")
  private String sort = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processInstanceIds")
  @Valid
  private List<String> processInstanceIds = null;

  @JsonProperty("processBusinessKey")
  private String processBusinessKey = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("superProcessInstanceId")
  private String superProcessInstanceId = null;

  @JsonProperty("excludeSubprocesses")
  private Boolean excludeSubprocesses = false;

  @JsonProperty("finished")
  private Boolean finished = false;

  @JsonProperty("involvedUser")
  private String involvedUser = null;

  @JsonProperty("finishedAfter")
  private OffsetDateTime finishedAfter = null;

  @JsonProperty("finishedBefore")
  private OffsetDateTime finishedBefore = null;

  @JsonProperty("startedAfter")
  private OffsetDateTime startedAfter = null;

  @JsonProperty("startedBefore")
  private OffsetDateTime startedBefore = null;

  @JsonProperty("startedBy")
  private String startedBy = null;

  @JsonProperty("includeProcessVariables")
  private Boolean includeProcessVariables = false;

  @JsonProperty("variables")
  @Valid
  private List<QueryVariable> variables = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("tenantIdLike")
  private String tenantIdLike = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = false;

  public HistoricProcessInstanceQueryRequest start(Integer start) {
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

  public HistoricProcessInstanceQueryRequest size(Integer size) {
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

  public HistoricProcessInstanceQueryRequest sort(String sort) {
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

  public HistoricProcessInstanceQueryRequest order(String order) {
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

  public HistoricProcessInstanceQueryRequest processInstanceId(String processInstanceId) {
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

  public HistoricProcessInstanceQueryRequest processInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public HistoricProcessInstanceQueryRequest addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<String>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

  /**
   * Get processInstanceIds
   * @return processInstanceIds
  **/
  @ApiModelProperty(value = "")


  public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }

  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }

  public HistoricProcessInstanceQueryRequest processBusinessKey(String processBusinessKey) {
    this.processBusinessKey = processBusinessKey;
    return this;
  }

  /**
   * Get processBusinessKey
   * @return processBusinessKey
  **/
  @ApiModelProperty(value = "")


  public String getProcessBusinessKey() {
    return processBusinessKey;
  }

  public void setProcessBusinessKey(String processBusinessKey) {
    this.processBusinessKey = processBusinessKey;
  }

  public HistoricProcessInstanceQueryRequest processDefinitionId(String processDefinitionId) {
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

  public HistoricProcessInstanceQueryRequest processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * Get processDefinitionKey
   * @return processDefinitionKey
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricProcessInstanceQueryRequest superProcessInstanceId(String superProcessInstanceId) {
    this.superProcessInstanceId = superProcessInstanceId;
    return this;
  }

  /**
   * Get superProcessInstanceId
   * @return superProcessInstanceId
  **/
  @ApiModelProperty(value = "")


  public String getSuperProcessInstanceId() {
    return superProcessInstanceId;
  }

  public void setSuperProcessInstanceId(String superProcessInstanceId) {
    this.superProcessInstanceId = superProcessInstanceId;
  }

  public HistoricProcessInstanceQueryRequest excludeSubprocesses(Boolean excludeSubprocesses) {
    this.excludeSubprocesses = excludeSubprocesses;
    return this;
  }

  /**
   * Get excludeSubprocesses
   * @return excludeSubprocesses
  **/
  @ApiModelProperty(value = "")


  public Boolean isExcludeSubprocesses() {
    return excludeSubprocesses;
  }

  public void setExcludeSubprocesses(Boolean excludeSubprocesses) {
    this.excludeSubprocesses = excludeSubprocesses;
  }

  public HistoricProcessInstanceQueryRequest finished(Boolean finished) {
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

  public HistoricProcessInstanceQueryRequest involvedUser(String involvedUser) {
    this.involvedUser = involvedUser;
    return this;
  }

  /**
   * Get involvedUser
   * @return involvedUser
  **/
  @ApiModelProperty(value = "")


  public String getInvolvedUser() {
    return involvedUser;
  }

  public void setInvolvedUser(String involvedUser) {
    this.involvedUser = involvedUser;
  }

  public HistoricProcessInstanceQueryRequest finishedAfter(OffsetDateTime finishedAfter) {
    this.finishedAfter = finishedAfter;
    return this;
  }

  /**
   * Get finishedAfter
   * @return finishedAfter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getFinishedAfter() {
    return finishedAfter;
  }

  public void setFinishedAfter(OffsetDateTime finishedAfter) {
    this.finishedAfter = finishedAfter;
  }

  public HistoricProcessInstanceQueryRequest finishedBefore(OffsetDateTime finishedBefore) {
    this.finishedBefore = finishedBefore;
    return this;
  }

  /**
   * Get finishedBefore
   * @return finishedBefore
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getFinishedBefore() {
    return finishedBefore;
  }

  public void setFinishedBefore(OffsetDateTime finishedBefore) {
    this.finishedBefore = finishedBefore;
  }

  public HistoricProcessInstanceQueryRequest startedAfter(OffsetDateTime startedAfter) {
    this.startedAfter = startedAfter;
    return this;
  }

  /**
   * Get startedAfter
   * @return startedAfter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartedAfter() {
    return startedAfter;
  }

  public void setStartedAfter(OffsetDateTime startedAfter) {
    this.startedAfter = startedAfter;
  }

  public HistoricProcessInstanceQueryRequest startedBefore(OffsetDateTime startedBefore) {
    this.startedBefore = startedBefore;
    return this;
  }

  /**
   * Get startedBefore
   * @return startedBefore
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartedBefore() {
    return startedBefore;
  }

  public void setStartedBefore(OffsetDateTime startedBefore) {
    this.startedBefore = startedBefore;
  }

  public HistoricProcessInstanceQueryRequest startedBy(String startedBy) {
    this.startedBy = startedBy;
    return this;
  }

  /**
   * Get startedBy
   * @return startedBy
  **/
  @ApiModelProperty(value = "")


  public String getStartedBy() {
    return startedBy;
  }

  public void setStartedBy(String startedBy) {
    this.startedBy = startedBy;
  }

  public HistoricProcessInstanceQueryRequest includeProcessVariables(Boolean includeProcessVariables) {
    this.includeProcessVariables = includeProcessVariables;
    return this;
  }

  /**
   * Get includeProcessVariables
   * @return includeProcessVariables
  **/
  @ApiModelProperty(value = "")


  public Boolean isIncludeProcessVariables() {
    return includeProcessVariables;
  }

  public void setIncludeProcessVariables(Boolean includeProcessVariables) {
    this.includeProcessVariables = includeProcessVariables;
  }

  public HistoricProcessInstanceQueryRequest variables(List<QueryVariable> variables) {
    this.variables = variables;
    return this;
  }

  public HistoricProcessInstanceQueryRequest addVariablesItem(QueryVariable variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<QueryVariable>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * Get variables
   * @return variables
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<QueryVariable> getVariables() {
    return variables;
  }

  public void setVariables(List<QueryVariable> variables) {
    this.variables = variables;
  }

  public HistoricProcessInstanceQueryRequest tenantId(String tenantId) {
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

  public HistoricProcessInstanceQueryRequest tenantIdLike(String tenantIdLike) {
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

  public HistoricProcessInstanceQueryRequest withoutTenantId(Boolean withoutTenantId) {
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
    HistoricProcessInstanceQueryRequest historicProcessInstanceQueryRequest = (HistoricProcessInstanceQueryRequest) o;
    return Objects.equals(this.start, historicProcessInstanceQueryRequest.start) &&
        Objects.equals(this.size, historicProcessInstanceQueryRequest.size) &&
        Objects.equals(this.sort, historicProcessInstanceQueryRequest.sort) &&
        Objects.equals(this.order, historicProcessInstanceQueryRequest.order) &&
        Objects.equals(this.processInstanceId, historicProcessInstanceQueryRequest.processInstanceId) &&
        Objects.equals(this.processInstanceIds, historicProcessInstanceQueryRequest.processInstanceIds) &&
        Objects.equals(this.processBusinessKey, historicProcessInstanceQueryRequest.processBusinessKey) &&
        Objects.equals(this.processDefinitionId, historicProcessInstanceQueryRequest.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicProcessInstanceQueryRequest.processDefinitionKey) &&
        Objects.equals(this.superProcessInstanceId, historicProcessInstanceQueryRequest.superProcessInstanceId) &&
        Objects.equals(this.excludeSubprocesses, historicProcessInstanceQueryRequest.excludeSubprocesses) &&
        Objects.equals(this.finished, historicProcessInstanceQueryRequest.finished) &&
        Objects.equals(this.involvedUser, historicProcessInstanceQueryRequest.involvedUser) &&
        Objects.equals(this.finishedAfter, historicProcessInstanceQueryRequest.finishedAfter) &&
        Objects.equals(this.finishedBefore, historicProcessInstanceQueryRequest.finishedBefore) &&
        Objects.equals(this.startedAfter, historicProcessInstanceQueryRequest.startedAfter) &&
        Objects.equals(this.startedBefore, historicProcessInstanceQueryRequest.startedBefore) &&
        Objects.equals(this.startedBy, historicProcessInstanceQueryRequest.startedBy) &&
        Objects.equals(this.includeProcessVariables, historicProcessInstanceQueryRequest.includeProcessVariables) &&
        Objects.equals(this.variables, historicProcessInstanceQueryRequest.variables) &&
        Objects.equals(this.tenantId, historicProcessInstanceQueryRequest.tenantId) &&
        Objects.equals(this.tenantIdLike, historicProcessInstanceQueryRequest.tenantIdLike) &&
        Objects.equals(this.withoutTenantId, historicProcessInstanceQueryRequest.withoutTenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, size, sort, order, processInstanceId, processInstanceIds, processBusinessKey, processDefinitionId, processDefinitionKey, superProcessInstanceId, excludeSubprocesses, finished, involvedUser, finishedAfter, finishedBefore, startedAfter, startedBefore, startedBy, includeProcessVariables, variables, tenantId, tenantIdLike, withoutTenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricProcessInstanceQueryRequest {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    processBusinessKey: ").append(toIndentedString(processBusinessKey)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    superProcessInstanceId: ").append(toIndentedString(superProcessInstanceId)).append("\n");
    sb.append("    excludeSubprocesses: ").append(toIndentedString(excludeSubprocesses)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    involvedUser: ").append(toIndentedString(involvedUser)).append("\n");
    sb.append("    finishedAfter: ").append(toIndentedString(finishedAfter)).append("\n");
    sb.append("    finishedBefore: ").append(toIndentedString(finishedBefore)).append("\n");
    sb.append("    startedAfter: ").append(toIndentedString(startedAfter)).append("\n");
    sb.append("    startedBefore: ").append(toIndentedString(startedBefore)).append("\n");
    sb.append("    startedBy: ").append(toIndentedString(startedBy)).append("\n");
    sb.append("    includeProcessVariables: ").append(toIndentedString(includeProcessVariables)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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


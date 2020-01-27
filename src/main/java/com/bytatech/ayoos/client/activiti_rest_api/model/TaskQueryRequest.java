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
 * TaskQueryRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T17:01:52.038+05:30[Asia/Kolkata]")

public class TaskQueryRequest   {
  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("sort")
  private String sort = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nameLike")
  private String nameLike = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("descriptionLike")
  private String descriptionLike = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("minimumPriority")
  private Integer minimumPriority = null;

  @JsonProperty("maximumPriority")
  private Integer maximumPriority = null;

  @JsonProperty("assignee")
  private String assignee = null;

  @JsonProperty("assigneeLike")
  private String assigneeLike = null;

  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("ownerLike")
  private String ownerLike = null;

  @JsonProperty("unassigned")
  private Boolean unassigned = false;

  @JsonProperty("delegationState")
  private String delegationState = null;

  @JsonProperty("candidateUser")
  private String candidateUser = null;

  @JsonProperty("candidateGroup")
  private String candidateGroup = null;

  @JsonProperty("candidateGroupIn")
  @Valid
  private List<String> candidateGroupIn = null;

  @JsonProperty("involvedUser")
  private String involvedUser = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processInstanceBusinessKey")
  private String processInstanceBusinessKey = null;

  @JsonProperty("processInstanceBusinessKeyLike")
  private String processInstanceBusinessKeyLike = null;

  @JsonProperty("processInstanceIdIn")
  @Valid
  private List<String> processInstanceIdIn = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processDefinitionName")
  private String processDefinitionName = null;

  @JsonProperty("processDefinitionKeyLike")
  private String processDefinitionKeyLike = null;

  @JsonProperty("processDefinitionNameLike")
  private String processDefinitionNameLike = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("createdOn")
  private OffsetDateTime createdOn = null;

  @JsonProperty("createdBefore")
  private OffsetDateTime createdBefore = null;

  @JsonProperty("createdAfter")
  private OffsetDateTime createdAfter = null;

  @JsonProperty("excludeSubTasks")
  private Boolean excludeSubTasks = false;

  @JsonProperty("taskDefinitionKey")
  private String taskDefinitionKey = null;

  @JsonProperty("taskDefinitionKeyLike")
  private String taskDefinitionKeyLike = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("dueBefore")
  private OffsetDateTime dueBefore = null;

  @JsonProperty("dueAfter")
  private OffsetDateTime dueAfter = null;

  @JsonProperty("withoutDueDate")
  private Boolean withoutDueDate = false;

  @JsonProperty("active")
  private Boolean active = false;

  @JsonProperty("includeTaskLocalVariables")
  private Boolean includeTaskLocalVariables = false;

  @JsonProperty("includeProcessVariables")
  private Boolean includeProcessVariables = false;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("tenantIdLike")
  private String tenantIdLike = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = false;

  @JsonProperty("candidateOrAssigned")
  private String candidateOrAssigned = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("taskVariables")
  @Valid
  private List<QueryVariable> taskVariables = null;

  @JsonProperty("processInstanceVariables")
  @Valid
  private List<QueryVariable> processInstanceVariables = null;

  public TaskQueryRequest start(Integer start) {
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

  public TaskQueryRequest size(Integer size) {
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

  public TaskQueryRequest sort(String sort) {
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

  public TaskQueryRequest order(String order) {
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

  public TaskQueryRequest name(String name) {
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

  public TaskQueryRequest nameLike(String nameLike) {
    this.nameLike = nameLike;
    return this;
  }

  /**
   * Get nameLike
   * @return nameLike
  **/
  @ApiModelProperty(value = "")


  public String getNameLike() {
    return nameLike;
  }

  public void setNameLike(String nameLike) {
    this.nameLike = nameLike;
  }

  public TaskQueryRequest description(String description) {
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

  public TaskQueryRequest descriptionLike(String descriptionLike) {
    this.descriptionLike = descriptionLike;
    return this;
  }

  /**
   * Get descriptionLike
   * @return descriptionLike
  **/
  @ApiModelProperty(value = "")


  public String getDescriptionLike() {
    return descriptionLike;
  }

  public void setDescriptionLike(String descriptionLike) {
    this.descriptionLike = descriptionLike;
  }

  public TaskQueryRequest priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")


  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public TaskQueryRequest minimumPriority(Integer minimumPriority) {
    this.minimumPriority = minimumPriority;
    return this;
  }

  /**
   * Get minimumPriority
   * @return minimumPriority
  **/
  @ApiModelProperty(value = "")


  public Integer getMinimumPriority() {
    return minimumPriority;
  }

  public void setMinimumPriority(Integer minimumPriority) {
    this.minimumPriority = minimumPriority;
  }

  public TaskQueryRequest maximumPriority(Integer maximumPriority) {
    this.maximumPriority = maximumPriority;
    return this;
  }

  /**
   * Get maximumPriority
   * @return maximumPriority
  **/
  @ApiModelProperty(value = "")


  public Integer getMaximumPriority() {
    return maximumPriority;
  }

  public void setMaximumPriority(Integer maximumPriority) {
    this.maximumPriority = maximumPriority;
  }

  public TaskQueryRequest assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Get assignee
   * @return assignee
  **/
  @ApiModelProperty(value = "")


  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public TaskQueryRequest assigneeLike(String assigneeLike) {
    this.assigneeLike = assigneeLike;
    return this;
  }

  /**
   * Get assigneeLike
   * @return assigneeLike
  **/
  @ApiModelProperty(value = "")


  public String getAssigneeLike() {
    return assigneeLike;
  }

  public void setAssigneeLike(String assigneeLike) {
    this.assigneeLike = assigneeLike;
  }

  public TaskQueryRequest owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")


  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public TaskQueryRequest ownerLike(String ownerLike) {
    this.ownerLike = ownerLike;
    return this;
  }

  /**
   * Get ownerLike
   * @return ownerLike
  **/
  @ApiModelProperty(value = "")


  public String getOwnerLike() {
    return ownerLike;
  }

  public void setOwnerLike(String ownerLike) {
    this.ownerLike = ownerLike;
  }

  public TaskQueryRequest unassigned(Boolean unassigned) {
    this.unassigned = unassigned;
    return this;
  }

  /**
   * Get unassigned
   * @return unassigned
  **/
  @ApiModelProperty(value = "")


  public Boolean isUnassigned() {
    return unassigned;
  }

  public void setUnassigned(Boolean unassigned) {
    this.unassigned = unassigned;
  }

  public TaskQueryRequest delegationState(String delegationState) {
    this.delegationState = delegationState;
    return this;
  }

  /**
   * Get delegationState
   * @return delegationState
  **/
  @ApiModelProperty(value = "")


  public String getDelegationState() {
    return delegationState;
  }

  public void setDelegationState(String delegationState) {
    this.delegationState = delegationState;
  }

  public TaskQueryRequest candidateUser(String candidateUser) {
    this.candidateUser = candidateUser;
    return this;
  }

  /**
   * Get candidateUser
   * @return candidateUser
  **/
  @ApiModelProperty(value = "")


  public String getCandidateUser() {
    return candidateUser;
  }

  public void setCandidateUser(String candidateUser) {
    this.candidateUser = candidateUser;
  }

  public TaskQueryRequest candidateGroup(String candidateGroup) {
    this.candidateGroup = candidateGroup;
    return this;
  }

  /**
   * Get candidateGroup
   * @return candidateGroup
  **/
  @ApiModelProperty(value = "")


  public String getCandidateGroup() {
    return candidateGroup;
  }

  public void setCandidateGroup(String candidateGroup) {
    this.candidateGroup = candidateGroup;
  }

  public TaskQueryRequest candidateGroupIn(List<String> candidateGroupIn) {
    this.candidateGroupIn = candidateGroupIn;
    return this;
  }

  public TaskQueryRequest addCandidateGroupInItem(String candidateGroupInItem) {
    if (this.candidateGroupIn == null) {
      this.candidateGroupIn = new ArrayList<String>();
    }
    this.candidateGroupIn.add(candidateGroupInItem);
    return this;
  }

  /**
   * Get candidateGroupIn
   * @return candidateGroupIn
  **/
  @ApiModelProperty(value = "")


  public List<String> getCandidateGroupIn() {
    return candidateGroupIn;
  }

  public void setCandidateGroupIn(List<String> candidateGroupIn) {
    this.candidateGroupIn = candidateGroupIn;
  }

  public TaskQueryRequest involvedUser(String involvedUser) {
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

  public TaskQueryRequest processInstanceId(String processInstanceId) {
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

  public TaskQueryRequest processInstanceBusinessKey(String processInstanceBusinessKey) {
    this.processInstanceBusinessKey = processInstanceBusinessKey;
    return this;
  }

  /**
   * Get processInstanceBusinessKey
   * @return processInstanceBusinessKey
  **/
  @ApiModelProperty(value = "")


  public String getProcessInstanceBusinessKey() {
    return processInstanceBusinessKey;
  }

  public void setProcessInstanceBusinessKey(String processInstanceBusinessKey) {
    this.processInstanceBusinessKey = processInstanceBusinessKey;
  }

  public TaskQueryRequest processInstanceBusinessKeyLike(String processInstanceBusinessKeyLike) {
    this.processInstanceBusinessKeyLike = processInstanceBusinessKeyLike;
    return this;
  }

  /**
   * Get processInstanceBusinessKeyLike
   * @return processInstanceBusinessKeyLike
  **/
  @ApiModelProperty(value = "")


  public String getProcessInstanceBusinessKeyLike() {
    return processInstanceBusinessKeyLike;
  }

  public void setProcessInstanceBusinessKeyLike(String processInstanceBusinessKeyLike) {
    this.processInstanceBusinessKeyLike = processInstanceBusinessKeyLike;
  }

  public TaskQueryRequest processInstanceIdIn(List<String> processInstanceIdIn) {
    this.processInstanceIdIn = processInstanceIdIn;
    return this;
  }

  public TaskQueryRequest addProcessInstanceIdInItem(String processInstanceIdInItem) {
    if (this.processInstanceIdIn == null) {
      this.processInstanceIdIn = new ArrayList<String>();
    }
    this.processInstanceIdIn.add(processInstanceIdInItem);
    return this;
  }

  /**
   * Get processInstanceIdIn
   * @return processInstanceIdIn
  **/
  @ApiModelProperty(value = "")


  public List<String> getProcessInstanceIdIn() {
    return processInstanceIdIn;
  }

  public void setProcessInstanceIdIn(List<String> processInstanceIdIn) {
    this.processInstanceIdIn = processInstanceIdIn;
  }

  public TaskQueryRequest processDefinitionId(String processDefinitionId) {
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

  public TaskQueryRequest processDefinitionKey(String processDefinitionKey) {
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

  public TaskQueryRequest processDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
    return this;
  }

  /**
   * Get processDefinitionName
   * @return processDefinitionName
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionName() {
    return processDefinitionName;
  }

  public void setProcessDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
  }

  public TaskQueryRequest processDefinitionKeyLike(String processDefinitionKeyLike) {
    this.processDefinitionKeyLike = processDefinitionKeyLike;
    return this;
  }

  /**
   * Get processDefinitionKeyLike
   * @return processDefinitionKeyLike
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionKeyLike() {
    return processDefinitionKeyLike;
  }

  public void setProcessDefinitionKeyLike(String processDefinitionKeyLike) {
    this.processDefinitionKeyLike = processDefinitionKeyLike;
  }

  public TaskQueryRequest processDefinitionNameLike(String processDefinitionNameLike) {
    this.processDefinitionNameLike = processDefinitionNameLike;
    return this;
  }

  /**
   * Get processDefinitionNameLike
   * @return processDefinitionNameLike
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionNameLike() {
    return processDefinitionNameLike;
  }

  public void setProcessDefinitionNameLike(String processDefinitionNameLike) {
    this.processDefinitionNameLike = processDefinitionNameLike;
  }

  public TaskQueryRequest executionId(String executionId) {
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

  public TaskQueryRequest createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public TaskQueryRequest createdBefore(OffsetDateTime createdBefore) {
    this.createdBefore = createdBefore;
    return this;
  }

  /**
   * Get createdBefore
   * @return createdBefore
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatedBefore() {
    return createdBefore;
  }

  public void setCreatedBefore(OffsetDateTime createdBefore) {
    this.createdBefore = createdBefore;
  }

  public TaskQueryRequest createdAfter(OffsetDateTime createdAfter) {
    this.createdAfter = createdAfter;
    return this;
  }

  /**
   * Get createdAfter
   * @return createdAfter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatedAfter() {
    return createdAfter;
  }

  public void setCreatedAfter(OffsetDateTime createdAfter) {
    this.createdAfter = createdAfter;
  }

  public TaskQueryRequest excludeSubTasks(Boolean excludeSubTasks) {
    this.excludeSubTasks = excludeSubTasks;
    return this;
  }

  /**
   * Get excludeSubTasks
   * @return excludeSubTasks
  **/
  @ApiModelProperty(value = "")


  public Boolean isExcludeSubTasks() {
    return excludeSubTasks;
  }

  public void setExcludeSubTasks(Boolean excludeSubTasks) {
    this.excludeSubTasks = excludeSubTasks;
  }

  public TaskQueryRequest taskDefinitionKey(String taskDefinitionKey) {
    this.taskDefinitionKey = taskDefinitionKey;
    return this;
  }

  /**
   * Get taskDefinitionKey
   * @return taskDefinitionKey
  **/
  @ApiModelProperty(value = "")


  public String getTaskDefinitionKey() {
    return taskDefinitionKey;
  }

  public void setTaskDefinitionKey(String taskDefinitionKey) {
    this.taskDefinitionKey = taskDefinitionKey;
  }

  public TaskQueryRequest taskDefinitionKeyLike(String taskDefinitionKeyLike) {
    this.taskDefinitionKeyLike = taskDefinitionKeyLike;
    return this;
  }

  /**
   * Get taskDefinitionKeyLike
   * @return taskDefinitionKeyLike
  **/
  @ApiModelProperty(value = "")


  public String getTaskDefinitionKeyLike() {
    return taskDefinitionKeyLike;
  }

  public void setTaskDefinitionKeyLike(String taskDefinitionKeyLike) {
    this.taskDefinitionKeyLike = taskDefinitionKeyLike;
  }

  public TaskQueryRequest dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public TaskQueryRequest dueBefore(OffsetDateTime dueBefore) {
    this.dueBefore = dueBefore;
    return this;
  }

  /**
   * Get dueBefore
   * @return dueBefore
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDueBefore() {
    return dueBefore;
  }

  public void setDueBefore(OffsetDateTime dueBefore) {
    this.dueBefore = dueBefore;
  }

  public TaskQueryRequest dueAfter(OffsetDateTime dueAfter) {
    this.dueAfter = dueAfter;
    return this;
  }

  /**
   * Get dueAfter
   * @return dueAfter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDueAfter() {
    return dueAfter;
  }

  public void setDueAfter(OffsetDateTime dueAfter) {
    this.dueAfter = dueAfter;
  }

  public TaskQueryRequest withoutDueDate(Boolean withoutDueDate) {
    this.withoutDueDate = withoutDueDate;
    return this;
  }

  /**
   * Get withoutDueDate
   * @return withoutDueDate
  **/
  @ApiModelProperty(value = "")


  public Boolean isWithoutDueDate() {
    return withoutDueDate;
  }

  public void setWithoutDueDate(Boolean withoutDueDate) {
    this.withoutDueDate = withoutDueDate;
  }

  public TaskQueryRequest active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")


  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public TaskQueryRequest includeTaskLocalVariables(Boolean includeTaskLocalVariables) {
    this.includeTaskLocalVariables = includeTaskLocalVariables;
    return this;
  }

  /**
   * Get includeTaskLocalVariables
   * @return includeTaskLocalVariables
  **/
  @ApiModelProperty(value = "")


  public Boolean isIncludeTaskLocalVariables() {
    return includeTaskLocalVariables;
  }

  public void setIncludeTaskLocalVariables(Boolean includeTaskLocalVariables) {
    this.includeTaskLocalVariables = includeTaskLocalVariables;
  }

  public TaskQueryRequest includeProcessVariables(Boolean includeProcessVariables) {
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

  public TaskQueryRequest tenantId(String tenantId) {
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

  public TaskQueryRequest tenantIdLike(String tenantIdLike) {
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

  public TaskQueryRequest withoutTenantId(Boolean withoutTenantId) {
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

  public TaskQueryRequest candidateOrAssigned(String candidateOrAssigned) {
    this.candidateOrAssigned = candidateOrAssigned;
    return this;
  }

  /**
   * Get candidateOrAssigned
   * @return candidateOrAssigned
  **/
  @ApiModelProperty(value = "")


  public String getCandidateOrAssigned() {
    return candidateOrAssigned;
  }

  public void setCandidateOrAssigned(String candidateOrAssigned) {
    this.candidateOrAssigned = candidateOrAssigned;
  }

  public TaskQueryRequest category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public TaskQueryRequest taskVariables(List<QueryVariable> taskVariables) {
    this.taskVariables = taskVariables;
    return this;
  }

  public TaskQueryRequest addTaskVariablesItem(QueryVariable taskVariablesItem) {
    if (this.taskVariables == null) {
      this.taskVariables = new ArrayList<QueryVariable>();
    }
    this.taskVariables.add(taskVariablesItem);
    return this;
  }

  /**
   * Get taskVariables
   * @return taskVariables
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<QueryVariable> getTaskVariables() {
    return taskVariables;
  }

  public void setTaskVariables(List<QueryVariable> taskVariables) {
    this.taskVariables = taskVariables;
  }

  public TaskQueryRequest processInstanceVariables(List<QueryVariable> processInstanceVariables) {
    this.processInstanceVariables = processInstanceVariables;
    return this;
  }

  public TaskQueryRequest addProcessInstanceVariablesItem(QueryVariable processInstanceVariablesItem) {
    if (this.processInstanceVariables == null) {
      this.processInstanceVariables = new ArrayList<QueryVariable>();
    }
    this.processInstanceVariables.add(processInstanceVariablesItem);
    return this;
  }

  /**
   * Get processInstanceVariables
   * @return processInstanceVariables
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<QueryVariable> getProcessInstanceVariables() {
    return processInstanceVariables;
  }

  public void setProcessInstanceVariables(List<QueryVariable> processInstanceVariables) {
    this.processInstanceVariables = processInstanceVariables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskQueryRequest taskQueryRequest = (TaskQueryRequest) o;
    return Objects.equals(this.start, taskQueryRequest.start) &&
        Objects.equals(this.size, taskQueryRequest.size) &&
        Objects.equals(this.sort, taskQueryRequest.sort) &&
        Objects.equals(this.order, taskQueryRequest.order) &&
        Objects.equals(this.name, taskQueryRequest.name) &&
        Objects.equals(this.nameLike, taskQueryRequest.nameLike) &&
        Objects.equals(this.description, taskQueryRequest.description) &&
        Objects.equals(this.descriptionLike, taskQueryRequest.descriptionLike) &&
        Objects.equals(this.priority, taskQueryRequest.priority) &&
        Objects.equals(this.minimumPriority, taskQueryRequest.minimumPriority) &&
        Objects.equals(this.maximumPriority, taskQueryRequest.maximumPriority) &&
        Objects.equals(this.assignee, taskQueryRequest.assignee) &&
        Objects.equals(this.assigneeLike, taskQueryRequest.assigneeLike) &&
        Objects.equals(this.owner, taskQueryRequest.owner) &&
        Objects.equals(this.ownerLike, taskQueryRequest.ownerLike) &&
        Objects.equals(this.unassigned, taskQueryRequest.unassigned) &&
        Objects.equals(this.delegationState, taskQueryRequest.delegationState) &&
        Objects.equals(this.candidateUser, taskQueryRequest.candidateUser) &&
        Objects.equals(this.candidateGroup, taskQueryRequest.candidateGroup) &&
        Objects.equals(this.candidateGroupIn, taskQueryRequest.candidateGroupIn) &&
        Objects.equals(this.involvedUser, taskQueryRequest.involvedUser) &&
        Objects.equals(this.processInstanceId, taskQueryRequest.processInstanceId) &&
        Objects.equals(this.processInstanceBusinessKey, taskQueryRequest.processInstanceBusinessKey) &&
        Objects.equals(this.processInstanceBusinessKeyLike, taskQueryRequest.processInstanceBusinessKeyLike) &&
        Objects.equals(this.processInstanceIdIn, taskQueryRequest.processInstanceIdIn) &&
        Objects.equals(this.processDefinitionId, taskQueryRequest.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, taskQueryRequest.processDefinitionKey) &&
        Objects.equals(this.processDefinitionName, taskQueryRequest.processDefinitionName) &&
        Objects.equals(this.processDefinitionKeyLike, taskQueryRequest.processDefinitionKeyLike) &&
        Objects.equals(this.processDefinitionNameLike, taskQueryRequest.processDefinitionNameLike) &&
        Objects.equals(this.executionId, taskQueryRequest.executionId) &&
        Objects.equals(this.createdOn, taskQueryRequest.createdOn) &&
        Objects.equals(this.createdBefore, taskQueryRequest.createdBefore) &&
        Objects.equals(this.createdAfter, taskQueryRequest.createdAfter) &&
        Objects.equals(this.excludeSubTasks, taskQueryRequest.excludeSubTasks) &&
        Objects.equals(this.taskDefinitionKey, taskQueryRequest.taskDefinitionKey) &&
        Objects.equals(this.taskDefinitionKeyLike, taskQueryRequest.taskDefinitionKeyLike) &&
        Objects.equals(this.dueDate, taskQueryRequest.dueDate) &&
        Objects.equals(this.dueBefore, taskQueryRequest.dueBefore) &&
        Objects.equals(this.dueAfter, taskQueryRequest.dueAfter) &&
        Objects.equals(this.withoutDueDate, taskQueryRequest.withoutDueDate) &&
        Objects.equals(this.active, taskQueryRequest.active) &&
        Objects.equals(this.includeTaskLocalVariables, taskQueryRequest.includeTaskLocalVariables) &&
        Objects.equals(this.includeProcessVariables, taskQueryRequest.includeProcessVariables) &&
        Objects.equals(this.tenantId, taskQueryRequest.tenantId) &&
        Objects.equals(this.tenantIdLike, taskQueryRequest.tenantIdLike) &&
        Objects.equals(this.withoutTenantId, taskQueryRequest.withoutTenantId) &&
        Objects.equals(this.candidateOrAssigned, taskQueryRequest.candidateOrAssigned) &&
        Objects.equals(this.category, taskQueryRequest.category) &&
        Objects.equals(this.taskVariables, taskQueryRequest.taskVariables) &&
        Objects.equals(this.processInstanceVariables, taskQueryRequest.processInstanceVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, size, sort, order, name, nameLike, description, descriptionLike, priority, minimumPriority, maximumPriority, assignee, assigneeLike, owner, ownerLike, unassigned, delegationState, candidateUser, candidateGroup, candidateGroupIn, involvedUser, processInstanceId, processInstanceBusinessKey, processInstanceBusinessKeyLike, processInstanceIdIn, processDefinitionId, processDefinitionKey, processDefinitionName, processDefinitionKeyLike, processDefinitionNameLike, executionId, createdOn, createdBefore, createdAfter, excludeSubTasks, taskDefinitionKey, taskDefinitionKeyLike, dueDate, dueBefore, dueAfter, withoutDueDate, active, includeTaskLocalVariables, includeProcessVariables, tenantId, tenantIdLike, withoutTenantId, candidateOrAssigned, category, taskVariables, processInstanceVariables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskQueryRequest {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameLike: ").append(toIndentedString(nameLike)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionLike: ").append(toIndentedString(descriptionLike)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    minimumPriority: ").append(toIndentedString(minimumPriority)).append("\n");
    sb.append("    maximumPriority: ").append(toIndentedString(maximumPriority)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assigneeLike: ").append(toIndentedString(assigneeLike)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    ownerLike: ").append(toIndentedString(ownerLike)).append("\n");
    sb.append("    unassigned: ").append(toIndentedString(unassigned)).append("\n");
    sb.append("    delegationState: ").append(toIndentedString(delegationState)).append("\n");
    sb.append("    candidateUser: ").append(toIndentedString(candidateUser)).append("\n");
    sb.append("    candidateGroup: ").append(toIndentedString(candidateGroup)).append("\n");
    sb.append("    candidateGroupIn: ").append(toIndentedString(candidateGroupIn)).append("\n");
    sb.append("    involvedUser: ").append(toIndentedString(involvedUser)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceBusinessKey: ").append(toIndentedString(processInstanceBusinessKey)).append("\n");
    sb.append("    processInstanceBusinessKeyLike: ").append(toIndentedString(processInstanceBusinessKeyLike)).append("\n");
    sb.append("    processInstanceIdIn: ").append(toIndentedString(processInstanceIdIn)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionName: ").append(toIndentedString(processDefinitionName)).append("\n");
    sb.append("    processDefinitionKeyLike: ").append(toIndentedString(processDefinitionKeyLike)).append("\n");
    sb.append("    processDefinitionNameLike: ").append(toIndentedString(processDefinitionNameLike)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    createdBefore: ").append(toIndentedString(createdBefore)).append("\n");
    sb.append("    createdAfter: ").append(toIndentedString(createdAfter)).append("\n");
    sb.append("    excludeSubTasks: ").append(toIndentedString(excludeSubTasks)).append("\n");
    sb.append("    taskDefinitionKey: ").append(toIndentedString(taskDefinitionKey)).append("\n");
    sb.append("    taskDefinitionKeyLike: ").append(toIndentedString(taskDefinitionKeyLike)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    dueBefore: ").append(toIndentedString(dueBefore)).append("\n");
    sb.append("    dueAfter: ").append(toIndentedString(dueAfter)).append("\n");
    sb.append("    withoutDueDate: ").append(toIndentedString(withoutDueDate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    includeTaskLocalVariables: ").append(toIndentedString(includeTaskLocalVariables)).append("\n");
    sb.append("    includeProcessVariables: ").append(toIndentedString(includeProcessVariables)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantIdLike: ").append(toIndentedString(tenantIdLike)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    candidateOrAssigned: ").append(toIndentedString(candidateOrAssigned)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    taskVariables: ").append(toIndentedString(taskVariables)).append("\n");
    sb.append("    processInstanceVariables: ").append(toIndentedString(processInstanceVariables)).append("\n");
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


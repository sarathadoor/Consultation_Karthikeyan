package com.bytatech.ayoos.client.activiti_rest_api.model;

import java.util.Objects;
import com.bytatech.ayoos.client.activiti_rest_api.model.ExtensionAttribute;
import com.bytatech.ayoos.client.activiti_rest_api.model.ExtensionElement;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataSpec
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T17:01:52.038+05:30[Asia/Kolkata]")

public class DataSpec   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("xmlRowNumber")
  private Integer xmlRowNumber = null;

  @JsonProperty("xmlColumnNumber")
  private Integer xmlColumnNumber = null;

  @JsonProperty("extensionElements")
  @Valid
  private Map<String, List<ExtensionElement>> extensionElements = null;

  @JsonProperty("attributes")
  @Valid
  private Map<String, List<ExtensionAttribute>> attributes = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("itemSubjectRef")
  private String itemSubjectRef = null;

  @JsonProperty("collection")
  private Boolean collection = false;

  public DataSpec id(String id) {
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

  public DataSpec xmlRowNumber(Integer xmlRowNumber) {
    this.xmlRowNumber = xmlRowNumber;
    return this;
  }

  /**
   * Get xmlRowNumber
   * @return xmlRowNumber
  **/
  @ApiModelProperty(value = "")


  public Integer getXmlRowNumber() {
    return xmlRowNumber;
  }

  public void setXmlRowNumber(Integer xmlRowNumber) {
    this.xmlRowNumber = xmlRowNumber;
  }

  public DataSpec xmlColumnNumber(Integer xmlColumnNumber) {
    this.xmlColumnNumber = xmlColumnNumber;
    return this;
  }

  /**
   * Get xmlColumnNumber
   * @return xmlColumnNumber
  **/
  @ApiModelProperty(value = "")


  public Integer getXmlColumnNumber() {
    return xmlColumnNumber;
  }

  public void setXmlColumnNumber(Integer xmlColumnNumber) {
    this.xmlColumnNumber = xmlColumnNumber;
  }

  public DataSpec extensionElements(Map<String, List<ExtensionElement>> extensionElements) {
    this.extensionElements = extensionElements;
    return this;
  }

  public DataSpec putExtensionElementsItem(String key, List<ExtensionElement> extensionElementsItem) {
    if (this.extensionElements == null) {
      this.extensionElements = new HashMap<String, List<ExtensionElement>>();
    }
    this.extensionElements.put(key, extensionElementsItem);
    return this;
  }

  /**
   * Get extensionElements
   * @return extensionElements
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Map<String, List<ExtensionElement>> getExtensionElements() {
    return extensionElements;
  }

  public void setExtensionElements(Map<String, List<ExtensionElement>> extensionElements) {
    this.extensionElements = extensionElements;
  }

  public DataSpec attributes(Map<String, List<ExtensionAttribute>> attributes) {
    this.attributes = attributes;
    return this;
  }

  public DataSpec putAttributesItem(String key, List<ExtensionAttribute> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, List<ExtensionAttribute>>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Map<String, List<ExtensionAttribute>> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, List<ExtensionAttribute>> attributes) {
    this.attributes = attributes;
  }

  public DataSpec name(String name) {
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

  public DataSpec itemSubjectRef(String itemSubjectRef) {
    this.itemSubjectRef = itemSubjectRef;
    return this;
  }

  /**
   * Get itemSubjectRef
   * @return itemSubjectRef
  **/
  @ApiModelProperty(value = "")


  public String getItemSubjectRef() {
    return itemSubjectRef;
  }

  public void setItemSubjectRef(String itemSubjectRef) {
    this.itemSubjectRef = itemSubjectRef;
  }

  public DataSpec collection(Boolean collection) {
    this.collection = collection;
    return this;
  }

  /**
   * Get collection
   * @return collection
  **/
  @ApiModelProperty(value = "")


  public Boolean isCollection() {
    return collection;
  }

  public void setCollection(Boolean collection) {
    this.collection = collection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSpec dataSpec = (DataSpec) o;
    return Objects.equals(this.id, dataSpec.id) &&
        Objects.equals(this.xmlRowNumber, dataSpec.xmlRowNumber) &&
        Objects.equals(this.xmlColumnNumber, dataSpec.xmlColumnNumber) &&
        Objects.equals(this.extensionElements, dataSpec.extensionElements) &&
        Objects.equals(this.attributes, dataSpec.attributes) &&
        Objects.equals(this.name, dataSpec.name) &&
        Objects.equals(this.itemSubjectRef, dataSpec.itemSubjectRef) &&
        Objects.equals(this.collection, dataSpec.collection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, xmlRowNumber, xmlColumnNumber, extensionElements, attributes, name, itemSubjectRef, collection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSpec {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    xmlRowNumber: ").append(toIndentedString(xmlRowNumber)).append("\n");
    sb.append("    xmlColumnNumber: ").append(toIndentedString(xmlColumnNumber)).append("\n");
    sb.append("    extensionElements: ").append(toIndentedString(extensionElements)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    itemSubjectRef: ").append(toIndentedString(itemSubjectRef)).append("\n");
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
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


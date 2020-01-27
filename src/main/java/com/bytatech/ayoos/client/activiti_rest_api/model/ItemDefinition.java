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
 * ItemDefinition
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T17:01:52.038+05:30[Asia/Kolkata]")

public class ItemDefinition   {
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

  @JsonProperty("structureRef")
  private String structureRef = null;

  @JsonProperty("itemKind")
  private String itemKind = null;

  public ItemDefinition id(String id) {
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

  public ItemDefinition xmlRowNumber(Integer xmlRowNumber) {
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

  public ItemDefinition xmlColumnNumber(Integer xmlColumnNumber) {
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

  public ItemDefinition extensionElements(Map<String, List<ExtensionElement>> extensionElements) {
    this.extensionElements = extensionElements;
    return this;
  }

  public ItemDefinition putExtensionElementsItem(String key, List<ExtensionElement> extensionElementsItem) {
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

  public ItemDefinition attributes(Map<String, List<ExtensionAttribute>> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ItemDefinition putAttributesItem(String key, List<ExtensionAttribute> attributesItem) {
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

  public ItemDefinition structureRef(String structureRef) {
    this.structureRef = structureRef;
    return this;
  }

  /**
   * Get structureRef
   * @return structureRef
  **/
  @ApiModelProperty(value = "")


  public String getStructureRef() {
    return structureRef;
  }

  public void setStructureRef(String structureRef) {
    this.structureRef = structureRef;
  }

  public ItemDefinition itemKind(String itemKind) {
    this.itemKind = itemKind;
    return this;
  }

  /**
   * Get itemKind
   * @return itemKind
  **/
  @ApiModelProperty(value = "")


  public String getItemKind() {
    return itemKind;
  }

  public void setItemKind(String itemKind) {
    this.itemKind = itemKind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDefinition itemDefinition = (ItemDefinition) o;
    return Objects.equals(this.id, itemDefinition.id) &&
        Objects.equals(this.xmlRowNumber, itemDefinition.xmlRowNumber) &&
        Objects.equals(this.xmlColumnNumber, itemDefinition.xmlColumnNumber) &&
        Objects.equals(this.extensionElements, itemDefinition.extensionElements) &&
        Objects.equals(this.attributes, itemDefinition.attributes) &&
        Objects.equals(this.structureRef, itemDefinition.structureRef) &&
        Objects.equals(this.itemKind, itemDefinition.itemKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, xmlRowNumber, xmlColumnNumber, extensionElements, attributes, structureRef, itemKind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    xmlRowNumber: ").append(toIndentedString(xmlRowNumber)).append("\n");
    sb.append("    xmlColumnNumber: ").append(toIndentedString(xmlColumnNumber)).append("\n");
    sb.append("    extensionElements: ").append(toIndentedString(extensionElements)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    structureRef: ").append(toIndentedString(structureRef)).append("\n");
    sb.append("    itemKind: ").append(toIndentedString(itemKind)).append("\n");
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


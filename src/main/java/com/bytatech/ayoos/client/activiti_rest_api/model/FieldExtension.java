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
 * FieldExtension
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T17:01:52.038+05:30[Asia/Kolkata]")

public class FieldExtension   {
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

  @JsonProperty("fieldName")
  private String fieldName = null;

  @JsonProperty("stringValue")
  private String stringValue = null;

  @JsonProperty("expression")
  private String expression = null;

  public FieldExtension id(String id) {
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

  public FieldExtension xmlRowNumber(Integer xmlRowNumber) {
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

  public FieldExtension xmlColumnNumber(Integer xmlColumnNumber) {
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

  public FieldExtension extensionElements(Map<String, List<ExtensionElement>> extensionElements) {
    this.extensionElements = extensionElements;
    return this;
  }

  public FieldExtension putExtensionElementsItem(String key, List<ExtensionElement> extensionElementsItem) {
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

  public FieldExtension attributes(Map<String, List<ExtensionAttribute>> attributes) {
    this.attributes = attributes;
    return this;
  }

  public FieldExtension putAttributesItem(String key, List<ExtensionAttribute> attributesItem) {
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

  public FieldExtension fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Get fieldName
   * @return fieldName
  **/
  @ApiModelProperty(value = "")


  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public FieldExtension stringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  /**
   * Get stringValue
   * @return stringValue
  **/
  @ApiModelProperty(value = "")


  public String getStringValue() {
    return stringValue;
  }

  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }

  public FieldExtension expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Get expression
   * @return expression
  **/
  @ApiModelProperty(value = "")


  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldExtension fieldExtension = (FieldExtension) o;
    return Objects.equals(this.id, fieldExtension.id) &&
        Objects.equals(this.xmlRowNumber, fieldExtension.xmlRowNumber) &&
        Objects.equals(this.xmlColumnNumber, fieldExtension.xmlColumnNumber) &&
        Objects.equals(this.extensionElements, fieldExtension.extensionElements) &&
        Objects.equals(this.attributes, fieldExtension.attributes) &&
        Objects.equals(this.fieldName, fieldExtension.fieldName) &&
        Objects.equals(this.stringValue, fieldExtension.stringValue) &&
        Objects.equals(this.expression, fieldExtension.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, xmlRowNumber, xmlColumnNumber, extensionElements, attributes, fieldName, stringValue, expression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldExtension {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    xmlRowNumber: ").append(toIndentedString(xmlRowNumber)).append("\n");
    sb.append("    xmlColumnNumber: ").append(toIndentedString(xmlColumnNumber)).append("\n");
    sb.append("    extensionElements: ").append(toIndentedString(extensionElements)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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


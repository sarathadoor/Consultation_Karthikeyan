package com.bytatech.ayoos.client.activiti_rest_api.model;

import java.util.Objects;
import com.bytatech.ayoos.client.activiti_rest_api.model.DataSpec;
import com.bytatech.ayoos.client.activiti_rest_api.model.ExtensionAttribute;
import com.bytatech.ayoos.client.activiti_rest_api.model.ExtensionElement;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IOSpecification
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T17:01:52.038+05:30[Asia/Kolkata]")

public class IOSpecification   {
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

  @JsonProperty("dataInputs")
  @Valid
  private List<DataSpec> dataInputs = null;

  @JsonProperty("dataOutputs")
  @Valid
  private List<DataSpec> dataOutputs = null;

  @JsonProperty("dataInputRefs")
  @Valid
  private List<String> dataInputRefs = null;

  @JsonProperty("dataOutputRefs")
  @Valid
  private List<String> dataOutputRefs = null;

  public IOSpecification id(String id) {
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

  public IOSpecification xmlRowNumber(Integer xmlRowNumber) {
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

  public IOSpecification xmlColumnNumber(Integer xmlColumnNumber) {
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

  public IOSpecification extensionElements(Map<String, List<ExtensionElement>> extensionElements) {
    this.extensionElements = extensionElements;
    return this;
  }

  public IOSpecification putExtensionElementsItem(String key, List<ExtensionElement> extensionElementsItem) {
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

  public IOSpecification attributes(Map<String, List<ExtensionAttribute>> attributes) {
    this.attributes = attributes;
    return this;
  }

  public IOSpecification putAttributesItem(String key, List<ExtensionAttribute> attributesItem) {
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

  public IOSpecification dataInputs(List<DataSpec> dataInputs) {
    this.dataInputs = dataInputs;
    return this;
  }

  public IOSpecification addDataInputsItem(DataSpec dataInputsItem) {
    if (this.dataInputs == null) {
      this.dataInputs = new ArrayList<DataSpec>();
    }
    this.dataInputs.add(dataInputsItem);
    return this;
  }

  /**
   * Get dataInputs
   * @return dataInputs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DataSpec> getDataInputs() {
    return dataInputs;
  }

  public void setDataInputs(List<DataSpec> dataInputs) {
    this.dataInputs = dataInputs;
  }

  public IOSpecification dataOutputs(List<DataSpec> dataOutputs) {
    this.dataOutputs = dataOutputs;
    return this;
  }

  public IOSpecification addDataOutputsItem(DataSpec dataOutputsItem) {
    if (this.dataOutputs == null) {
      this.dataOutputs = new ArrayList<DataSpec>();
    }
    this.dataOutputs.add(dataOutputsItem);
    return this;
  }

  /**
   * Get dataOutputs
   * @return dataOutputs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DataSpec> getDataOutputs() {
    return dataOutputs;
  }

  public void setDataOutputs(List<DataSpec> dataOutputs) {
    this.dataOutputs = dataOutputs;
  }

  public IOSpecification dataInputRefs(List<String> dataInputRefs) {
    this.dataInputRefs = dataInputRefs;
    return this;
  }

  public IOSpecification addDataInputRefsItem(String dataInputRefsItem) {
    if (this.dataInputRefs == null) {
      this.dataInputRefs = new ArrayList<String>();
    }
    this.dataInputRefs.add(dataInputRefsItem);
    return this;
  }

  /**
   * Get dataInputRefs
   * @return dataInputRefs
  **/
  @ApiModelProperty(value = "")


  public List<String> getDataInputRefs() {
    return dataInputRefs;
  }

  public void setDataInputRefs(List<String> dataInputRefs) {
    this.dataInputRefs = dataInputRefs;
  }

  public IOSpecification dataOutputRefs(List<String> dataOutputRefs) {
    this.dataOutputRefs = dataOutputRefs;
    return this;
  }

  public IOSpecification addDataOutputRefsItem(String dataOutputRefsItem) {
    if (this.dataOutputRefs == null) {
      this.dataOutputRefs = new ArrayList<String>();
    }
    this.dataOutputRefs.add(dataOutputRefsItem);
    return this;
  }

  /**
   * Get dataOutputRefs
   * @return dataOutputRefs
  **/
  @ApiModelProperty(value = "")


  public List<String> getDataOutputRefs() {
    return dataOutputRefs;
  }

  public void setDataOutputRefs(List<String> dataOutputRefs) {
    this.dataOutputRefs = dataOutputRefs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IOSpecification ioSpecification = (IOSpecification) o;
    return Objects.equals(this.id, ioSpecification.id) &&
        Objects.equals(this.xmlRowNumber, ioSpecification.xmlRowNumber) &&
        Objects.equals(this.xmlColumnNumber, ioSpecification.xmlColumnNumber) &&
        Objects.equals(this.extensionElements, ioSpecification.extensionElements) &&
        Objects.equals(this.attributes, ioSpecification.attributes) &&
        Objects.equals(this.dataInputs, ioSpecification.dataInputs) &&
        Objects.equals(this.dataOutputs, ioSpecification.dataOutputs) &&
        Objects.equals(this.dataInputRefs, ioSpecification.dataInputRefs) &&
        Objects.equals(this.dataOutputRefs, ioSpecification.dataOutputRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, xmlRowNumber, xmlColumnNumber, extensionElements, attributes, dataInputs, dataOutputs, dataInputRefs, dataOutputRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IOSpecification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    xmlRowNumber: ").append(toIndentedString(xmlRowNumber)).append("\n");
    sb.append("    xmlColumnNumber: ").append(toIndentedString(xmlColumnNumber)).append("\n");
    sb.append("    extensionElements: ").append(toIndentedString(extensionElements)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    dataInputs: ").append(toIndentedString(dataInputs)).append("\n");
    sb.append("    dataOutputs: ").append(toIndentedString(dataOutputs)).append("\n");
    sb.append("    dataInputRefs: ").append(toIndentedString(dataInputRefs)).append("\n");
    sb.append("    dataOutputRefs: ").append(toIndentedString(dataOutputRefs)).append("\n");
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


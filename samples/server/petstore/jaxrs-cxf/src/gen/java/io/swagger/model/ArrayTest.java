package io.swagger.model;

import io.swagger.model.ReadOnlyFirst;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ArrayTest  {
  
  @ApiModelProperty(value = "")
  private List<String> arrayOfString = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<List<Long>> arrayArrayOfInteger = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<List<ReadOnlyFirst>> arrayArrayOfModel = null;
 /**
   * Get arrayOfString
   * @return arrayOfString
  **/
  @JsonProperty("array_of_string")
  public List<String> getArrayOfString() {
    return arrayOfString;
  }

  public void setArrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
  }

  public ArrayTest arrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
    return this;
  }

  public ArrayTest addArrayOfStringItem(String arrayOfStringItem) {
    this.arrayOfString.add(arrayOfStringItem);
    return this;
  }

 /**
   * Get arrayArrayOfInteger
   * @return arrayArrayOfInteger
  **/
  @JsonProperty("array_array_of_integer")
  public List<List<Long>> getArrayArrayOfInteger() {
    return arrayArrayOfInteger;
  }

  public void setArrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
  }

  public ArrayTest arrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
    return this;
  }

  public ArrayTest addArrayArrayOfIntegerItem(List<Long> arrayArrayOfIntegerItem) {
    this.arrayArrayOfInteger.add(arrayArrayOfIntegerItem);
    return this;
  }

 /**
   * Get arrayArrayOfModel
   * @return arrayArrayOfModel
  **/
  @JsonProperty("array_array_of_model")
  public List<List<ReadOnlyFirst>> getArrayArrayOfModel() {
    return arrayArrayOfModel;
  }

  public void setArrayArrayOfModel(List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
  }

  public ArrayTest arrayArrayOfModel(List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
    return this;
  }

  public ArrayTest addArrayArrayOfModelItem(List<ReadOnlyFirst> arrayArrayOfModelItem) {
    this.arrayArrayOfModel.add(arrayArrayOfModelItem);
    return this;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayTest arrayTest = (ArrayTest) o;
    return Objects.equals(arrayOfString, arrayTest.arrayOfString) &&
        Objects.equals(arrayArrayOfInteger, arrayTest.arrayArrayOfInteger) &&
        Objects.equals(arrayArrayOfModel, arrayTest.arrayArrayOfModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayOfString, arrayArrayOfInteger, arrayArrayOfModel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayTest {\n");
    
    sb.append("    arrayOfString: ").append(toIndentedString(arrayOfString)).append("\n");
    sb.append("    arrayArrayOfInteger: ").append(toIndentedString(arrayArrayOfInteger)).append("\n");
    sb.append("    arrayArrayOfModel: ").append(toIndentedString(arrayArrayOfModel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


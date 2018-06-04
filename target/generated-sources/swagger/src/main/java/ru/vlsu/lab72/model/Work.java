package ru.vlsu.lab72.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import javax.xml.bind.annotation.*;

/**
 * Work
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-21T15:09:33.921+03:00")
@JacksonXmlRootElement(localName = "Work")
@XmlRootElement(name = "Work")
@XmlAccessorType(XmlAccessType.FIELD)
public class Work  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  @JacksonXmlProperty(localName = "id")
  private Long id = null;

  @JsonProperty("workType")
  @JacksonXmlProperty(localName = "workType")
  private String workType = null;

  @JsonProperty("hours")
  @JacksonXmlProperty(localName = "hours")
  private Integer hours = null;

  @JsonProperty("semesters")
  @JacksonXmlProperty(localName = "semesters")
  private List<Integer> semesters = null;

  public Work id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Work workType(String workType) {
    this.workType = workType;
    return this;
  }

   /**
   * Get workType
   * @return workType
  **/
  @ApiModelProperty(value = "")


  public String getWorkType() {
    return workType;
  }

  public void setWorkType(String workType) {
    this.workType = workType;
  }

  public Work hours(Integer hours) {
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  @ApiModelProperty(value = "")


  public Integer getHours() {
    return hours;
  }

  public void setHours(Integer hours) {
    this.hours = hours;
  }

  public Work semesters(List<Integer> semesters) {
    this.semesters = semesters;
    return this;
  }

  public Work addSemestersItem(Integer semestersItem) {
    if (this.semesters == null) {
      this.semesters = new ArrayList<Integer>();
    }
    this.semesters.add(semestersItem);
    return this;
  }

   /**
   * Get semesters
   * @return semesters
  **/
  @ApiModelProperty(value = "")


  public List<Integer> getSemesters() {
    return semesters;
  }

  public void setSemesters(List<Integer> semesters) {
    this.semesters = semesters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Work work = (Work) o;
    return Objects.equals(this.id, work.id) &&
        Objects.equals(this.workType, work.workType) &&
        Objects.equals(this.hours, work.hours) &&
        Objects.equals(this.semesters, work.semesters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workType, hours, semesters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Work {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workType: ").append(toIndentedString(workType)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    semesters: ").append(toIndentedString(semesters)).append("\n");
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


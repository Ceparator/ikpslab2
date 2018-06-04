package ru.vlsu.lab72.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import ru.vlsu.lab72.model.Discipline;
import ru.vlsu.lab72.model.Question;
import ru.vlsu.lab72.model.Speciality;
import ru.vlsu.lab72.model.Work;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import javax.xml.bind.annotation.*;

/**
 * YMK
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-21T15:09:33.921+03:00")
@JacksonXmlRootElement(localName = "YMK")
@XmlRootElement(name = "YMK")
@XmlAccessorType(XmlAccessType.FIELD)
public class YMK  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  @JacksonXmlProperty(localName = "id")
  private Long id = null;

  @JsonProperty("discipline")
  @JacksonXmlProperty(localName = "discipline")
  private Discipline discipline = null;

  @JsonProperty("speciality")
  @JacksonXmlProperty(localName = "speciality")
  private Speciality speciality = null;

  @JsonProperty("questions")
  @JacksonXmlProperty(localName = "questions")
  private List<Question> questions = null;

  @JsonProperty("works")
  @JacksonXmlProperty(localName = "works")
  private List<Work> works = null;

  public YMK id(Long id) {
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

  public YMK discipline(Discipline discipline) {
    this.discipline = discipline;
    return this;
  }

   /**
   * Get discipline
   * @return discipline
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Discipline getDiscipline() {
    return discipline;
  }

  public void setDiscipline(Discipline discipline) {
    this.discipline = discipline;
  }

  public YMK speciality(Speciality speciality) {
    this.speciality = speciality;
    return this;
  }

   /**
   * Get speciality
   * @return speciality
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Speciality getSpeciality() {
    return speciality;
  }

  public void setSpeciality(Speciality speciality) {
    this.speciality = speciality;
  }

  public YMK questions(List<Question> questions) {
    this.questions = questions;
    return this;
  }

  public YMK addQuestionsItem(Question questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<Question>();
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * Get questions
   * @return questions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }

  public YMK works(List<Work> works) {
    this.works = works;
    return this;
  }

  public YMK addWorksItem(Work worksItem) {
    if (this.works == null) {
      this.works = new ArrayList<Work>();
    }
    this.works.add(worksItem);
    return this;
  }

   /**
   * Get works
   * @return works
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Work> getWorks() {
    return works;
  }

  public void setWorks(List<Work> works) {
    this.works = works;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YMK YMK = (YMK) o;
    return Objects.equals(this.id, YMK.id) &&
        Objects.equals(this.discipline, YMK.discipline) &&
        Objects.equals(this.speciality, YMK.speciality) &&
        Objects.equals(this.questions, YMK.questions) &&
        Objects.equals(this.works, YMK.works);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, discipline, speciality, questions, works);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YMK {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    discipline: ").append(toIndentedString(discipline)).append("\n");
    sb.append("    speciality: ").append(toIndentedString(speciality)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    works: ").append(toIndentedString(works)).append("\n");
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


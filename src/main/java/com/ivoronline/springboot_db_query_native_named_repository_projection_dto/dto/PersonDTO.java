package com.ivoronline.springboot_db_query_native_named_repository_projection_dto.dto;

public class PersonDTO {

  //PROPERTIES
  public String  name;
  public Integer age;

  //CONSTRUCTORS
  public PersonDTO() {}
  public PersonDTO(String  name, Integer age) {
    this.name = name;
    this.age  = age;
  }

}

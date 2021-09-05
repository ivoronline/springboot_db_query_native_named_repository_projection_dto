package com.ivoronline.springboot_db_query_native_named_repository_projection_dto.entities;

import com.ivoronline.springboot_db_query_native_named_repository_projection_dto.dto.PersonDTO;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;

@SqlResultSetMapping(
  name    = "PersonDTOMapping",
  classes = @ConstructorResult(
    targetClass = PersonDTO.class,
    columns     = {
        @ColumnResult(name = "name"),
        @ColumnResult(name = "age" )
    }
  )
)
@NamedNativeQuery(
  name             = "Person.selectPersonByNameAge",
  query            = "SELECT name, age FROM Person WHERE name = :name",
  resultSetMapping = "PersonDTOMapping"
)
@Entity
public class Person {

  //PROPERTIES
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;

}



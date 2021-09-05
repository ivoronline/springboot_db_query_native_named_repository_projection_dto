package com.ivoronline.springboot_db_query_native_named_repository_projection_dto.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivoronline.springboot_db_query_native_named_repository_projection_dto.dto.PersonDTO;
import com.ivoronline.springboot_db_query_native_named_repository_projection_dto.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // SELECT PERSON BY NAME AGE
  //================================================================
  @RequestMapping("SelectPersonByNameAge")
  PersonDTO selectPersonByNameAge() throws JsonProcessingException {
    PersonDTO personDTO = personRepository.selectPersonByNameAge("John");
    System.out.println(new ObjectMapper().writeValueAsString(personDTO));
    return    personDTO;
  }

}



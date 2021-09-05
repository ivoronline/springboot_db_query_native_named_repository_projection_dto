package com.ivoronline.springboot_db_query_native_named_repository_projection_dto.repositories;

import com.ivoronline.springboot_db_query_native_named_repository_projection_dto.dto.PersonDTO;
import com.ivoronline.springboot_db_query_native_named_repository_projection_dto.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  @Query(nativeQuery=true)
  PersonDTO selectPersonByNameAge(String name);
}



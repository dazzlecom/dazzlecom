package com.backend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.backend.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByLastName(@Param("lastname") String lastname);

	List<User> findByFirstName(@Param("firstname") String firstname);

}

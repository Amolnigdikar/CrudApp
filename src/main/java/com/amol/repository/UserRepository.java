package com.amol.repository;

import org.springframework.data.repository.CrudRepository;

import com.amol.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

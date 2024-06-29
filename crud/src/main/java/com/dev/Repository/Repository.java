package com.dev.Repository;

import org.springframework.data.repository.CrudRepository;

import com.dev.Entity.User;

@org.springframework.stereotype.Repository
public interface Repository {

	public interface UserRepository extends CrudRepository<User, Long> {

	}
}

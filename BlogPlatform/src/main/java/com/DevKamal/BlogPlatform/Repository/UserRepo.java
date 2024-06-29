package com.DevKamal.BlogPlatform.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevKamal.BlogPlatform.Entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}

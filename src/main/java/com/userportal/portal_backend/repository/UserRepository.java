package com.userportal.portal_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userportal.portal_backend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

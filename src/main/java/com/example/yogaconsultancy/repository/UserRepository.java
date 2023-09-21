package com.example.yogaconsultancy.repository;

import com.example.yogaconsultancy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

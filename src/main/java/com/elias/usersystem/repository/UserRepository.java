package com.elias.usersystem.repository;

import com.elias.usersystem.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user, Long> {
}
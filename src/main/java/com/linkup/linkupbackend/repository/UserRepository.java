package com.linkup.linkupbackend.repository;

import com.linkup.linkupbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

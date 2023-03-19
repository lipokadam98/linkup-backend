package com.linkup.linkupbackend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "username")
    @NotBlank(message = "Username field must not be empty")
    private String username;

    @Basic
    @Column(name = "email")
    @NotBlank(message = "Email field must not be empty")
    @Email(message = "Email must be a valid email")
    private String email;

    @Basic
    @Column(name = "password")
    @NotBlank(message = "Password field must not be empty")
    @NotBlank
    private String password;

    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;

    @Basic
    @Column(name = "updated_at")
    private Timestamp updatedAt;
}

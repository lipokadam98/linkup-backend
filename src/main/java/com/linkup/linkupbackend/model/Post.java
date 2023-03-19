package com.linkup.linkupbackend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "title")
    @NotBlank(message = "Title is mandatory")
    private String title;
    @Basic
    @Column(name = "detail")
    @NotBlank(message = "Detail is mandatory")
    private String detail;

    @Basic
    @Column(name = "user_id")
    @NotNull(message = "UserId is required")
    private Long userId;

    @JoinColumn(name = "user_id", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "fk_user_id"))
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;

    @Basic
    @Column(name = "updated_at")
    private Timestamp updatedAt;
}

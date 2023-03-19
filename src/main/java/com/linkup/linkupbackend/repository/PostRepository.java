package com.linkup.linkupbackend.repository;

import com.linkup.linkupbackend.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}

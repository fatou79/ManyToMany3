package com.fatou.ManyToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatou.ManyToMany.entity.Post;

@Repository
public interface PostRepository  extends  JpaRepository<Post, Long>{

}

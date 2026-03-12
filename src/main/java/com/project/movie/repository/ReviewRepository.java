package com.project.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.movie.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{
	
}
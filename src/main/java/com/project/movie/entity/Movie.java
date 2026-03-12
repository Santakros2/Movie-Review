package com.project.movie.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "movies")
@Getter
@Setter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 1000)
    private String description;

    private String genre;

    private LocalDate releaseDate;

    private String language;

    private Integer duration;

    private String director;

    private String posterUrl;

    private Double averageRating;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    // Relationship with Review
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Review> reviews;

    // getters and setters
}
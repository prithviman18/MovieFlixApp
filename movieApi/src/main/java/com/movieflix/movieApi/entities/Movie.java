package com.movieflix.movieApi.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @Column(nullable = false,length = 200)
    @NotBlank(message = "Please Provide the movie title")
    private String title;
    @Column(nullable = false)
    @NotBlank(message = "Please Provide the movie director")
    private String director;
    @Column(nullable = false)
    @NotBlank(message = "Please Provide the movie studio")
    private String studio;

    @ElementCollection
    @CollectionTable(name = "movie_cast")
    private Set<String> movieCast;
    @Column(nullable = false)

    private Integer releaseYear;
    @Column(nullable = false)
    @NotBlank(message = "Please Provide the movie's poster")
    private String poster;
}

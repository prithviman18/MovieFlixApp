package com.movieflix.movieApi.dto;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {
    private Integer movieId;

    @NotBlank(message = "Please Provide the movie title")
    private String title;
    @NotBlank(message = "Please Provide the movie director")
    private String director;
    @NotBlank(message = "Please Provide the movie studio")
    private String studio;

    private Set<String> movieCast;

    private Integer releaseYear;

    @NotBlank(message = "Please Provide the movie's poster")
    private String poster;
    @NotBlank(message = "Please Provide poster's url")
    private String posterUrl;

}

package com.devpm.jproject.dto;


import com.devpm.jproject.entities.Movie;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MovieDTO {

    private Long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;

    public MovieDTO() {
    }

    public MovieDTO(Long id, String title, Double score, Integer count, String image) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.count = count;
        this.image = image;
    }

    public MovieDTO(Movie movie) {
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.score = movie.getScore();
        this.count = movie.getCount();
        this.image = movie.getImage();
    }
}

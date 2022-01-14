package com.devpm.jproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter

@Entity
@Table(name = "tb_score")
public class Score {

    @EmbeddedId
    private ScorePk id = new ScorePk();
    private Double value;

    public Score() {
    }

     public void setMovie(Movie movie){
        id.setMovie(movie);
     }

     public void  setUser(User user){
        id.setUser(user);
     }
}

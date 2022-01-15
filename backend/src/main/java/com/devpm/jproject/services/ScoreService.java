package com.devpm.jproject.services;


import com.devpm.jproject.dto.MovieDTO;
import com.devpm.jproject.dto.ScoreDTO;
import com.devpm.jproject.entities.Movie;
import com.devpm.jproject.entities.Score;
import com.devpm.jproject.entities.User;
import com.devpm.jproject.repositories.MovieRepository;
import com.devpm.jproject.repositories.ScoreRepository;
import com.devpm.jproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ScoreService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public MovieDTO saveScore(ScoreDTO dto){
        User user = userRepository.findByEmail(dto.getEmail());
        if(user == null){
            user = new User();
            user.setEmail(dto.getEmail());
            user = userRepository.saveAndFlush(user);
        }

        Movie movie = movieRepository.findById(dto.getMovieId()).get();

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(dto.getScore());


        score = scoreRepository.saveAndFlush(score);

        double res = 0.0;
        for( Score s : movie.getScores()){
            res = res + s.getValue();
        }

        double avg = res / movie.getScores().size();

        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        movie = movieRepository.save(movie);


        return new MovieDTO(movie);
    }


}

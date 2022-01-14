package com.devpm.jproject.controllers;

import com.devpm.jproject.dto.MovieDTO;
import com.devpm.jproject.dto.ScoreDTO;
import com.devpm.jproject.services.MovieService;
import com.devpm.jproject.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto){
        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }
}

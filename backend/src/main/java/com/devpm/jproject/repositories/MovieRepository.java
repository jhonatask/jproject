package com.devpm.jproject.repositories;

import com.devpm.jproject.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}

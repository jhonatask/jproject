package com.devpm.jproject.repositories;

import com.devpm.jproject.entities.Score;
import com.devpm.jproject.entities.ScorePk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {
}

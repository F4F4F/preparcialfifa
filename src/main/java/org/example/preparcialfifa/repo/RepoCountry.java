package org.example.preparcialfifa.repo;

import org.example.preparcialfifa.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoCountry extends JpaRepository<Country, Integer> {
    List<Country> findTop6ByOrderByPlayers_fifaScoreDesc();
}

package org.example.preparcialfifa.service;

import lombok.RequiredArgsConstructor;
import org.example.preparcialfifa.model.Country;
import org.example.preparcialfifa.model.Match;
import org.example.preparcialfifa.repo.RepoCountry;
import org.example.preparcialfifa.repo.RepoMatch;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class CountryService {

        private final RepoCountry repoCountry;

        public List<Country> consulta5() {
            return repoCountry.findTop6ByOrderByPlayers_fifaScoreDesc();
        }
}

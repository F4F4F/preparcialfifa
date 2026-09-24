package org.example.preparcialfifa.service;

import lombok.RequiredArgsConstructor;
import org.example.preparcialfifa.model.Match;
import org.example.preparcialfifa.repo.RepoMatch;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MatchService {

    private final RepoMatch repoMatch;

    public List<Match> consulta3(String clubname) {
        return repoMatch.findDistinctByHomecountry_Players_Playerclubs_Clubplayer_NameAndHomecountry_Players_Playerclubs_EndDateIsNull(clubname);
    }
}

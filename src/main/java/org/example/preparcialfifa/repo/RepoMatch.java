package org.example.preparcialfifa.repo;

import org.example.preparcialfifa.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoMatch extends JpaRepository<Match, Integer> {
    List<Match>
    findDistinctByHomecountry_Players_Playerclubs_Clubplayer_NameAndHomecountry_Players_Playerclubs_EndDateIsNull
            (String clubname);
}

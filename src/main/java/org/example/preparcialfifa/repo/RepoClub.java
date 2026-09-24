package org.example.preparcialfifa.repo;

import org.example.preparcialfifa.model.Club;
import org.example.preparcialfifa.model.Country;
import org.example.preparcialfifa.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoClub extends JpaRepository<Club, Integer> {


    List<Club>
    findDistinctByClubsplayers_playerclub_playercountry_homematches_idOrClubsplayers_playerclub_playercountry_awaymatches_id
            (Integer idmatch1, Integer idmatch2);
    ;
}

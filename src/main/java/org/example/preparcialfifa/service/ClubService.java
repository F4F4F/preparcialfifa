package org.example.preparcialfifa.service;

import lombok.RequiredArgsConstructor;
import org.example.preparcialfifa.model.Club;
import org.example.preparcialfifa.model.Match;
import org.example.preparcialfifa.repo.RepoClub;
import org.example.preparcialfifa.repo.RepoMatch;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ClubService {


    private final RepoClub repoClub;

        public List<Club> consulta4(Integer matchid1, Integer matchid2) {
            return repoClub.findDistinctByClubsplayers_playerclub_playercountry_homematches_idOrClubsplayers_playerclub_playercountry_awaymatches_id(matchid1,matchid2);
        }
}

package org.example.preparcialfifa.repo;

import org.example.preparcialfifa.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoPlayer extends JpaRepository<Player, Integer> {

    List<Player>
    findDistinctByPlayerclubs_Clubplayer_Name
            (String clubname);

    List<Player>
    findDistinctByPlayercountry_NameAndPlayerclubs_Clubplayer_Name

            (String countryname,String clubname);
}

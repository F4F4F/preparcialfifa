package org.example.preparcialfifa.service;

import lombok.RequiredArgsConstructor;
import org.example.preparcialfifa.model.Player;
import org.example.preparcialfifa.repo.RepoPlayer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class Playerservice {

    private final RepoPlayer repoPlayer;


    public List<Player> consulta1(String clubname)
    {
        return repoPlayer.findDistinctByPlayerclubs_Clubplayer_Name(clubname);

    }

    public List<Player> consulta2(String countryname, String clubname)
    {
        return repoPlayer.findDistinctByPlayercountry_NameAndPlayerclubs_Clubplayer_Name(countryname,clubname);

    }
}

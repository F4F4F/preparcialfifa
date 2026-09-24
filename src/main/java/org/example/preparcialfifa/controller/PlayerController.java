package org.example.preparcialfifa.controller;

import lombok.RequiredArgsConstructor;
import org.example.preparcialfifa.model.Player;
import org.example.preparcialfifa.service.Playerservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/players")
@RequiredArgsConstructor
public class PlayerController {

    private final Playerservice playerservice;

    @GetMapping("/consulta1")
    public List<Player> consulta1() {

        return playerservice.consulta1(
                "Real Madrid"
        );


    }

    @GetMapping("/consulta2")
    public List<Player> consulta2() {

        return playerservice.consulta2(
                "Colombia","Bayern Munich"
        );


    }

}

package org.example.preparcialfifa.controller;

import lombok.RequiredArgsConstructor;
import org.example.preparcialfifa.model.Match;
import org.example.preparcialfifa.service.MatchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
    @RestController
    @RequestMapping("/match")
    @RequiredArgsConstructor
    public class MatchController {

        private final MatchService matchService;

        @GetMapping("/consulta3")
        public List<Match> consulta3() {

            return matchService.consulta3(
                    "Bayern Munich"
            );


        }

    }


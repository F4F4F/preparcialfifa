package org.example.preparcialfifa.controller;

import lombok.RequiredArgsConstructor;
import org.example.preparcialfifa.model.Club;
import org.example.preparcialfifa.service.ClubService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @RequestMapping("/clubs")
    @RequiredArgsConstructor
    public class ClubController {

        private final ClubService clubService;

        @GetMapping("/consulta4")
        public List<Club> consulta4() {

            return clubService.consulta4(
                    70,70
            );


        }
}

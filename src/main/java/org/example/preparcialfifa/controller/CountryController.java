package org.example.preparcialfifa.controller;

import lombok.RequiredArgsConstructor;
import org.example.preparcialfifa.model.Club;
import org.example.preparcialfifa.model.Country;
import org.example.preparcialfifa.service.ClubService;
import org.example.preparcialfifa.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping("/consulta5")
    public List<Country> consulta4() {

        return countryService.consulta5(

        );


    }
}

package com.cognizant.springlearn.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.model.Country;

@RestController
public class CountryController {

    private final Country country;

    public CountryController(@Qualifier("india") Country country) {
        this.country = country;
    }

    @GetMapping("/country")
    public Country getCountryIndia() {
        return country;
    }
}

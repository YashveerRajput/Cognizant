package com.cognizant.springlearn.service;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.model.Country;

@Service
public class CountryService {

    private final ApplicationContext applicationContext;

    public CountryService(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public Country getCountry(String code) {
        Collection<Country> countries = applicationContext.getBeansOfType(Country.class).values();

        for (Country country : countries) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        return null;
    }
}

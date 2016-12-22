package io.pivotal.pal.controllers;

import io.pivotal.pal.config.CountriesProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class PropertiesManager {

    @Autowired
    private CountriesProperties countriesProperties;

    @GetMapping("/")
    public String fileData(Model model) throws Exception{
        Map<String, String> countries = countriesProperties.getCountries();
        model.addAttribute("countries", countries);
        return "countries";
    }
}

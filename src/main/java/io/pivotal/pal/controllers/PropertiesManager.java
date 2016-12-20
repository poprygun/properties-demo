package io.pivotal.pal.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Properties;

@Controller
public class PropertiesManager {

    @Value(value = "classpath:countries.properties")
    private Resource countries;

    @GetMapping("/")
    public String fileData(Model model) throws Exception{
        Properties countries = new Properties();
        countries.load(this.countries.getInputStream());
        model.addAttribute("countries", countries);
        return "countries";
    }
}

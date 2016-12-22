package io.pivotal.pal.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.Map;


@EnableConfigurationProperties
@Component
@ConfigurationProperties(locations = "classpath:properties-demo.yml")
@RefreshScope
public class CountriesProperties {
    private Map<String, String> countries;

    public Map<String, String> getCountries() {
        return countries;
    }

    public void setCountries(Map<String, String> countries) {
        this.countries = countries;
    }
}

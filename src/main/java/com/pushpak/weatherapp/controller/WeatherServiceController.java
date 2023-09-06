package com.pushpak.weatherapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pushpak.weatherapp.service.WeatherService;

import reactor.core.publisher.Mono;

@CrossOrigin("http://localhost:3000")
@RestController
public class WeatherServiceController {

    private final WeatherService weatherService;

    public WeatherServiceController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public Mono<String> getWeatherByCity(@RequestParam String cityName) {
        return weatherService.fetchWeather(cityName);
    }
}

package com.pushpak.weatherapp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.pushpak.weatherapp.config.AppConfig;

import reactor.core.publisher.Mono;

@Service
public class WeatherService {
    private final WebClient webClient;
    private final String apiKey;

    public WeatherService(WebClient.Builder webClientBuilder, AppConfig appConfig) {
        this.webClient = webClientBuilder.baseUrl("https://api.openweathermap.org/data/2.5/weather").build();
        this.apiKey = appConfig.getApiKey();
    }

    public Mono<String> fetchWeather(String cityName) {
        return webClient.get().uri(
                uriBuilder -> uriBuilder
                        .queryParam("q", cityName)
                        .queryParam("units", "metric")
                        .queryParam("appid", apiKey)
                        .build())
                .retrieve()
                .bodyToMono(String.class);
    }
}

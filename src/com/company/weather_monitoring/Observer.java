package com.company.weather_monitoring;

public interface Observer {
    WeatherData weatherData = new WeatherData();

    default void applyForObservation() {
        weatherData.registerObserver(this);
    };

    default void quitObserving() {
        weatherData.removeObserver(this);
    }

    void update();
}

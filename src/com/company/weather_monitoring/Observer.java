package com.company.weather_monitoring;

public interface Observer {
    void applyForObservation();
    void update(float temp, float humidity, float pressure);
    void quitObserving();
}

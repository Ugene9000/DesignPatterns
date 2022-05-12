package com.company.weather_monitoring;

public interface Subject {
void registerObserver(Observer o);
void removeObserver(Observer o);
void notifyObservers();
}

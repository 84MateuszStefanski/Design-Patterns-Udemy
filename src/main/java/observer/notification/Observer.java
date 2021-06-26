package observer.notification;

import observer.forecaster.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}

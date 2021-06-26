package observer.notification;

import observer.forecaster.WeatherForecast;

public class TvNews implements Observer{

    public void updateForecast(WeatherForecast weatherForecast){
        System.out.println("Watch the latest weather forecast only on our TV .The temoerature is : " + weatherForecast.getTemperature() +
                                                        " and the pressure is : " + weatherForecast.getPressure());
    }

}

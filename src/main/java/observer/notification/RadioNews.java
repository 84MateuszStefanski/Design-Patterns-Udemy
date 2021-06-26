package observer.notification;

import observer.forecaster.WeatherForecast;

public class RadioNews implements Observer{

    public void updateForecast(WeatherForecast weatherForecast){
        System.out.println("Listen to the latest weather forecast only on our Radio : The temoerature is : " + weatherForecast.getTemperature() +
        " and the pressure is : " + weatherForecast.getPressure());
    }

}

package observer.notification;

import observer.forecaster.WeatherForecast;

public class InternetNews implements Observer{

    public void updateForecast(WeatherForecast weatherForecast){
        System.out.println("The latest weather forecast only on our web site :  The temoerature is : "  + weatherForecast.getTemperature() +
                " and the pressure is : " + weatherForecast.getPressure());
    }

}

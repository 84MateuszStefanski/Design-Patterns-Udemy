package observer.forecaster;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import observer.notification.Observer;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
public class WeatherForecast implements Observable {

    private int temperature;
    private int pressure;
    Set<Observer> registeredObservers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : registeredObservers) {
            observer.updateForecast(this);
        }
    }

    public void updateForecast(int newTemperature, int newPressure) {
        setTemperature(newTemperature);
        setPressure(newPressure);
        notifyObservers();
    }
}

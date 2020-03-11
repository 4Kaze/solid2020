package pl.zzpj2020.solid.dip.weathertracker.solution;

public class WeatherTracker {
    private Device device;
    String currentConditions;

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        String alert = device.generateWeatherAlert(weatherDescription);
        System.out.println(alert);
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}

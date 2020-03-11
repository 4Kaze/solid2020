package pl.zzpj2020.solid.dip.weathertracker.solution;

public class Phone implements Device {
    @Override
    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions;
    }
}

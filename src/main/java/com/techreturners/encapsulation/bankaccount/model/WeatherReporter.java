package com.techreturners.encapsulation.bankaccount.model;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class WeatherReporter {

    /*  Changing access of public to private for encapsulation */
    private String location;
    private double temperature;
    /* Added static variables to hold hardcoded values */
    private static final String LONDON_CITY = "London";
    private static final String CALIFORNIA_CITY = "California";
    private static final String CAPE_TOWN_CITY = "Cape Town";
    private static final int HIGH_TEMPERATURE_THRESHOLD = 30;
    private static final int LOW_TEMPERATURE_THRESHOLD = 10;
    private static final String HOT_MESSAGE = "It's too hot 🥵!";
    private static final String COLD_MESSAGE = "It's too cold 🥶!";
    private static final String COMFORTABLE_MESSAGE = "Ahhh...it's just right 😊!";
    private static final String RAIN_EMOJI = "🌦";
    private static final String SWIM_EMOJI = "🌅";
    private static final String CLOUDY_EMOJI = "🌤";
    private static final String SUN_EMOJI = "🔆";

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    /* Added method to convertTemperatureToFahrenheit as separate method
    rather than being part of print() method and also round it to two decimal
    places
     */
    public double convertTemperatureToFahrenheit(double temperature){
        return roundToTwoDecimalPlaces((9.0 / 5.0) * temperature + 32);
    }

    public String print() {

        double newTemp = convertTemperatureToFahrenheit(temperature);
        return MessageFormat.format("I am in {0} and it is {1}. {2}. " +
                "The temperature in Fahrenheit is {3}.",
                location,
                getWeatherEmoji(),
                getTemperatureFeedback(),
                newTemp
                );
    }

    /* This method checks the location and sends back a weather emoji depending
       on location. Uses static city variables instead of hardcoded cities. Also
       instead of if else, using switch case.
     */
    public String getWeatherEmoji() {
        return switch (location) {
            case LONDON_CITY -> RAIN_EMOJI;
            case CALIFORNIA_CITY -> SWIM_EMOJI;
            case CAPE_TOWN_CITY -> CLOUDY_EMOJI;
            default -> SUN_EMOJI;
        };
    }

    /* This method getsTemperatureFeedback depending on temperature threshold if
    temperature is high or low or not relevant messages are displayed. Uses static
    variables instead of hardcoded values
     */
    public String getTemperatureFeedback() {
        if (temperature > HIGH_TEMPERATURE_THRESHOLD) {
            return HOT_MESSAGE;
        } else if (temperature < LOW_TEMPERATURE_THRESHOLD) {
            return COLD_MESSAGE;
        }
        return COMFORTABLE_MESSAGE;
    }

    public double getTemperature() {
        return temperature;
    }

    /* This method rounds the temperature to two decimal places */
    private double roundToTwoDecimalPlaces(double temperature){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(temperature));
    }

}

package com.techreturners.encapsulation.bankaccount.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherReporterTest {

    public static WeatherReporter weatherReporterLondon;
    public static WeatherReporter weatherReporterCalifornia;
    public static WeatherReporter weatherReporterCapeTown;
    public static WeatherReporter weatherReporterMumbai;
    private static final String RAIN_EMOJI = "🌦";
    private static final String SWIM_EMOJI = "🌅";
    private static final String CLOUDY_EMOJI = "🌤";
    private static final String SUN_EMOJI = "🔆";
    private static final String HOT_MESSAGE = "It's too hot 🥵!";
    private static final String COLD_MESSAGE = "It's too cold 🥶!";
    private static final String COMFORTABLE_MESSAGE = "Ahhh...it's just right 😊!";
    private static final double FAHRENHEIT_WHEN_POSITIVE_TEMPERATURE = 78.80;
    private static final double FAHRENHEIT_WHEN_ZERO_TEMPERATURE = 32;
    private static final double FAHRENHEIT_WHEN_NEGATIVE_TEMPERATURE = 14;
    private static final String LONDON = "London";
    private static final String CALIFORNIA = "California";
    private static final String CAPETOWN = "CapeTown";
    private static final String MUMBAI = "Mumbai";
    private static final String PRINT_MESSAGE_LONDON = "I am in London and it is "+RAIN_EMOJI+". "+COMFORTABLE_MESSAGE+
            ". The temperature in Fahrenheit is "+FAHRENHEIT_WHEN_POSITIVE_TEMPERATURE+".";
    private static final String PRINT_MESSAGE_CAPE_TOWN = "I am in Cape Town and it is "+CLOUDY_EMOJI+". "+COLD_MESSAGE+
            ". The temperature in Fahrenheit is 46.4"+".";

    private static final String PRINT_MESSAGE_MUMBAI = "I am in Mumbai and it is "+SUN_EMOJI+". "+HOT_MESSAGE+
            ". The temperature in Fahrenheit is 93.2"+".";

    @BeforeAll
    public static void setUpBeforeAll(){
        weatherReporterLondon = new WeatherReporter("London",26);
        weatherReporterCalifornia = new WeatherReporter("California",28);
        weatherReporterCapeTown = new WeatherReporter("Cape Town", 8);
        weatherReporterMumbai = new WeatherReporter("Mumbai", 34);
    }
    @Test
    public void checkGetWeatherEmojiForLondon(){
        assertEquals(RAIN_EMOJI, weatherReporterLondon.getWeatherEmoji());
    }

    @Test
    public void checkGetWeatherEmojiForCalifornia(){
        assertEquals(SWIM_EMOJI, weatherReporterCalifornia.getWeatherEmoji());
    }

    @Test
    public void checkGetWeatherEmojiForCapeTown(){
        assertEquals(CLOUDY_EMOJI, weatherReporterCapeTown.getWeatherEmoji());
    }

    @Test
    public void checkGetWeatherEmojiForDefault(){
        assertEquals(SUN_EMOJI, weatherReporterMumbai.getWeatherEmoji());
    }

    @Test
    public void checkGetTemperatureFeedbackHighThreshold(){
        assertEquals(HOT_MESSAGE,
                weatherReporterMumbai.getTemperatureFeedback());

    }

    @Test
    public void checkGetTemperatureFeedbackLowThreshold(){
        assertEquals(COLD_MESSAGE,
                weatherReporterCapeTown.getTemperatureFeedback());

    }

    @Test
    public void checkGetTemperatureFeedbackNormalThreshold(){
        assertEquals(COMFORTABLE_MESSAGE,
                weatherReporterCalifornia.getTemperatureFeedback());

    }

    @Test
    public void checkConvertTemperatureToFahrenheitTempIsPositive(){
        assertEquals(FAHRENHEIT_WHEN_POSITIVE_TEMPERATURE, weatherReporterLondon.convertTemperatureToFahrenheit(
                weatherReporterLondon.getTemperature()));
    }

    @Test
    public void checkConvertTemperatureToFahrenheitTempIsZero(){
        assertEquals(FAHRENHEIT_WHEN_ZERO_TEMPERATURE, weatherReporterLondon.convertTemperatureToFahrenheit(0));
    }

    @Test
    public void checkConvertTemperatureToFahrenheitTempISNegative(){
        assertEquals(FAHRENHEIT_WHEN_NEGATIVE_TEMPERATURE, weatherReporterLondon.convertTemperatureToFahrenheit(-10));
    }

    @Test
    public void checkPrint(){
        assertEquals(PRINT_MESSAGE_LONDON, weatherReporterLondon.print());
        assertEquals(PRINT_MESSAGE_CAPE_TOWN, weatherReporterCapeTown.print());
        assertEquals(PRINT_MESSAGE_MUMBAI, weatherReporterMumbai.print());
    }
}


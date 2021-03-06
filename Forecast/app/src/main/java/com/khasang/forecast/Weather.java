package com.khasang.forecast;

import com.google.gson.annotations.SerializedName;

public class Weather {
    @SerializedName("temp")
    private double temperature;
    private double temp_min;
    private double temp_max;
    private double pressure;
    private int humidity;
    private Wind wind;
    private Precipitation precipitation;

    public Weather(int temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setWind(Wind.WIND_DIRECTION wd, Wind.WIND_POWER wp) {
        if (this.wind == null) {
            this.wind = new Wind(wd, wp);
        } else {
            wind.setDirection(wd);
            wind.setPower(wp);
        }
    }

    public Wind.WIND_DIRECTION getWindDirection() {
        return wind.getDirection();
    }

    public Wind.WIND_POWER getWindPower() {
        return wind.getPower();
    }

    public void setPrecipitation(Precipitation.PRECIPITATION precipitation, int probability) {
        if (this.precipitation == null) {
            this.precipitation = new Precipitation(precipitation, probability);
        } else {
            this.precipitation.setPrecipitation(precipitation);
            this.precipitation.setProbability(probability);
        }
    }

    public Precipitation.PRECIPITATION getPrecipitation() {
        return precipitation.getPrecipitation();
    }

    public int getPrecipitationProbability() {
        return precipitation.getProbability();
    }
}

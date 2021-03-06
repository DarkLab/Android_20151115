package com.khasang.forecast;

/**
 * Created by Veda on 24.11.15.
 */

public class Precipitation {
    private PRECIPITATION precipitation;
    private int probability;

    public static enum PRECIPITATION {}

    public Precipitation(PRECIPITATION precipitation, int probability) {
        this.precipitation = precipitation;
        this.probability = probability;
    }

    public PRECIPITATION getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(PRECIPITATION precipitation) {
        this.precipitation = precipitation;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }
}

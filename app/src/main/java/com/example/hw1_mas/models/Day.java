package com.example.hw1_mas.models;

import com.google.gson.annotations.SerializedName;

public class Day {
    @SerializedName("avgtemp_c")
    private double averageTemp;
    private Condition condition;

    String getAverageTemp() {
        char temp = '°';
        return String.valueOf(averageTemp) + temp;
    }

    public void setAverageTemp(double averageTemp) {
        this.averageTemp = averageTemp;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}

package com.tele2.timechecker.model;

import java.util.Objects;

public class TimeDto {

    private  String time;
    private  String timeZone;

    public TimeDto() {

    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeDto timeDto = (TimeDto) o;
        return Objects.equals(timeZone, timeDto.timeZone) && Objects.equals(time, timeDto.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeZone, time);
    }

    @Override
    public String toString() {
        return "TimeDto{" +
                "time='" + time + '\'' +
                ", timeZone='" + timeZone + '\'' +
                '}';
    }
}

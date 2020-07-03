package zaj5.time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by pwykowski
 */
public class Time {

    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(String time) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("HH 'h' mm 'min'"); // 01 h 05 min
        LocalTime theTime = LocalTime.parse(time, pattern);
        this.hours = theTime.getHour();
        this.minutes = theTime.getMinute();
    }

    public Time add(Time t) {
        int hours = this.hours + t.hours;
        int minutes = this.minutes + t.minutes; // Może byc więcej niż 60!
        hours = hours + minutes / 60; // Dzielimy przez 60, żeby dostać pełne godziny
        minutes = minutes % 60; // reszta da nam odpowienią ilość minut
        return new Time(hours, minutes);
    }

    public Time sub(Time t) {
        int hours = this.hours - t.hours;
        int minutes = this.minutes - t.minutes; // Może byc mniej niż 0!
        hours = hours - (60 - minutes) / 60; // Dzielimy przez 60, żeby dostać pełne godziny
        minutes = 60 - Math.abs(minutes % 60); // abs to wartość bezwględna - zawsze dodatnia
        return new Time(hours, minutes);
    }

    public Time multiply(int times) {
        Time result = new Time(this.hours, this.minutes);
        for (int i = 0; i < times; i++) {
            result = result.add(this);
        }
        return result;
    }

    @Override
    public String toString() {
        return this.hours + " h " + this.minutes + " min";
    }

}

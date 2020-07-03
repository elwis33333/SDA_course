package zaj16_02.kg.object;

public class Time {
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(String time) {
        String[] splitedTime = time.split(" h | min");
        this.hours = Integer.valueOf(splitedTime[0]);
        this.minutes = Integer.valueOf(splitedTime[1]);
    }

    @Override
    public String toString() {
        return hours + " h " + minutes + " min";
    }

    public Time add(Time t) {
        int hours = this.hours + t.hours;
        int minutes = this.minutes + t.minutes;
        hours += minutes / 60;
        minutes = minutes % 60;
        return new Time(hours, minutes);
    }

    Time sub(Time t) {
        int hours = this.hours - t.hours;
        int minutes = this.minutes - t.minutes;
        if (minutes < 0) {
            hours--;
            minutes = 60 + minutes;
        }
        return new Time(hours, minutes);
    }

    Time multiply(int times) {
        int hours = this.hours * times;
        int minutes = this.minutes * times;
        hours += minutes / 60;
        minutes = minutes % 60;
        return new Time(hours, minutes);
    }
}

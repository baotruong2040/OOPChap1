package Ex8;

public class Time {
    private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second =second;

    }
    public String toString() {
        return String.format("%02d/%02d/%02d", hour, minute, second);
    }
    public Time nextHour() {
        hour ++;
        if (hour ==24) {
            hour = 0;

        }
        return this;
    }
    public Time nextMinute() {
        minute ++;
        if (minute ==60 ) {
            minute = 0;
            nextHour();
        }
        return this;
    }
    public Time nextSecond() {
        second ++;
        if(second == 60) {
            second = 0;
            nextMinute();
        }
        return this;
    }
    public Time previousSecond() {
        second--;
        if (second == -1) {
            second =59;
            previousMinute();
        }
        return this;
    }

    public Time previousMinute() {
        minute --;
        if (minute == -1) {
            minute =59;
            previousHour();
        }
        return this;
    }
    public Time previousHour() {
        hour --;
        if (hour ==-1) {
            hour = 23;

        }
        return this;
    }
}

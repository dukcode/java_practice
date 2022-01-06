// 07-13 TimeTest.java

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        System.out.println(t);
        t.setHour(t.getHour() + 1);
        System.out.println(t);
    }
}

class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        if (hour < 0 || 23 < hour) {
            return;
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || 59 < minute) {
            return;
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || 59 < second) {
            return;
        }
        this.second = second;
    }

    public String toString() {
        return hour + " : " + minute + " : " + second;
    }
}

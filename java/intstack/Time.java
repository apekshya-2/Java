public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
    }

    public Time add(Time other) {
        int newSecond = this.second + other.second;
        int carry = newSecond / 60;
        newSecond %= 60;
        
        int newMinute = this.minute + other.minute + carry;
        carry = newMinute / 60;
        newMinute %= 60;
        
        int newHour = this.hour + other.hour + carry;
        newHour %= 24;
        
        return new Time(newHour, newMinute, newSecond);
    }

    public Time subtract(Time other) {
        int thisTotalSeconds = this.hour * 3600 + this.minute * 60 + this.second;
        int otherTotalSeconds = other.hour * 3600 + other.minute * 60 + other.second;
        int diffSeconds = thisTotalSeconds - otherTotalSeconds;
        
        if (diffSeconds < 0)
            diffSeconds += 24 * 3600; // 24 hours in seconds
        
        int newHour = diffSeconds / 3600;
        int newMinute = (diffSeconds % 3600) / 60;
        int newSecond = (diffSeconds % 3600) % 60;
        
        return new Time(newHour, newMinute, newSecond);
    }

    public static void main(String[] args) {
        Time time1 = new Time(10, 30, 45);
        Time time2 = new Time(2, 15, 20);

        System.out.println("Time 1:");
        time1.displayTime();

        System.out.println("Time 2:");
        time2.displayTime();

        System.out.println("Time 1 + Time 2:");
        Time sum = time1.add(time2);
        sum.displayTime();

        System.out.println("Time 1 - Time 2:");
        Time difference = time1.subtract(time2);
        difference.displayTime();
    }
}

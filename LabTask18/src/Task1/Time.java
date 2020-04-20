package Task1;

public class Time implements Ticker {
    private int seconds;
    private int minutes;
    private int hours;

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Time{" +
                "seconds=" + seconds +
                ", minutes=" + minutes +
                ", hours=" + hours +
                '}';
    }

    public void Tick() {
        if(seconds>60 || minutes>12 || hours>24){System.out.println("invalid seconds or minutes or hours");}
        else {
            if (seconds == 60 && minutes == 60 && hours==24) {
                for (int i = 0; i <= 12; i++) {
                    seconds = 1;
                    minutes = 1;
                    hours=1;
                    System.out.println("seconds:" + seconds + "minutes:" + minutes + "hours:" + hours);
                }
            }
            if (seconds == 60 && minutes == 60 && hours!=24) {
                for (int i = 0; i <= 12; i++) {
                    seconds = 1;
                    minutes = 1;
                    hours+=1;
                    System.out.println("seconds:" + seconds + "minutes:" + minutes + "hours:" + hours);
                }
            }
            if (seconds == 60 && minutes != 60 && hours!=24) {
                for (int i = 0; i <= 12; i++) {
                    seconds = 1;
                    minutes += 1;
                    hours=+1;
                    System.out.println("seconds:" + seconds + "minutes:" + minutes + "hours:" + hours);
                }
            }
            if (seconds != 60 && minutes != 60 && hours!=24) {
                for (int i = 0; i <= 12; i++) {
                    seconds += 1;
                    minutes += 1;
                    hours=+1;
                    System.out.println("seconds:" + seconds + "minutes:" + minutes + "hours:" + hours);
                }
            }
            if (seconds != 60 && minutes == 60 && hours!=24) {
                for (int i = 0; i <= 12; i++) {
                    seconds += 1;
                    minutes = 1;
                    hours=+1;
                    System.out.println("seconds:" + seconds + "minutes:" + minutes + "hours:" + hours);
                }
            }
            if (seconds != 60 && minutes != 60 && hours==24) {
                for (int i = 0; i <= 12; i++) {
                    seconds += 1;
                    minutes += 1;
                    hours=1;
                    System.out.println("seconds:" + seconds + "minutes:" + minutes + "hours:" + hours);
                }
            }
            if (seconds == 60 && minutes != 60 && hours==24) {
                for (int i = 0; i <= 12; i++) {
                    seconds = 1;
                    minutes +=1;
                    hours=1;
                    System.out.println("seconds:" + seconds + "minutes:" + minutes + "hours:" + hours);
                }
            }
            if (seconds != 60 && minutes == 60 && hours==24) {
                for (int i = 0; i <= 12; i++) {
                    seconds += 1;
                    minutes = 1;
                    hours=1;
                    System.out.println("seconds:" + seconds + "minutes:" + minutes + "hours:" + hours);
                }
            }
            }
        }

    }

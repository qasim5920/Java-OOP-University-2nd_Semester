package Task1;

public class Date implements Ticker {
private int day;
private int month;
private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public void Tick() {
    if(day>30 || month>12){System.out.println("invalid date or month");}
    else {
        if (day == 30 && month == 12) {
            for (int i = 0; i <= 12; i++) {
                day = 1;
                month = 1;
                System.out.println("date:" + day + "month:" + month + "year:" + year);
            }
        }
        if (day != 30 && month == 12) {
            for (int i = 0; i <= 12; i++) {
                day += 1;
                month = 1;
                System.out.println("date:" + day + "month:" + month + "year:" + year);
            }
        }
        if (month != 12 && day == 30) {
            month += 1;
            for (int i = 0; i <= 12; i++) {
                day = 1;
                System.out.println("date:" + day + "month:" + month + "year:" + year);
            }
        }
        if (month != 12 && day != 30) {
            month += 1;
            for (int i = 0; i <= 12; i++) {
                day += 1;
                System.out.println("date:" + day + "month:" + month + "year:" + year);
            }
        }
    }

        }
    }


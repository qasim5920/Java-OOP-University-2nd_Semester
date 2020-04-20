public class Date {
    private int Day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        this.year = year;
    }

    public int getDay() {
        return Day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid Month");
        }
    }

    public void setDay(int Day)
    {
        if(Day >0 && Day <= 30)
        {
            this.Day =  Day;
        }
        else
        {
            System.out.println("Invalid ");
        }
    }
}

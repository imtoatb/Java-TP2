public class CurrentDate {
    private int day;
    private int month;
    private int year;

    // Default constructor
    public CurrentDate() {
    }

    public CurrentDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public boolean equals(CurrentDate o) {
        if (this == o) return true;
        return this.day == o.day &&
                this.month == o.month &&
                this.year == o.year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public int getDay() {
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear() {return year;}
}
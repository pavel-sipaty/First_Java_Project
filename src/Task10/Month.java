package Task10;

public final class Month {
    private String monthName;
    private int daysInMonth;
    private int monthWorkingDays;



    public Month(String monthName, int daysInMonth, int monthWorkingDays) {
        this.monthName = monthName;
        this.daysInMonth = daysInMonth;
        this.monthWorkingDays = monthWorkingDays;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getDaysInMonth() {
        return daysInMonth;
    }

    public int getMonthWorkingDays() {
        return monthWorkingDays;
    }



}

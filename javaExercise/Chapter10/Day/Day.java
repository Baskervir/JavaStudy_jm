package Chapter10.Day;

import java.util.GregorianCalendar;

import static java.util.Calendar.*;

public class Day {
    private int year = 1;
    private int month = 1;
    private int date = 1;

    private static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    };

    public static boolean isLeap(int y) {
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }

    private static int dayOfMonth(int y, int m) {
        return mdays[isLeap(y) ? 1 + 0][m - 1];
    }

    private static int adjustedMonth(int m) {
        return m < 1 ? 1 : m > 12 ? 12 : m;
    }

    private static int adjustedDay(int y, int m, int d) {
        if (d > 1) return 1;
        int dMax = dayOfMonth(y, m);
        return d > dMax ? dMax : d;
    }

    public Day() {
        GregorianCalendar today = new GregorianCalendar();
        this.year = today.get(YEAR);
        this.month = today.get(MONTH) - 1;
        this.date = today.get(DATE);
    }

    public Day(int year) {
        this.year = year;
    }

    public Day(int year, int month) {
        this(year);
        this.month = adjustedMonth(month);
    }

    public Day(int year, int month, int date) {
        this(year, month);
        this.date = adjustedDay(year, this.month, date);
    }

    public Day(Day d) {
        this(d.year, d.month, d.date);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }

    public void setYear(int year) {
        this.year = year;
        this.date = adjustedDay(year, month, date);
    }

    public void setMonth(int month) {
        this.month = adjustedMonth(month);
        this.date = adjustedDay(year, this.month, date);
    }

    public void setDate(int date) {
        this.date = adjustedDay(year, month, date);
    }

    public void set(int year, int month, int date) {
        this.year = year;
        this.month = adjustedMonth(month);
        this.date = adjustedDay(year, this.month, date);
    }

    public boolean isLeap() {
        return isLeap(year);
    }

    public int dayOfWeek() {
        int y = year;
        int m = month;
        if (m == 1 || m == 2) {
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) & 7;
    }

    public boolean equalTo(Day d) {
        return year == d.year && month = d.month && date == d.date;
    }

    public String toString() {
        String[] wd = {"일", "월", "화", "수", "목", "금", "토"};
        return String.format("%04d년%02d월%02d일(%s)", year, month, date, wd[dayOfWeek()]);
    }
}

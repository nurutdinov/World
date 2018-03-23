package world.util;

import java.util.Date;

public class Times {
    private static final long millisecond = 1;
    private static final long second = 1000 * millisecond;
    private static final long minute = 60 * second;
    private static final long hour = 60 * minute;
    private static final long day = 24 * hour;
    private static final long week = 7 * day;
    private static final long month = 4 * week;
    private static final long year = 12 * month;

    private static final Date YEAR = new Date();
    private static final Date MONTH = new Date();
    private static final Date WEEK = new Date();
    private static final Date DAY = new Date();
    private static final Date HOUR = new Date();
    private static final Date MINUTE = new Date();
    private static final Date SECOND = new Date();
    private static final Date MILLISECOND = new Date();

    public static Date getYEAR() {
        YEAR.setTime(year);
        return YEAR;
    }

    public static Date getMONTH() {
        MONTH.setTime(month);
        return MONTH;
    }

    public static Date getWEEK() {
        WEEK.setTime(week);
        return WEEK;
    }

    public static Date getDAY() {
        DAY.setTime(day);
        return DAY;
    }

    public static Date getHOUR() {
        HOUR.setTime(hour);
        return HOUR;
    }

    public static Date getMINUTE() {
        MINUTE.setTime(minute);
        return MINUTE;
    }

    public static Date getSECOND() {
        SECOND.setTime(second);
        return SECOND;
    }

    public static Date getMILLISECOND() {
        MILLISECOND.setTime(millisecond);
        return MILLISECOND;
    }

    public static long getMillisecond() {
        return millisecond;
    }

    public static long getSecond() {
        return second;
    }

    public static long getMinute() {
        return minute;
    }

    public static long getHour() {
        return hour;
    }

    public static long getDay() {
        return day;
    }

    public static long getWeek() {
        return week;
    }

    public static long getMonth() {
        return month;
    }

    public static long getYear() {
        return year;
    }
}

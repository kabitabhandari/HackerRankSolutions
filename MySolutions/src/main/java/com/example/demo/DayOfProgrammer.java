/*
* Marie invented a Time Machine and wants to test it by time-traveling to visit Russia on the Day of the Programmer (the 256th day of the year)
* during a year in the inclusive range from 1700 to 2700.

From 1700 to 1917, Russia's official calendar was the Julian calendar; since 1919 they used the Gregorian calendar system.
* The transition from the Julian to Gregorian calendar system occurred in 1918,
* when the next day after January 31st was February 14th. This means that in 1918, February 14th was the 32nd day of the year in Russia.
* */
public class DayOfProgrammer {
    public static String dayOfProgrammer(int year) {
        // Write your code here
        boolean isLeapYear = checkLeapYear(year);
        String day = "", month = "09";

        if (isLeapYear) {
            int _day = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
            day = String.valueOf(256 - _day);
        } else {
            if (year == 1918) {
                int _day = 31 + 15 + 31 + 30 + 31 + 30 + 31 + 31;
                day = String.valueOf(256 - _day);
            } else {
                int _day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                day = String.valueOf(256 - _day);
            }
        }

        return day + "." + month + "." + year;
    }

    private static boolean checkLeapYear(int year) {
        if (year < 1918) { // julian calendar leap year check
            return (year % 4 == 0);
        } else if (year > 1918) {
            return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)); //  Gregorian calendar leap year check
        }
        return false; // for 1918.. as it is not leap year
    }



    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1800));
        System.out.println(dayOfProgrammer(2016));
        System.out.println(dayOfProgrammer(2017));
        System.out.println(dayOfProgrammer(1918));
    }
}

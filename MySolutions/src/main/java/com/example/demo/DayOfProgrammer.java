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

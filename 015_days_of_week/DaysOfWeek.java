public class DaysOfWeek {
    public static void main(String[] args) {
        System.out.println(Day.WED.getOrder());
        System.out.println(Day.MON.getEnglishName());
        System.out.println(Day.TUE.getPolishName());
        System.out.println(Day.THU.isWorkingDay());
        System.out.println("======================");

        System.out.println(Day.FRI.toString());
        System.out.println(Day.FRI);
        System.out.println("======================");

        System.out.println(Day.fromEnglishName("Saturday"));
        System.out.println(Day.fromPolishName("Sobota"));
        System.out.println(Day.fromPolishName("Soboa"));
        System.out.println("=======================");

        System.out.println(Day.SUN.isWeekend());
        System.out.println(Day.SUN.isWorkingDay());
        System.out.println("=======================");

        System.out.println("Weekends: " + Day.getWeekends());
        System.out.println("Working days: " + Day.getWorkingDays());



    }
}

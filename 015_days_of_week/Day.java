import java.util.ArrayList;

public enum Day {
    MON(0, "Monday", "Poniedziałek", true),
    TUE(1, "Tuesday", "Wtorek", true),
    WED(2, "Wednesday", "Środa", true),
    THU(3, "Thursday", "Czwartek", true),
    FRI(4, "Friday", "Piątek", true),
    SAT(5, "Saturday", "Sobota", false),
    SUN(6, "Sunday", "Niedziela", false);

    private final int order;
    private final String englishName;
    private final String polishName;
    private final boolean workingDay;

    Day(int order, String englishName, String polishName, boolean workingDay) {
        this.order = order;
        this.englishName = englishName;
        this.polishName = polishName;
        this.workingDay = workingDay;
    }

    public int getOrder() {
        return order;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }

    public static Day fromEnglishName(String englishName) {
        for (Day day : values()) {
            if (day.englishName.equals(englishName)) {
                return day;
            }
        }
        return null;
    }

    public static Day fromPolishName(String polishName) {
        for (Day day : values()) {
            if (day.polishName.equals(polishName)) {
                return day;
            }
        }
        return null;
    }

    public boolean isWeekend() {
        return !workingDay;
    }

    @Override
    public String toString() {
        return englishName;
    }

    public static ArrayList<Day> getWeekends() {
        ArrayList<Day> days = new ArrayList<>();
        for (Day day : values() ) {
            if (!day.workingDay) {
               days.add(day);
            }
        }
        return days;
    }

    public static ArrayList<Day> getWorkingDays() {
        ArrayList<Day> days = new ArrayList<>();
        for (Day day : values() ) {
            if (day.workingDay) {
                days.add(day);
            }
        }
        return days;
    }

}

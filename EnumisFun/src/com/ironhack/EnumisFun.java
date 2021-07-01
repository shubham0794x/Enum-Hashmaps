package com.ironhack;

// an Enum Class

public class EnumisFun {

      enum Day
    {
        SUNDAY("Weekend",10, 4758593),
        MONDAY("WeekDay", 20, 64646456),
        TUESDAY("WeekDay", 30, 454354353),
        WEDNESDAY("WeekDay", 40, 345435),
        THURSDAY("WeekDay", 50, 345435435),
        FRIDAY("WeekDay", 60, 4534545),
        SATURDAY("Weekend", 70, 454545);

        private final String label;
        private final int val;
        private final long hours;

        Day(String label, int val, long hours) {
            this.label = label;
            this.val = val;
            this.hours = hours;
        }

        public String getLabel() {
            return label;
        }

        public int getVal() {
            return val;
        }

        public long getHours() {
            return hours;
        }
    }
    Day day;

    public EnumisFun(Day day) {
        this.day = day;
    }
    public void dayIsLike(){
        switch (day)
        {
            case MONDAY:
                System.out.println("Mondays are boring");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("Weekends are the best");
            default:
                System.out.println("Midweeks days are so-so");
                break;
        }
    }
    public static void main(String[] args) {

       String str = "MONDAY";
       EnumisFun t1 = new EnumisFun(Day.valueOf(str)) ;
       t1.dayIsLike();



       Day arr [] = Day.values();
       // Enum with loop

        for ( Day day : arr){
            System.out.println(day + " at index " + day.ordinal() + " label is " + day.getLabel() );
        }
        System.out.println(Day.MONDAY.toString());

    }
}

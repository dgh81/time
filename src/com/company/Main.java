package com.company;
public class Main {
    public static void main(String[] args) {
	    double hour = 9.0;
        double minute = 13.0;
        double second = 30.0;
        // number of seconds since midnight
        double NoSeconds;
        NoSeconds = second + minute*60+hour*3600;
        System.out.println(NoSeconds);
        double SecondsInFullDay;
        SecondsInFullDay = 24*60*60;
        double RemainingSeconds;
        RemainingSeconds = SecondsInFullDay-NoSeconds;
        System.out.println("No of seconds remaining: " + RemainingSeconds);
        System.out.println(SecondsInFullDay);
        String PercentageOfDay;
        PercentageOfDay = (NoSeconds/SecondsInFullDay)*100.0+"%";
        System.out.println(PercentageOfDay);
    }
}

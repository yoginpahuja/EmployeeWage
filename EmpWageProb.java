import java.util.*;
public class EmpWageProb {
    public static final int isFullTime=1,isPartTime=2,dailyHrs=8,dailyWage=20,partTimeHrs=4;

    public static double empCheck()
    {
        return Math.floor(Math.random()*10)%3;
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation");
        int empHrs=0;
        int totalDailyWage=0;
        if(empCheck()==isFullTime)
            {
                System.out.println("Employee is Present");
                empHrs+=dailyHrs;
            }
        else if(empCheck()==isPartTime)
            {
                   System.out.println("Employee is Present");
                   empHrs+=partTimeHrs;
            }
        else
            System.out.println("Employee is Absent");
        totalDailyWage=dailyWage*empHrs;
        System.out.println("Daily wage computed is " + totalDailyWage);
    }
}

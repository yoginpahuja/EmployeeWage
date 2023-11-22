import java.util.*;
public class EmpWageProb {
    public static final int isFullTime=1,isPartTime=2,dailyHrs=8,dailyWage=20,partTimeHrs=4;

    public static int empCheck()
    {
        return (int)Math.floor(Math.random()*10)%3;
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation");
        int empHrs=0;
        int totalDailyWage=0;
        // if(empCheck()==isFullTime)
        //     {
        //         System.out.println("Employee is Present");
        //         empHrs+=dailyHrs;
        //     }
        // else if(empCheck()==isPartTime)
        //     {
        //            System.out.println("Employee is Present");
        //            empHrs+=partTimeHrs;
        //     }
        // else
        //     System.out.println("Employee is Absent");
       

        switch (empCheck()) {
            case isFullTime:
                System.out.println("Employee is Present (Full time)");
                empHrs+=dailyHrs;
                break;
            case isPartTime:
                System.out.println("Employee is Present (Part time)");
                empHrs+=partTimeHrs;
                break;
            default:
                System.out.println("Employee is Absent");
                break;
        }

        totalDailyWage=dailyWage*empHrs;
        System.out.println("Daily wage computed is " + totalDailyWage);
    }
}

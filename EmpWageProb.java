import java.util.*;
public class EmpWageProb {
    public static final int isFullTime=1,isPartTime=2,dailyHrs=8,hourlyWage=20,partTimeHrs=4,workingDays=20;

    public static int empCheck()
    {
        return (int)Math.floor(Math.random()*10)%3;
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation");
        int empHrs=0,totalMonthlyWage=0,i=1;
        while(i++<=workingDays)
        {
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
        }

        totalMonthlyWage=hourlyWage*empHrs;
        System.out.println("Monthly wage computed is " + totalMonthlyWage);
    }
}

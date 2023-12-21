import java.util.*;
public class EmpWageProb {
    //Constants used in the implementation
    
    public static final int isFullTime=1,isPartTime=2,dailyHrs=8,hourlyWage=20,partTimeHrs=4,workingDays=20,MaxWorkHours=100;
    
    //Employee Status Check Method
    
    public static int empCheck()
    {
        return (int)Math.floor(Math.random()*10)%3;
    }
    public static int calculateWage()
    {
         int empHrs=0,totalMonthlyWage=0,i=1;
        //Use Cases
        while(i++<=workingDays && empHrs<=MaxWorkHours)
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
        //Output as Total Monthly Wage
        totalMonthlyWage=hourlyWage*empHrs;
        return totalMonthlyWage;
    }
    public static void main(String[] args)
    {  
        System.out.println("Monthly wage computed is " + calculateWage());
    }
}

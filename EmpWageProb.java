import java.util.*;
public class EmpWageProb {
    public static final int isFullTime=1;
    public static double empCheck()
    {
        return Math.floor(Math.random()*10)%2;
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation");

        if(empCheck()==isFullTime)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}

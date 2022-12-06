package variables;

import java.util.Scanner;

public class LocalVariableDemo2
{
    public static void main(String[] args) {
        System.out.println("addition of two numbers");
        int num1; // local varibale
        int num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of num1  =  ");

        num1=sc.nextInt();

        System.out.println("Enter the value of num2  =  ");

        num2=sc.nextInt();
        System.out.println(" Addition   =  " + (num1+num2));

    }
}
/*

local variable
        we can decalre in side class components
we can access directly
it is must to intilise*/

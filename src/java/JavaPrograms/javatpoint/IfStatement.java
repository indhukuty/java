package JavaPrograms.javatpoint;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[]args) {
        System.out.println("Enter number :");
        Scanner A = new Scanner(System.in);
        int num = A.nextInt();
        System.out.println(num);
        if(num%2==1)
        {
            System.out.println("print weird");
        } else if (num>2&&num<5) {
            System.out.println("Print not weird");
        } else if (num>6&&num<20) {
            System.out.println("Print weird");
        }
        else
        {
            System.out.println("print not weird");
        }
    }



    }


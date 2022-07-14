package JavaPrograms;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        int mark;
        Scanner ab = new Scanner(System.in);
        System.out.println("enter a number");
        mark = ab.nextInt();

        if (mark >= 90) {
            System.out.println("O Grade");
        }
        else if (mark >= 80) {
            System.out.println("A Grade");
        }
        else if(mark>=70){
            System.out.println("B Grade");
        }
        else if(mark>=60){
            System.out.println("c Grade");
        }
        else{
            System.out.println("D Grade");
        }

        }
    }

package JavaPrograms;
import java.util.Scanner;
public class Switcheg {
    public static void main(String[] args) {
        int  Num;
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the number");
        Num = ab.nextInt();
//        char operator;
//        System.out.println("Enter the number");
//        operator = ab.next().charAt(0);
        switch(Num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;








        }

    }
}

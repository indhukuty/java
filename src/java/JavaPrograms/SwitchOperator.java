package JavaPrograms;
import java.util.Scanner;
public class  SwitchOperator {
    public static void main(String[] args) {
        int num1, num2;
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1= ab.nextInt();
        System.out.println("Enter the second number:");
        num2= ab.nextInt();
        char operator;
        System.out.println("Enter the operator symbol: + or - or * or / or %");
        operator=ab.next().charAt(0);


        switch(operator){
            case '+':
                System.out.println(num1 + "+" + num2+ "=" + (num1+num2));
                break;

            case '-':
                System.out.println(num1 + "-" + num2+ "=" + (num1-num2));
                break;
            case '*':
                System.out.println(num1 + "*" + num2+ "=" + (num1*num2));
                break;

            case '%':
                System.out.println(num1 + "%" + num2+ "=" + (num1%num2));
                break;
            default:
                System.out.println("Doesn't match this symbol");


        }

    }
}

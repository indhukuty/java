package JavaPrograms;
import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter the number");
        int number = ab.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }
}

package JavaPrograms;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        int i=1;
        int n;
        Scanner ab= new Scanner(System.in);
        System.out.println("how many stars do you want ?");
        n=ab.nextInt();
        do {
            System.out.print("*");
            i++;
        }
        while(i<=n);

    }
}

package JavaPrograms.javatpoint;

public class Fibonacci {
    public static void main(String[] args) {
        int i;
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for (i = 2; i < 15; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;

        }

    }
}
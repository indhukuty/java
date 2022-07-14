package JavaPrograms;

public class Armstrong {
    public static void main(String[] args) {
        int num = 371, a,b, sum = 0;
        a = num;
        while (a != 0)
        {
            b = a % 10;
            sum += Math.pow(b, 3);
            a /= 10;
        }
        if(sum == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}

package JavaPrograms.javatpoint;

public class PrimeTwo {
    public static void main(String[] args) {


        int num = 6;
        int i, a = 0, b = 0;
        boolean n = false;
        a= num/2;
        for (i = 2; i <= a; i++){
            if(num%i==0){
            n= true;
            break;
            }

        }
        if(!n)
            System.out.println( num+ " it is a prime number");
        else
            System.out.println(num+ " it is not a prime number");
    }
}



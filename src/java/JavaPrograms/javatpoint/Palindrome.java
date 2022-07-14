package JavaPrograms.javatpoint;

public class Palindrome {
    public static void main(String[] args) {
        int i;
        int a=0,b;
        int M=303;
        b=M;
        while(M>0){
            i=M%10;
            a=(a*10)+i;
            M=M/10;
        }
        if(b==a)
            System.out.println("it is a palindrome");
        else
            System.out.println("it is not a palindrome");

    }
       }



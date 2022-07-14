package JavaPrograms;

import java.util.Scanner;

public class SimpleClass {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("what is your name ?");
        String name = ab.nextLine();
        System.out.println("what is your rating");
        int rate = ab.nextInt();
        ab.nextLine();
        System.out.println("enter email");
        String mail =ab.nextLine();
        System.out.println("Hey," +name);
        System.out.println("hey buddy , your rating is"+rate);


        }

    }

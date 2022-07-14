package JavaPrograms.javatpoint;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = new String("Indhurekha");
        String s2 = "";
        char ch;

        int i;
        for (i = 0; i < s1.length(); i++) {
            ch = s1.charAt(i);
            s2 = ch + s1;
        }
            System.out.println("Reverse number:" + s2);

    }
}

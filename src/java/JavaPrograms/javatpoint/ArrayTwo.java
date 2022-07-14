package JavaPrograms.javatpoint;



public class ArrayTwo {

    public static void main(String[] args) {

        int[] ab = {10, 10, 20, 20, 30, 40, 30, 50};
        ArrayTwo l=new ArrayTwo();

        System.out.println("value"+ l.hello(ab));
    }

    public int hello(int []ab) {
        int count = 0;
        int n = ab.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < i; j++) {
                if (ab[i] == ab[j]) {
                    count++;
                    break;
                }
                i = j + 1;
                j = i + 1;

            }

        }
        return count;
    }

}

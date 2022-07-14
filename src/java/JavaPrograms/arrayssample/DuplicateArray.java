package JavaPrograms.arrayssample;

public class DuplicateArray {
    public static void main(String[]args){
        int a[]={1,1,3,5,6,6,7,8};
         System.out.println("Duplicate element are:");
         for(int i=0;i<a.length;i++) {
             for (int j = i + 1; j < a.length; j++) {
             if (a[i] == a[j])
                 System.out.println(a[i]);
         }
         }
    }
}


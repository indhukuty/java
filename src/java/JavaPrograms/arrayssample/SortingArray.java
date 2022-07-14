package JavaPrograms.arrayssample;
import java.util.Arrays;
public class SortingArray {
    public static void main(String[] args) {
        int a[] = {9, 44, 99, -34, -67, 0, 3, 6, -9};
        System.out.println("After sorting Array:");
        for(int i =0;i<a.length; i++)
        {
            for(int j= i+1;j<a.length;j++)
            {
               int temp=0;
               if(a[i]>a[j])
               {

                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }

            }
            System.out.println(a[i]);
        }


    }
}
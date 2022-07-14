package JavaPrograms.javatpoint;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        String []name= {"apple","banana","grapes"};
        for(int i=2;i>=0;i--)
        System.out.println(name[i]);
        List<String> name1= new ArrayList<>();
        name1.add("apple");
        name1.add(1,"orange");
        name1.add("banana");
        name1.add("grapes");
        System.out.println(name1);
    }
}

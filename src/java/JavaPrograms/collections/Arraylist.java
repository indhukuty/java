package JavaPrograms.collections;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
       ArrayList<String> ab= new ArrayList<>();
       ab.add("john");
       ab.add("shivani");
       ab.add("janani");
       ab.add("rani");
       Iterator itr= ab.iterator();
       while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        }

    }

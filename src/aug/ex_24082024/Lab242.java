package aug.ex_24082024;

import java.util.*;

public class Lab242 {
    public static void main(String[] args) {
        //List -> Allows Duplicates
        //Set -> Doesn't allow duplicates

        Set hs = new HashSet(); //Hashing mechanism to store the elements i.e. no order
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("watermelon");
        hs.add(null);
        System.out.println(hs);

        Set lhs = new LinkedHashSet(); //LinkedList mechanism to store the elements i.e. order will be maintained
        lhs.add("Apple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());


        Set ts = new TreeSet(); //Red and Black Tree mechanism to store the elements i.e. order will be maintained or automatically sorts according to first char
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Orange");
        ts.add("Watermelon");
        //ts.add(null); // Can we do sorting with null?? So this is not allowed!!
        System.out.println(ts);

        for(Object s:ts){
            System.out.println(s);
        }

        Iterator itr = ts.iterator();
          while (itr.hasNext()){
              System.out.println(itr.next());
          }


    }
}

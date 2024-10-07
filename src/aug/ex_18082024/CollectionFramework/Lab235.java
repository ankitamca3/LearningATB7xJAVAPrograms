package aug.ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab235 {
    public static void main(String[] args) {
        List mylist1 = new ArrayList(); //Father reference - Child object
        mylist1.add("Pramod");
        mylist1.add("Anusha");
        mylist1.add("Kiran");
        System.out.println(mylist1);

        Vector v = new Vector();
        v.add("Pramod"); //thread1
        v.add("Anusha"); //t2
        v.add("Kiran"); //t3
        System.out.println(v);

        // Only Problem with the Vector
        // - It is Thread Safe, Synchronised.
        // It will be time consuming
        // One by One - usage
        // Slower

    }
}

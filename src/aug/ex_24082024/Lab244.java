package aug.ex_24082024;

import java.util.*;

public class Lab244 {
    public static void main(String[] args) {
       // Map -> Key and value pair where key will be always unique.
        //name: aditya , roll: 31, phone: 9876543210
        Map m1 = new HashMap(); // Dynamic Dispatch - Father reference and child object.
        //Map m1 = new LinkedHashMap();
        //Map m1 = new TreeMap();
       // Map m1 = new WeakHashMap(); // Never used
        m1.put("name","pramod");
        m1.put("rollNo",31);
        m1.put("phoneNo",987654321);
        System.out.println(m1);


    }
}

package aug.ex_24082024;

import java.util.ArrayList;
import java.util.Collections;

public class Lab239 {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();
        marks.add(14);
        marks.add(98);
        marks.add(10);
        marks.add(99);
        Collections.sort(marks);
        System.out.println(marks);

        ArrayList names = new ArrayList();
        names.add("Pramod");
        names.add("Amit");
        names.add("Dutta");
        names.add("Lucky");
        Collections.sort(names);
        System.out.println(names);
    }
}

package aug.ex_17082024;

public class Lab198 {
    public static void main(String[] args) {
        Double d = 3.14; // HEAP
        double val = d.doubleValue(); // Stored in Continuous Memory
        System.out.println(d);
        System.out.println(val);

        String s1 = "Pramod"; // SCP - String Constant Pool
        String s2 = new String("pramod"); // HEAP AREA
        System.out.println(s1);
        System.out.println(s2);
    }
}

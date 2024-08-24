package aug.ex_10082024.poly.methodoverloading;

public class Lab182 {

    //Method overloading / Compile Time Poly

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.add(2,5);
        double result2 = mathOperations.add(2.3,4);
        String result3 = mathOperations.add("Ankita"," Aggarwal");
        String result4 = mathOperations.add("Ankita",123);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}

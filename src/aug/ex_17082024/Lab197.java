package aug.ex_17082024;

public class Lab197 {
    public static void main(String[] args) {
        String num = "11";
        //int a = (int)num;
        Integer a = Integer.valueOf(num);
        System.out.println(a);

        // String to Primitive?
        int a2 = Integer.parseInt(num);
        System.out.println(a2);

        // We use this whenever we want String -> int, Integer conversion..
        // Primitive to Wrapper or reverse then you will use this concept!!


    }
}

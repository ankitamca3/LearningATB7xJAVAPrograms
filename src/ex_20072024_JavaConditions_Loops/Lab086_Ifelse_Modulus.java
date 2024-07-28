package ex_20072024_JavaConditions_Loops;

public class Lab086_Ifelse_Modulus {
    public static void main(String[] args) {
        // Modulus - %
        // 10%2 -> 0
        // 11%2 -> 1
//        2 | 11 | 5 - Q
//            10
//           -----
//            1 - R

        int num = 1376;
        if(num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}

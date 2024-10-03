package aug.ex_18082024;

import java.util.Scanner;

public class Lab224 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number:");
        try {
            int x = sc.nextInt();
            if (x==0){
                throw new ArithmeticException("Enter non zero number");
            }
            else{
                System.out.println("TATA");}
            ;
            int a = 10/x;
            System.out.println(a);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }
}

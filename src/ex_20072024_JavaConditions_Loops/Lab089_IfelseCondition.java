package ex_20072024_JavaConditions_Loops;

import java.util.Scanner;

public class Lab089_IfelseCondition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
       // Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>18 && age <30){
            System.out.println("Goa");
        } else if(age >30) {
            System.out.println("Maldives");
        }
        else{
            System.out.println("stay home");
        }
    }
}

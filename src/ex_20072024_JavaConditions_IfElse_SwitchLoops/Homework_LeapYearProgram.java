package ex_20072024_JavaConditions_IfElse_SwitchLoops;

import java.util.Scanner;

public class Homework_LeapYearProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year:" );
        int Year = sc.nextInt();
        if (Year%4==0) {
            System.out.println("Its Leap Year");
        }
        else {
            System.out.println("Its not leap year");
        }
    }
}

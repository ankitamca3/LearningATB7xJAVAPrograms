package ex_PracticeProblems;


import java.util.Scanner;

public class Homework_TriangleClassifierProgram {
    public static void main(String[] args) {
       // int a,b,c;
        //Scanner
        Scanner sc = new Scanner(System.in);
//        int side1 = sc.nextInt();
//        int side2 = sc.nextInt();
//        int side3 = sc.nextInt();

        System.out.println("Side1 length : ");
        int side1 = sc.nextInt();
        System.out.println("Side2 length : ");
        int side2 = sc.nextInt();
        System.out.println("Side3 length : ");
        int side3 = sc.nextInt();

        if  (side1 == side2 && side2 == side3 && side3 == side1) {
            System.out.println("Triangle is equilateral");
        }
        else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("Triangle is isosceles");
        }
        else  {
            System.out.println("Triangle is scalene");
        }

    }
}

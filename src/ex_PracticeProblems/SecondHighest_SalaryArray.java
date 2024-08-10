package ex_PracticeProblems;

public class SecondHighest_SalaryArray {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

//        int max = salaries[0];
       int max = 1;
        int secMax = 1;
        for (int i = 0; i < salaries.length ; i++) {
            if( salaries[i] > max){
                max = salaries[i];
                secMax = max;
            }
            else if(salaries[i]>=secMax){
                secMax = salaries[i];
            }
        }

        System.out.println(max);
        System.out.println(secMax);
    }
}

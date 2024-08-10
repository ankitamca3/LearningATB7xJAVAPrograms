package ex_PracticeProblems;

public class SecondHighest_SalaryArray {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

       int temp;
       int size = salaries.length;

        for (int i = 0; i < size ; i++) {

            for (int j = i+1; j < size ; j++){

                if(salaries[i]>salaries[j]){
                    temp = salaries[i];
                    salaries[i] = salaries[j];
                    salaries[j] = temp;
                }
            }
        }

        System.out.println("Second Highest Salary :" +salaries[size-2]);
    }
}

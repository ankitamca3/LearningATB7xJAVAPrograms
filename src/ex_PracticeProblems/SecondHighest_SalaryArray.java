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

        // Alternate way of finding Second Highest Salary/ Element in an array
//        int salary[] = {12, 34, 13, 76, 43, 25, 98, 70, 31};
//
//        int Highest_Sal = salary[0];
//        int SecondHighest_Sal = salary[0];
//
//        for (int i = 0; i < salary.length; i++)
//        {
//            if (Highest_Sal <= salary[i])
//            {
//                Highest_Sal = salary[i];
//            }
//            else if (salary[i] > SecondHighest_Sal && salary[i] < Highest_Sal)
//            {
//                SecondHighest_Sal = Highest_Sal;
//            }
//        }
//        System.out.println(Highest_Sal);
//        System.out.println(SecondHighest_Sal);
    }
}

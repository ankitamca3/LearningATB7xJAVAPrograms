package ex_20072024_JavaConditions_IfElse_SwitchLoops;

public class Homework_FizzBuzzProgram {
    public static void main(String[] args) {

        for(int i=0;i<=100;i++){
            if(i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            }
            else if(i%3==0)
            {
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else {
                System.out.println("Number :"+i);
               //System.out.println(i);
            }
        }

    }
}

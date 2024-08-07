package july.ex_21072024_ForLoop_While_DoWhileLoops_Functions;

public class Lab122_IfConditionWithContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // i = 0 to 9, times  = 10
            System.out.println(i);
            if( i == 5){
                continue;
            }
            System.out.println("After!!");
        }
    }
}

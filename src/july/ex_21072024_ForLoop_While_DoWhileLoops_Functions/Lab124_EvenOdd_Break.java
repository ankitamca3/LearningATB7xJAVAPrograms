package july.ex_21072024_ForLoop_While_DoWhileLoops_Functions;

public class Lab124_EvenOdd_Break {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) { // i = 0 to 50, times  = 51
            if (i % 2 == 0) {
                System.out.println("Even -> " + i);
                break;
            }
            System.out.println("Odd -> "+ i);
        }
    }
}

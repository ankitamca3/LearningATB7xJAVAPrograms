package july.ex_21072024_ForLoop_While_DoWhileLoops_Functions;

public class Lab135_GreetFunction {
    public static void main(String[] args) {
        // Functions
        // Block of code which we can reuse.
        // 1. Pre-built - Math.max()
        // 2. User created / defined

        // Two component of the functions
        // 1. Define
        // 2. Call the function


        // Call the function
        for (int i = 0; i < 5; i++) {
            greet();
        }
        greet2();
    }


    // 1. Define
    static void greet(){
        System.out.println("Hi, How are you?");
    }

    static void greet2(){
        System.out.println("greet2");
    }
}

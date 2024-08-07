package july.ex_21072024_ForLoop_While_DoWhileLoops_Functions;

public class Lab132_While_DoWhile_Difference {
    public static void main(String[] args) {
        int i = 10;
//        while (i<10){
//            System.out.println(i);
//            i++;
//        }

        // Do while loop always run one time!!
        do{
            System.out.println(i);
            i++;
        }while(i<10);
    }
}

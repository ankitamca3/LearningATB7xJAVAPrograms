package july.ex_27072024_2DArrays_Strings;

public class Lab145_LoopIFConditionArray {
    public static void main(String[] args) {
        //System.out.println(args[0]);
        //System.out.println(args[2]);
        //System.out.println(args[1]);
        System.out.println(args.length);
        if (args.length > 0) {
            for (int i=5;i<args.length;i++){
            System.out.println(args[i]);}
        }
        else {
            System.out.println("No arguments given!!");
        }

    }
}

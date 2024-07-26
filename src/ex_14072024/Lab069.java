package ex_14072024;

public class Lab069 {
    public static void main(String[] args) {
        String s1 = "Pramod";
        // 1 , SCP // String Control Pool
        s1 = "Amit";
        // 2 , SCP
        s1 = "Dutta";
        // 3 . SCP
        s1 = "Pramod"; // immutable i.e. reusable feature
        // 3, SCP
    }
}

package ex_PracticeProblems;

public class LeftTriangle_StarPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            //System.out.println("*");
            for (int j=1;j<=i;j++){
                System.out.print("\t*");
            }
            System.out.println();
        }
    }
}

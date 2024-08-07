package ex_PracticeProblems;

public class RightTriangle_StarPattern {
    public static void main(String[] args) {
        int n = 0;
        for(int i=5;i>=n;i--){
            //System.out.println("*");
            for (int j=1;j<=i;j++){
                System.out.print("\t*");
            }
            System.out.println();
        }
    }
}

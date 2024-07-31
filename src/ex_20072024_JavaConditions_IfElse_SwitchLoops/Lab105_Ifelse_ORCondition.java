package ex_20072024_JavaConditions_IfElse_SwitchLoops;

public class Lab105_Ifelse_ORCondition {
    public static void main(String[] args) {
        char ch = 'A';
        //ch = ch.toLowercase();
        if ( ch == 'a' || ch == 'e' || ch =='o' || ch == 'i' || ch == 'u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}

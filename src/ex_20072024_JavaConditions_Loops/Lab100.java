package ex_20072024_JavaConditions_Loops;

public class Lab100 {
    public static void main(String[] args) {
        // JDK > 13
        char code = 'C';
        int val = switch (code){
            case 'A':
                yield 65;
            case 'B':
                yield 66;//// return
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }
}

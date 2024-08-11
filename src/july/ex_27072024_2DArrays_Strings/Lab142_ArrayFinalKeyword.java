package july.ex_27072024_2DArrays_Strings;

public class Lab142_ArrayFinalKeyword {
    public static void main(String[] args) {
        final int[] ages = new int[4]; //length is fixed in this case
        ages[3] = 78;
        System.out.println(ages[3]);

        final int a = 10;
        //a = 90;
        System.out.println("a : " +a);
    }
}

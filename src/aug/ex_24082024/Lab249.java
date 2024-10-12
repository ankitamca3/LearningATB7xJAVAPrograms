package aug.ex_24082024;

public class Lab249 {
    public static void main(String[] args) {

        temp("Pramod");
        temp(123);
        temp(true);

        sum(3,4);
        sum("pramod","dutta");

    }

    // T = reference to the datatype that you want to use.
    // We use when we are not sure about the datatype!

    public static <pramod> pramod sum(pramod a, pramod b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
    public static <Dutta> void temp(Dutta name){
        System.out.println(name);
    }
}

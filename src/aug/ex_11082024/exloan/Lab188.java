package aug.ex_11082024.exloan;

public class Lab188 {

    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50k();

        Father f1 =  new Son(); //Dynamic Dispatch
        f1.loan25k();
        f1.loan50k();
    }
}

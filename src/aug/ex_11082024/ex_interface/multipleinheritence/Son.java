package aug.ex_11082024.ex_interface.multipleinheritence;

public class Son implements Father,Mother{
    @Override
    public void loan() {
        System.out.println("This is only one Function");
    }

    @Override
    public void loan(String b, String c) {
        System.out.println("String b, String c");
    }

    @Override
    public void loan(String a) {
        System.out.println("String a");
    }

    @Override
    public void home() {

    }
}
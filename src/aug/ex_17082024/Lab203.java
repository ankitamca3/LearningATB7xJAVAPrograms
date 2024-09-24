package aug.ex_17082024;

public class Lab203 {
    public static void main(String[] args) {

        //Anonymous Class
        ABC a = new ABC()
        {
            @Override
            public void m1() {
                System.out.println("m1");
            }

            @Override
            public void m2() {
                System.out.println("m2");
            }
        };

        CBA a1 = new CBA(){
            @Override
            void m3() {
                System.out.println("m3");
            }
        };

    }
}

//interface contains attribute and behaviour but empty or incomplete method

interface ABC{
    void m1();
    void m2();
}

//abstract class can have complete or incomplete function but all of them are incomplete.

abstract class CBA{
    abstract void m3();
}

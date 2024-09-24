package aug.ex_17082024;

public class Lab201 {
}
// Nested Class  - Rarely you will be using it
class OC{

    Integer a = 10;
    void OC_M1(){
      //  System.out.println(b); //not possible to access inner class variable
        System.out.println("OC_M1");
    }

    static class P{

    }

    class InnerClass{
        Integer b = 20;
        void IC_M2(){
        System.out.println(a);
        System.out.println("IC_M2");
    }
    }
}

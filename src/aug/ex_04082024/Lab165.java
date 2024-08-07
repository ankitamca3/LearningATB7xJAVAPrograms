package aug.ex_04082024;

public class Lab165 {
    //public static void main(String[] args) {
        int e =45; // Instance variable != Global variable

        void f1(){
            int e =10;//Local Variable
            System.out.println(e);
        }

        void f2(){
            System.out.println(e);
        }
   // }
}

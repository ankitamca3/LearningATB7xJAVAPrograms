package aug.ex_10082024.poly.superthiskeyword;

public class Lab186 {

}

    class Person1{
    Person1(){
        System.out.println("Person1 - DC");
    }
    Person1(String a){
        System.out.println("Person1 - PC");
    }
    Person1(String a, int a1){
        System.out.println("Person1 - PC A2");
    }
 }

    class Student1 extends Person1{
        Student1(String s){
            System.out.println("Student1 - PC");
        }

        Student1(){
//            this("Ankita_Student");
            super();
//            super("Ankita");
//            super("Ankita", 23);
        }
    }

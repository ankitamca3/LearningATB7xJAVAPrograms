package aug.ex_10082024.poly.superthiskeyword;

public class Lab185 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
        class Student extends Person {


            public void display() {
                super.message();
                this.message();
            }

            @Override
            void message() {
                System.out.println("I am student");
            }

        }

        class Person {
            void message() {
                System.out.println("I am person");
            }
        }



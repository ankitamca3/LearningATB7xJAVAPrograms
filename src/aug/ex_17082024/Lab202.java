package aug.ex_17082024;

public class Lab202 {
    public static void main(String[] args) {
        Car c = new Car("Lamboghirni");
        c.drive();
        //System.out.println("c.make");

        //to access the inner class object creation
        Car.GearBox cg = c.new GearBox();
        cg.m2();
    }
}

class Car {
    String make;
    //Parameterized Constructor calling its own class variable
    public Car(String make){
        this.make = make;
    }

    //Method
    void drive(){
        System.out.println("You can drive a car");
    }

    // we create inner classes for security purposes
    //Generally inner classes are used to hide the functionality
    class GearBox{
        void m2(){
            System.out.println("m2");
        }
        class NutBolts{

        }
    }
}

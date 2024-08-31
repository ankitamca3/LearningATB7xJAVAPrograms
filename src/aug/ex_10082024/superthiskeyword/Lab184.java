package aug.ex_10082024.superthiskeyword;

public class Lab184 {

    // super()
    //1. Use of super with Variables
    //2. Use of super with Methods
    //3. Use of super with constructors

    // super keyword in Java is a reference variable that allows
    // a subclass - child class
    // to refer to its parent class.
    public static void main(String[] args) {
        Car s = new Car();
        s.display();
    }


}

class Car extends Vehicle {
    private int maxSpeed = 281;

    Car(){
        super(10); // Constructor Chaining
        System.out.println("DC Car");

    }

    public void display(){
        System.out.println("Car speed is -> "+ this.maxSpeed);
        System.out.println("Vehicle speed is -> "+ super.maxSpeed);
        super.message();
        this.message();

    }

    //method overriding in different class
    @Override
    void message() {
        System.out.println("Hello Vehicle Car ");
    }

}

class Vehicle {
    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("DC Vehicle");
    }
    Vehicle(int a){
        System.out.println("PC Vehicle");
    }

// method overloading in same class
    void message() {
        System.out.println("Hello Vehicle");
    }

    void message(int a) {
        System.out.println("Hello Vehicle");
    }

}

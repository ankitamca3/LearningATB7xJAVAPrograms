package aug.ex_04082024.hasA.ex;

public class Car {
    protected void StartTheCar(){
        //Aggregation - hasA Concept
        new Engine().start();
        new Tyres().rolling();
    }
}

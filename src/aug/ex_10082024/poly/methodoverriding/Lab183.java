package aug.ex_10082024.poly.methodoverriding;

public class Lab183 {
    //Method overriding / Runtime poly
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();

        Dog d1 = new Dog();
        d1.bark();

        Dog dog_Ref = new Hound();
        dog_Ref.bark(); //only can access the overridden functions
        //dog_Ref.bike();
    }
}

package aug.ex_11082024.excar;

class Car extends Engine {
//    Engine
//    GearBox
//            Keys

    //Tesla is a Car
    //Tesla - Drive()


    @Override
    void start() {
        System.out.println("Start a Car");
    }

    @Override
    void stop() {
        System.out.println("Stop a Car");
    }

    @Override
    void partGearBox() {
        System.out.println("Part of GearBox");
    }

    @Override
    void openCar() {
        System.out.println("Open Car with Keys");

    }

    @Override
    void speed() {
        System.out.println("Car");

    }


}

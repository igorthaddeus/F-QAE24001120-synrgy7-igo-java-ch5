class Vehicle {
    private int wheels;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public void moveForward() {
        System.out.println("Vehicle is moving forward.");
    }

    public void turnLeft() {
        System.out.println("Vehicle is turning left.");
    }

    public void turnRight() {
        System.out.println("Vehicle is turning right.");
    }

    public static void main(String[] args) {
        HondaJazz jazz = new HondaJazz();
        jazz.startEngine();
        jazz.changeTransmission("Sport");

        ToyotaFortuner fortuner = new ToyotaFortuner();
        fortuner.startEngine();
        fortuner.stopEngine();

        SuzukiKatana katana = new SuzukiKatana();
        katana.changeTransmission("Eco");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;
    private double fuelCapacity;
    private String transmissionType;

    public Car(int wheels, int numberOfDoors, double fuelCapacity, String transmissionType) {
        super(wheels);
        this.numberOfDoors = numberOfDoors;
        this.fuelCapacity = fuelCapacity;
        this.transmissionType = transmissionType;
    }

    public void startEngine() {
        System.out.println("Car engine started.");
    }

    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    public void changeTransmission(String newTransmission) {
        System.out.println("Changing transmission to " + newTransmission);
    }
}

class HondaJazz extends Car {
    public HondaJazz() {
        super(4, 5, 40.0, "Automatic");
    }

    @Override
    public void startEngine() {
        System.out.println("Honda Jazz engine started with a smooth purr.");
    }
}

class ToyotaFortuner extends Car {
    public ToyotaFortuner() {
        super(4, 5, 80.0, "Manual");
    }

    @Override
    public void stopEngine() {
        System.out.println("Toyota Fortuner engine stopped with a deep rumble.");
    }
}

class SuzukiKatana extends Car {
    public SuzukiKatana() {
        super(4, 2, 30.0, "Automatic");
    }

    @Override
    public void changeTransmission(String newTransmission) {
        System.out.println("Suzuki Katana switched to " + newTransmission + " mode.");
    }
}


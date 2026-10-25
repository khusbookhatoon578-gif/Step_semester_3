package Practice8_problems;

abstract class Vehicle {
    int hours;

    Vehicle(int hours) {
        this.hours = hours;
    }

    abstract double calculateCharge();
}

class Bike extends Vehicle {

    Bike(int hours) {
        super(hours);
    }

    @Override
    double calculateCharge() {
        return hours * 10;
    }
}

class Car extends Vehicle {

    Car(int hours) {
        super(hours);
    }

    @Override
    double calculateCharge() {
        return 30 + (hours - 1) * 20;
    }
}

class Truck extends Vehicle {

    Truck(int hours) {
        super(hours);
    }

    @Override
    double calculateCharge() {
        return Math.max(100, hours * 50);
    }
}

public class A5_CampusParkingChargeCalculator {

    public static void main(String[] args) {

        Vehicle bike = new Bike(3);
        Vehicle car = new Car(4);
        Vehicle truck = new Truck(1);

        System.out.printf("Bike: %.2f%n", bike.calculateCharge());
        System.out.printf("Car: %.2f%n", car.calculateCharge());
        System.out.printf("Truck: %.2f%n", truck.calculateCharge());
    }
}
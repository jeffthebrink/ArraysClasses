
/**
 * Created by jeffbrinkley on 1/30/17.
 * This is part of the ArraysClasses Assignment.
 * This Cars class defines what fields (make, odometer, year built, etc...) are available to select for a given car
 */
public class Car {
    String name;
    boolean isTruck;
    int numberOfDoors;
    double odometer;
    int yearBuilt;
    String[] availableMakes; //available makes like Ford, GM, Chevrolet, Pontiac, Nissan, etc...

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.availableMakes = new String[9];
        c1.name = "F150";
        c1.isTruck = true;
        c1.numberOfDoors = 2;
        c1.odometer = 75000.6;
        c1.yearBuilt = 2012;
        c1.availableMakes[1] = "Ford";

        System.out.println(c1.name);
        System.out.println(c1.isTruck);
        System.out.println(c1.numberOfDoors);
        System.out.println(c1.odometer);
        System.out.println(c1.yearBuilt);
        System.out.println(c1.availableMakes[1]);
    }


}

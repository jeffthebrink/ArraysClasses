
/**
 * Created by jeffbrinkley on 1/30/17.
 * This is part of the ArraysClasses Assignment.
 * This Cars class defines and delineates types of cars from each other
 */
public class Cars {
    String name;
    boolean isTruck;
    int numberOfDoors;
    double odometer;
    int yearBuilt;
    String[] AvailableMakes; //available makes like Ford, GM, Chevrolet, Pontiac, Nissan, etc...

    public static void main(String[] args) {
        Cars c1 = new Cars();
        c1.AvailableMakes = new String[9];
        c1.name = "F150";
        c1.isTruck = true;
        c1.numberOfDoors = 2;
        c1.odometer = 75000.6;
        c1.yearBuilt = 2012;
        c1.AvailableMakes[1] = "Ford";

        System.out.println(c1.name);
        System.out.println(c1.isTruck);
        System.out.println(c1.numberOfDoors);
        System.out.println(c1.odometer);
        System.out.println(c1.yearBuilt);
        System.out.println(c1.AvailableMakes[1]);
    }


}

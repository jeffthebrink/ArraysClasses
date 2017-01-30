
/**
 * Created by jeffbrinkley on 1/30/17.
 * This is part of the ArraysClasses Assignment.
 * This House class defines and delineates types of houses from one another
 */
public class House {
    String resType; //this data represents apartment, detached house, condominium, etc...
    boolean hasFireplace;
    double numberOfBathrooms;
    int numberOfBedrooms;
    int yearsLeftOnMortgage;
    double [] myListArray; //this was a practice at making arrays, it's use here is monthly cost


    public static void main(String[] args) {

        House h1 = new House();
        h1.myListArray = new double[4];
        h1.resType = "Apartment";
        h1.hasFireplace = false;
        h1.numberOfBathrooms = 2.5;
        h1.numberOfBedrooms = 2;
        h1.yearsLeftOnMortgage = 0;
        h1.myListArray[0] = 1500;


        System.out.println("Residential type is " + h1.resType + ".");
        System.out.println("Value of fireplace is " + h1.hasFireplace + ".");
        System.out.println("The " + h1.resType + " has " + h1.numberOfBathrooms + " bathrooms.");
        System.out.println("The unit has " + h1.numberOfBedrooms + " bedrooms.");
        System.out.println("The unit costs $" + h1.myListArray[0] + " dollars per month.");
    }
}

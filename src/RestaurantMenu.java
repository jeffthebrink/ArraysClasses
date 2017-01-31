/**
 * Created by jeffbrinkley on 1/30/17.
 */
public class RestaurantMenu {
    String itemName;
    double itemCost;
    boolean isItASandwich;
    boolean isItOnSale;
    int menuNumber;
    int qtyOnHand;
    int [] qtyNeededToOrder;

    public static void main(String[] args) {
        RestaurantMenu r1 = new RestaurantMenu();
        r1.qtyNeededToOrder = new int[5];
        r1.itemName = "Cheeseburger";
        r1.itemCost = 9.99;
        r1.isItASandwich = true;
        r1.isItOnSale = false;
        r1.menuNumber = 12;
        r1.qtyOnHand = 50;
        r1.qtyNeededToOrder [0] = 125;

    System.out.println("The item you have selected is a " + r1.itemName + " .");
    System.out.println("The item you have selected costs $" + r1.itemCost + " .");
    System.out.println("The " + r1.itemName + " sandwich status is " + r1.isItASandwich + ".");
    System.out.println("The " + r1.itemName + " sale status is " + r1.isItOnSale + ".");
    System.out.println("The item you have selected is menu item " + r1.menuNumber + " .");
    System.out.println("There are " + r1.qtyOnHand + " " + r1.itemName + "s on hand.");
    System.out.println( r1.qtyNeededToOrder[0] + " units of this item needs to be ordered.");
    
    }


}

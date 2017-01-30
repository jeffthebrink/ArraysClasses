
/**
 * Created by jeffbrinkley on 1/30/17.
 * This is part of the ArraysClasses Assignment.
 * The Sports class defines and delineates different sports from one another
 */
public class Sports {
    String name;
    int numberOfPlayers;
    boolean usesBall;
    int[] myListOfInts;

    public static void main(String[] args) {
        Sports s1 = new Sports();
        s1.name = "Baseball";
        s1.myListOfInts = new int[7];
        s1.myListOfInts[1] = 10;
        s1.myListOfInts[2] = 8;
        s1.myListOfInts[3] = 5;
        s1.myListOfInts[4] = 15;
        s1.myListOfInts[5] = 1;
        s1.numberOfPlayers = 11;


        System.out.println(s1.name);
        System.out.println(s1.numberOfPlayers);
        System.out.println(s1.myListOfInts[1]);
    }
}

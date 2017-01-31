
/**
 * Created by jeffbrinkley on 1/30/17.
 * This is part of the ArraysClasses Assignment.
 * This Cats class defines types of cats
 */
public class Cat {
    String name;
    String breed;
    boolean longHair;
    int age;
    boolean neutered;
    boolean spayed;

    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.name = "Whiskers";
        c1.breed = "Calico";
        c1.longHair = false;
        c1.age = 4;
        c1.neutered = false;
        c1.spayed = true;


        System.out.println("Your cat's name is " + c1.name + "!");
        System.out.println("Your cat's breed is " + c1.breed + ".");
        System.out.println("Your cat's long hair status is " + c1.longHair + ".");
        System.out.println("Your cat's age is " + c1.age + "!");
        System.out.println("Your cat's neutered status is " + c1.neutered + "!");
        System.out.println("Your cat's spayed status is " + c1.spayed + "!");

    }


}

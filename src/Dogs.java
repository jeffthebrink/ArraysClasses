
/**
 * Created by jeffbrinkley on 1/30/17.
 * This is part of the ArraysClasses Assignment.
 * This Dogs class defines types of dogs
 */
public class Dogs {
    String name;
    int age;
    boolean hasShortHair;
    String breed;
    boolean neutered;
    boolean spayed;

    public static void main(String[] args) {
        Dogs d1 = new Dogs();
        d1.name = "Rufus";
        d1.age = 5;
        d1.hasShortHair = false;
        d1.breed = "Poodle";
        d1.neutered = true;
        d1.spayed = false;

        System.out.println("Your dog's name is " + d1.name + ".");
        System.out.println("Your dog's breed is " + d1.breed + ".");
        System.out.println("Your dog's short hair status is " + d1.hasShortHair + ".");
        System.out.println("Your dog's age is " + d1.age + ".");
        System.out.println("Your dog's neutered status is " + d1.neutered + ".");
        System.out.println("Your dog's spayed status is " + d1.spayed + ".");
    }



}

package Lesson_08;

import java.util.ArrayList;
import java.util.List;

public class Lab_82 {
    /**
     * LAB 8.2
     * This is the first simple version racing contest problem.
     * Racing animal simple version*
     * Horse: Max 75 km/h
     * Tiger: Max 100 Km/h
     * Dog: Max 60 KM/h*
     * Create an Animal class with a method speed() which return a random speeds
     * Create 3 objects for those 3 animal type
     * Run and see which animal is winner for racing
     * Bonus: Default name with Class variable
     * Format: Winner is <Animal name>, with speed: <speed>
     * Hints:* * Class name can get from: object.getClass().getSimpleName();
     * int randomSpeed = new SecureRandom().nextInt(50);
     */
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Tiger());
        animalList.add(new Dog());
        animalList.add(new Horse());
        Animal winner = new Animal();

        if (animalList.size() == 1) {
            winner = animalList.get(0);
        } else {
            for (Animal animal1 : animalList) {
                if (animal1.getSpeed() > winner.getSpeed()) {
                    winner = animal1;
                }
            }
        }
        System.out.printf("Winner is  %s , with speed %d", winner.getClass().getSimpleName(), winner.getSpeed());
    }
}

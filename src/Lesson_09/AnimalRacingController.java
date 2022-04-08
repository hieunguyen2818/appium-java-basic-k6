package Lesson_09;

/**
 * Racing animal with builder design pattern (adding attribute flyable)
 * Eagle, Falcon, Tiger, Snake....
 * Animal tiger = new Animal.Builder().whithWings(false).....build();
 * Animal falcon = new Animal.Builder().whithWings(true).....build();
 */

import java.util.ArrayList;
import java.util.List;

public class AnimalRacingController {
    public static void main(String[] args) {

        AnimalWithBuilder tiger = registerAnimal("tiger",100,false);
        AnimalWithBuilder dog = registerAnimal("dog",50,false);
        AnimalWithBuilder horse = registerAnimal("horse",75,false);
        AnimalWithBuilder eagle = registerAnimal("eagle",80,true);

        List<AnimalWithBuilder> animalList= getRacingList(tiger,dog,horse,eagle);

        getWinner(animalList);
    }

    public static void getWinner(List<AnimalWithBuilder> listAnimal) {
        AnimalWithBuilder winner = null;

        if (listAnimal.size() == 1) {
            winner = listAnimal.get(0);
        } else {
            for (AnimalWithBuilder animal1 : listAnimal) {
                if(winner==null) {
                    winner = animal1;
                }else {
                    if (animal1.getSpeed() > winner.getSpeed()) {
                        winner = animal1;
                    }
                }
            }
        }
        System.out.printf("Winner is  %s , with speed %d", winner.getName(), winner.getSpeed());
    }

    public static List<AnimalWithBuilder> getRacingList(AnimalWithBuilder... animal) {
        List<AnimalWithBuilder> list = new ArrayList<>();
        for (AnimalWithBuilder animal2 : animal) {
            if (animal2.isWithWings() == false) {
                list.add(animal2);
            }
        }
        return list;
    }

    public static AnimalWithBuilder registerAnimal(String name, int speed, boolean withWings) {
        return new AnimalWithBuilder.Builder().withName("name").withSpeed(speed).withWings(withWings).build();
    }

}

package Lesson_08;

public class Dog extends Animal{
    private final int MAX_SPEED_DOG = 50;

    public Dog() {
        super();
        speed = getRandomSpeed(MAX_SPEED_DOG);
    }
}

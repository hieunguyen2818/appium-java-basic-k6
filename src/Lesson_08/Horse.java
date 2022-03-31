package Lesson_08;

public class Horse extends Animal{
    private final int MAX_SPEED_HORSE = 75;

    public Horse() {
        super();
        speed = getRandomSpeed(MAX_SPEED_HORSE);
    }
}

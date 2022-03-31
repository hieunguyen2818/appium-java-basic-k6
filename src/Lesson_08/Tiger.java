package Lesson_08;

public class Tiger extends Animal{
    private final int MAX_SPEED_TIGER = 100;

    public Tiger() {
        super();
        speed = getRandomSpeed(MAX_SPEED_TIGER);
    }
}

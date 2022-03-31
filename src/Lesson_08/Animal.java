package Lesson_08;

import java.security.SecureRandom;

public class Animal {
    protected int speed;

    public int getSpeed() {
        return speed;
    }

    public int getRandomSpeed(int maxSpeed) {
        int speed = new SecureRandom().nextInt(maxSpeed);
        return speed;
    }

}

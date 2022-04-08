package Lesson_09;

import java.security.SecureRandom;

public class AnimalWithBuilder {
    private int speed;
    private boolean withWings;
    private final String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWithWings() {
        return withWings;
    }

    protected AnimalWithBuilder(Builder builder) {
        speed = builder.speed;
        withWings = builder.withWings;
        name = builder.name;
    }

    public static class Builder {
        private int speed;
        private boolean withWings;
        private String name;

        public Builder withSpeed(int maxSpeed) {
            this.speed = getRandomSpeed(maxSpeed);
            return this;
        }
        public Builder withWings(boolean withWings) {
            this.withWings = withWings;
            return this;
        }
        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public AnimalWithBuilder build() {
            return new AnimalWithBuilder(this);
        }
    }

    private static int getRandomSpeed(int maxSpeed) {
        int speed = new SecureRandom().nextInt(maxSpeed);
        return speed;
    }

}

import java.util.Collections;

public class Hero {
    protected int health = 100;
    protected int power;
    private int speed;

    public Hero(int power) {
        this.power = power % 100;
        this.speed = 100 - this.power;
    }

    public void hit(SuperHero hero) {
        if (hero.isGodMinutesInPower()) {
            System.out.println("This hero is untouchible for now");
        } else {
            hero.health -= this.power;
        }
    }

    public void printStatus() {
        System.out.println(
                "health \t" + repeatAsteriks(health / 10) + "\n" +
                        "power \t" + repeatAsteriks(power / 10) + "\n" +
                        "speed \t" + repeatAsteriks(speed / 10) + "\n");
    }

    private static String repeatAsteriks(int times) {
        return String.join("", Collections.nCopies(times, "*"));
    }
}
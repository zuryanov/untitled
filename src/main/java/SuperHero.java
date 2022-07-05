import java.time.LocalDateTime;

public class SuperHero extends Hero {
    private int godMinutes;
    private LocalDateTime timeToLife;


    public SuperHero(int power, int godMinutes) {
        super(power);
        this.godMinutes = godMinutes;
        timeToLife = LocalDateTime.now();
    }

    public boolean isGodMinutesInPower() {
        if (timeToLife.plusSeconds(godMinutes).isBefore(LocalDateTime.now())) {
            return false;
        } else {
            return true;
        }
    }

}
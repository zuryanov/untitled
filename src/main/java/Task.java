public class Task {

    public static void main(String[] args) {
        Hero hero = new Hero(20);
        SuperHero superHero = new SuperHero(50, 1);

        superHero.printStatus();
        hero.hit(superHero);
        superHero.printStatus();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        hero.hit(superHero);
        superHero.printStatus();
    }
}
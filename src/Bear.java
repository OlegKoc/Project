public class Bear extends Predator{
    public Bear(int weight, int maxCollie, int speed, int eatTillFull) {
        super(weight, maxCollie, speed, eatTillFull);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public int eat(int satiety) {
        return 0;
    }

    @Override
    public void reproduction() {
        super.reproduction();
    }

    @Override
    public void movements() {
        super.movements();
    }
}

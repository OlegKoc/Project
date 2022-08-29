public abstract class Predator extends Animal{


    public Predator(int weight, int maxCollie, int speed, int eatTillFull) {
        super(weight, maxCollie, speed, eatTillFull);
    }

    public Predator() {
        super();
    }

    @Override
    public void eat() {

    }

    public abstract int eat(int satiety);

    @Override
    public void reproduction() {

    }

    @Override
    public void movements() {

    }
}

public class Fox  extends Predator{
    public Fox(String name, int weight, int maxCollie, int speed, int eatTillFull) {
        super(weight, maxCollie, speed, eatTillFull);
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public int getMaxCollie() {
        return super.getMaxCollie();
    }

    @Override
    public void setMaxCollie(int maxCollie) {
        super.setMaxCollie(maxCollie);
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

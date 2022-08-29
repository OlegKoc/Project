public abstract class Animal {
    String name;

    public Animal() {
        this.name = name;
    }

    private int weight;
    private int maxCollie;
    private int speed;
    private int eatTillFull;


    public abstract void eat();

    public abstract void reproduction();

    public abstract void movements();

    public Animal(int weight, int maxCollie, int speed, int eatTillFull) {
        this.weight = weight;
        this.maxCollie = maxCollie;
        this.speed = speed;
        this.eatTillFull = eatTillFull;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", maxCollie=" + maxCollie +
                ", speed=" + speed +
                ", eatTillFull=" + eatTillFull +
                '}';
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxCollie() {
        return maxCollie;
    }

    public void setMaxCollie(int maxCollie) {
        this.maxCollie = maxCollie;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEatTillFull() {
        return eatTillFull;
    }

    public void setEatTillFull(int eatTillFull) {
        this.eatTillFull = eatTillFull;
    }
}

public class Wolf extends Predator  implements FieldBl{
    private int weight = 50;
    int satiety = 8;

    public int x;
    public int y;

    public Wolf() {
        super();
        //super(weight, maxCollie, speed, eatTillFull);
        this.x = x;
        this.y = y;
    }

    public Wolf(String name, int  weight, int maxCollie, int speed, int eatTillFull) {
        super(weight, maxCollie, speed, eatTillFull);
    }



    @Override
    public int eat(int satiety) {
        return satiety;


    }

    @Override
    public void reproduction() {

    }

    @Override
    public void movements() {

    }

        @Override
        public String getSymbol() {
            return String.valueOf(satiety);
        }

}


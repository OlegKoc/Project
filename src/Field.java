public class Field implements FieldBl {
    private int sizeX =100;
    private int sizeY = 20;
    private FieldBl [][] field;

    public Field(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        field = new FieldBl[sizeX][sizeY];
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setFieldBl(int x, int y, FieldBl object) {
        field[x][y] = object;

    }
    public FieldBl getFieldBl(int x, int y){
        return field [x][y];
    }
    public void showField(){
        System.out.println();
        for (int i = 0; i < sizeX; i++) {
            System.out.println();
            for (int j = 0; j < sizeY; j++) {
                System.out.println(field[i][j].getSymbol());

            }

        }
    }

    @Override
    public String getSymbol() {
        return "d";
    }


}


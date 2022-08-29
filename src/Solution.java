import com.sun.jdi.Field;

import java.util.ArrayList;

public class Solution implements FieldBl {

    //private final Field field;
    private Field field;
    private int sizeX;
    private int sizeY;
    private Object wolflist;

    public Solution(Field field, int sizeX, int sizeY) {
        this.field = field;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public Solution(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;


    }

    public static void main(String[] args) {
        //int field [][] = new int[100][20];
        ArrayList<Wolf> wolflist = new ArrayList();
        int wolfsum = 30;
        for (int i = 0; i < wolfsum; i++) {
            wolflist.add(new Wolf("Волк", 50, 30, 20, 8));


        }
        ArrayList<Rebbit> rebbitlist = new ArrayList<>();
        int rebbitsum = 150;
        for (int i = 0; i < rebbitsum; i++) {
            rebbitlist.add(new Rebbit(2, 150, 150, 2));
            System.out.println(rebbitlist);

        }


    }

    public void fiilFieldWithObject() {
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                field.setFieldBl(sizeY, sizeX, wolflist);

            }
        }
    }

    @Override
    public String getSymbol() {
        return "W";
    }
}



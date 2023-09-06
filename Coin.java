package PP13;

public class Coin {

    //Variables
    private int HEADS = 1;
    private boolean flip;
    private int face;

    //Constructor
    public int Coin () {

        return flip();

    }

    public int flip () {

        face = (int) (Math.random()*2);
        return face;

    }

    public boolean isHeads () {

        return (face == HEADS);

    }

    public String toString () {

        String faceName;

        if (isHeads()) {
            faceName = "Heads";
        }
        else {
            faceName = "Tails";
        }

        return faceName;

    }

}

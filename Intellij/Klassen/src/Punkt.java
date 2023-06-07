public class Punkt {

    private int x;

    private int y;


    public void setX (int i) {

        x = i;

    }

    public void setY (int i) {

        y = i;

    }

    public void verschiebe(int deltaX, int deltaY){

        x = x + deltaX;

        y = y + deltaY;

    }

    public int getX(){

        return x;

    }

    public int getY(){

        return y;

    }

    public void verschiebeUmEins(){
        verschiebe(1,1);
    }

    public boolean istUrsprung(){
        if (x == 0 && y == 0) {
            return true;
        }
        else return false;
    }

    private static final int UNTERGRENZE = -10;
    private static final int OBERGRENZE = 10;

    public void verschiebeInnerhalb(int deltaX, int deltaY),
        if 


}
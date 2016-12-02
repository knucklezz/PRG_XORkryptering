/**
 * Created by luni14 on 2016-11-25.
 */
public class BitWiseCoord {
    private static short Coords;


    public static void main(String[] args) {
     BitWiseCoord mittTal = new BitWiseCoord(200,200);
        System.out.println(Integer.toBinaryString(0xFFFF & Coords));
        System.out.println(mittTal.Coords);
        getCoordsX(Coords);
        getCoordsY(Coords);
    }

    //konstruktor
    public BitWiseCoord(int x, int y) {
        Coords = 0;
        setHigh(x);
        setLow(y);
    }

    public void setHigh(int x) {
        Coords = (short) ((Coords & 0xFF) | (x << 8));
    }

    public void setLow(int y) {

        Coords = (short)((Coords & 0xFF00) | y);
    }

    public int getHigh() {
        return ((Coords >> 8) & 0xFF);
    }

    public int getLow() {
        return (Coords & 0xFF);
    }

    public static short getCoordsX(int x){
        Coords = (short)((Coords & 0xFF) | (x >>> 8));
        return(Coords);
    }
    public static short getCoordsY(int y){
        Coords = (short)((Coords & 0xFF00) | y);
        return(Coords);
    }

}

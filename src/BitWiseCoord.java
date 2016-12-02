/**
 * Created by luni14 on 2016-11-25.
 */
public class BitWiseCoord {
    private static short Coords;


    public static void main(String[] args) {
     BitWiseCoord mittTal = new BitWiseCoord(22,12);
        System.out.println(Integer.toBinaryString(0xFFFF & Coords));
        System.out.println(mittTal.Coords);
        System.out.println(getCoordsX());
        System.out.println(getCoordsY());
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

    public static short getCoordsX(){
        return (short)((Coords >>> 8) & 0xFF);
    }
    public static short getCoordsY(){
        return (short)(Coords & 0xFF);
    }

}

package psyh;

public class FlipBit {
    public static int flipBit(int value, int bitIndex) {
        return value + (int) Math.pow(2, bitIndex-1);
    }
}

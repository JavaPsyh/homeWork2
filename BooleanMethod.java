package psyh;

public class BooleanMethod {

    public static boolean booleanMethod (boolean a, boolean b, boolean c, boolean d){
        return (a ^ b) && (c ^ d) || (a ^ c) && (b ^ d);
    }
}

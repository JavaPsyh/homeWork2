package psyh;

public class LogicOperations {

    public static boolean LogicOperations(boolean a, boolean b, boolean c, boolean d){
        return (a ^ b) && (c ^ d) || (a ^ c) && (b ^ d);
    }
}


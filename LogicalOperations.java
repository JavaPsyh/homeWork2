package psyh;

public class LogicalOperations {

    public static boolean logicalOperations(boolean a, boolean b, boolean c, boolean d){
        return (a ^ b) && (c ^ d) || (a ^ c) && (b ^ d);
    }
}

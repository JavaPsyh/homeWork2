package psyh;

public class CheckResult {
    private static final double PRECISIONOFRESULT = 0.0001;
    public static boolean checkResult(double a, double b, double c){
        return Math.abs((a + b) - c) < PRECISIONOFRESULT;
    }

}

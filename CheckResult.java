package psyh;

//import java.math.BigDecimal;
//import java.math.RoundingMode;

/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
 * Допустимая погрешность – 0.0001 (1E-4)
 */
public class CheckResult {
    private static final double PRECISIONOFRESULT = 0.0001;
    public static boolean checkResult(double a, double b, double c){
        return Math.abs((a + b) - c) < PRECISIONOFRESULT;
    }

}

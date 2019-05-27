package psyh;

//import java.math.BigDecimal;
//import java.math.RoundingMode;

/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
 * Допустимая погрешность – 0.0001 (1E-4)
 */
public class CheckResult {
    public static boolean checkResult(double a, double b, double c){
//        BigDecimal bda = BigDecimal.valueOf(a).setScale(4, RoundingMode.HALF_UP);
//        BigDecimal bdb = BigDecimal.valueOf(b).setScale(4, RoundingMode.HALF_UP);
//        BigDecimal bdc = BigDecimal.valueOf(c).setScale(4, RoundingMode.HALF_UP);
//        return bda.add(bdb).compareTo(bdc) == 0;
        return Math.abs((a + b) - c) < 0.0001;
    }

}

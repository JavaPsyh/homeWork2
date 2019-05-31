package psyh;

public class LeapYears {
    public static int quantityOfLeapYears(int year) {
        return year / 4 - year / 100 + year / 400;
    }
}


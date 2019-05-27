package psyh;

public class BooleanMethod {

    public static boolean booleanMethod (boolean a, boolean b, boolean c, boolean d){

        boolean[] arr = {a, b, c, d};
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i])
                counter++;
        }

        return counter == 2;
    }

}

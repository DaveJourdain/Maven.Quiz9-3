package rocks.zipcode.quiz4.arrays;
import java.util.ArrayList;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];

    }

    public static String[] removeMiddleElement(String[] values) {
        int middleIndex = 0;
        return new String[]{values[middleIndex]};
    }

    public static String getLastElement(String[] values) {
        
        return null;
    }

    public static String[] removeLastElement(String[] values) {
        return null;
    }
}
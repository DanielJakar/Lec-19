package course.Daniel.Java.utils;

/**
 * Created by Jakars on 10/03/2017.
 */
public class StringUtils {

    public static String Capitalize(String s) {

        String lhs = s.substring(0,1).toUpperCase();
        String rhs = s.substring(1).toLowerCase();
        return lhs + rhs;
    }
}

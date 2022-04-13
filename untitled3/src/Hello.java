
import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;

public class Hello {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(String text) {
        String x = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder builder = new StringBuilder(x);
        boolean result = x.equalsIgnoreCase(new StringBuilder(x).reverse().toString());
        return result;


    }
}

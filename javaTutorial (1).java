import java.util.function.Predicate;
import java.util.function.BiPredicate;

public class javaTutorial {

    public static void main(String[] args) {

        Predicate<String> p = (str) -> {
            return str.length() > 2;
        };

        Predicate<String> p2 = (str) -> {
            return str.equals("ABC");
        };

        System.out.println(p.and(p2).test("ABC")); 
        // we also have or, negate methods

        System.out.println(p.test("A"));

        System.out.println(p.test("Abcd"));  // fixed unclosed string

        // BiPredicate takes 2 parameters
        BiPredicate<String, String> bip = (str1, str2) -> {
            return str1.equals(str2);
        };

        System.out.println(bip.test("abc", "ABC"));
        System.out.println(bip.test("ABC", "ABC"));
        
        

    }
}
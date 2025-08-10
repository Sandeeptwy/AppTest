import java.util.HashSet;
import java.util.Set;

public class DuplicateValues {

    public static void main(String[] args) {
        String name = "Sandeep TiwarisS";

        Set<Character> s1 = new HashSet<>(); // to validate re duplicate elements
        Set<Character> s = new HashSet<>();

        for (Character c : name.toLowerCase().toCharArray()) {
            if (s.contains(c)) {
                if (!s1.contains(c)) {
                    s1.add(c);
                    System.out.print(c + ",");
                }
            } else {
                s.add(c);
            }
        }
    }
}

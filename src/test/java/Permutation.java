import java.util.ArrayList;
import java.util.List;

public class Permutation {

    static List<Character> arr = new ArrayList<>();

    public static void main(String[] args) {
        String name = "abc";

        System.out.println(combination(arr, name));

    }

    public static List<Character> combination(List<Character> arr2, String name) { //bc

        List<Character> tempArray = new ArrayList<>();

        if (arr2.size() == name.length()) {
            return tempArray;
        }

        for (Character c : name.toCharArray()) {
            if (!tempArray.contains(c)) {
                tempArray.add(c);                   // a bc   //  abc // ac b   //b ac
                combination(tempArray, name);
            }
        }

        // tempArray.remove();
        return tempArray;

    }
}

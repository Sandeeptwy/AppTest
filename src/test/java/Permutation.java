import java.util.ArrayList;
import java.util.List;

public class Permutation {

    static List<List<Character>> arr = new ArrayList<>();

    public static void main(String[] args) {
        String name = "abc";

        combination(arr, new ArrayList<Character>(), name);
        System.out.println(arr);

    }

    public static void combination(List<List<Character>> arr2, List<Character> temp, String name) { //bc

        if (temp.size() == name.length()) {
            arr.add(new ArrayList<>(temp));
            return;
        }

        for (Character c : name.toCharArray()) {
            if (!temp.contains(c)) {
                temp.add(c);                   // a bc   //  abc // ac b   //b ac
                combination(arr, temp, name);
                temp.remove(temp.size() - 1);
            }
        }

        // tempArray.remove();
    }
}

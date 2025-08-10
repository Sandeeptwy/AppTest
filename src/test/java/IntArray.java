import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntArray {


    public static void main(String[] args) {

        Set<String> y = new HashSet<>();
        int[] array = {3, 7, 1, 2, 8, 4, 5};

        int target = 10;


        for (int i = 0, j = i + 1; i < array.length - 2;) {

            System.out.println("" + array[i] + array[j]);

            if (array[i] + array[j] == target) {
                y.add("" + array[i] + array[j]);
            }
         //   j++;
         /*   if (array[i] + array[j] + array[i + 2] == target) {
                y.add("" + array[i] + array[i + 1] + array[i + 2]);
            }*/

            if (j == array.length - 1) {
                System.out.println("i++");
                i++;
                  j = i + 1;
            }
        }

        System.out.println(y);
    }


}

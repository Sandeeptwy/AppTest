import java.util.Arrays;

public class MergeIntArray {


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        int[] array3 = new int[8];
        boolean flag = false;

        for (int i = 0, y = 0; i < (array1.length + array2.length); i++) {

            if (!flag) {
                array3[i] = array1[i];
            } else {
                System.out.println("Inside else: " + array2[y]);
                array3[i] = array2[y];
                y++;
            }

            if (i == array1.length - 1 && !flag) {
                flag = true;
            }
            if (y == array2.length) {
                System.out.println("break at " + y);
                break;
            }
        }

        System.out.println(Arrays.toString(array3));
    }
}

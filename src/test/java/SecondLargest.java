public class SecondLargest {

    public static void main(String[] args) {
        int array[] = {3, 7, 1, 2, 8, 4, 5, 8, 7, 7, 6};

        int max = array[0];
        int secondMax = array[1];

        for (int i = 0; i < array.length - 1; i++) {

            if (max < array[i]) {
                secondMax = max;
                max = array[i];
            } else if (secondMax < array[i] && array[i] != max) { //Duplicate
                    secondMax = array[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("SecondMax: " + secondMax);
    }
}

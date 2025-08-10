import java.util.HashMap;

public class CharCount {

    public static void main(String[] args) {
        String str = "888BBBCC";//AAABBCCCDA";

        //    HashMap<Character, Integer> map = new HashMap<>();


        char[] ch = str.toCharArray();

      //  boolean flag;

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            try {
                if (ch[i] == ch[i + 1]) {
                    count++;
                } else {
                    System.out.print("" + ch[i] + count);
                    count = 1;
                }
            } catch (Exception ignore) {
                System.out.println("" + ch[i] + count);

            }

        }

/*
            if (map.containsKey(ch[i])) {
                int value = map.get(ch[i]);
                map.put(ch[i], value + 1);

            } else {
                map.put(ch[i], 1);
            }
        }

       // for (int y = 0; y < map.size(); y++) {
            System.out.println(map.entrySet());*/
        // }
    }
}

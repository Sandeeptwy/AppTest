import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class StringProg {
    //["eat","tea","tan","ate","nat","bat"]
    //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    static List<List<String>> list = new ArrayList<>();

    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};

        validate(list, new ArrayList<>(), str);
        System.out.println(list);

    }


    public static void validate(List<List<String>> list, ArrayList<String> arr, String[] str) {
        if (arr.size() == str.length) {
            list.add(arr);
            return;
        }

        for (String s : str) {
            if (arr.contains(s)) {
                continue;
            }
            if (validateChar(str, s)) {//eat//eat
                arr.add(s);
                System.out.println(arr);
            }
         //   validate(list, arr, str);
         //   arr.remove(arr.size() - 1);
        }

    }

    public static boolean validateChar(String[] s, String actual) {

        for (int i = 0; i < s.length; i++) {
            if (actual.length() == s[i].length()) {
                for (char a : actual.toCharArray()) {
                //    System.out.println("char: " + a);
                    if (!s[i].contains(String.valueOf(a))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
/*

Parent class:
WebDriver driver;

getDriver()

child class:extends

@Parameters(browser)

@BeforeSuite
mathod()
    if(platform.

equal("Android"))

        {
driver =new AndroidDriver
    }
            if(platform.

equal("iOS"))

        {
driver =new iOsDriver
    }


            1.
Valid payload:auth
2.
Invlaid payload:
        empty body, without
madatory key-
value.check with
invalid data
type for values,
        invlid auth, expired
auth.PUT,
        Invalid email, additional
key-
value in
body,
        invalid json, invalid -xml,
Rate limiting
3.
duplicate datas
Validate with
Get for creation
*/
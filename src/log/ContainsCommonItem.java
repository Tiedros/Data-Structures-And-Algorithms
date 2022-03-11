package log;

import java.util.HashMap;
import java.util.Map;

public class ContainsCommonItem {

    public static boolean containsCommonItem(char[] firstArray, char[] secondArray) {
        // O(n^2) time complexity
        //O(1) space complexity
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j])
                    return true;
            }
        }
        return false;
    }

    public static boolean containsCommonItemUsingHashMap(char[] firstArray, char[] secondArray) {
        // O(n) Time complexity
        // O(n) space complexity since we are creating hashmap.
        Map<Character, Boolean> myMap = new HashMap<>();
        for (int i = 0; i < firstArray.length; i++) {
            if ( !myMap.containsKey(firstArray[i]))
                myMap.put(firstArray[i], true);

        }
        for (int i = 0; i < secondArray.length; i++) {
            if (myMap.containsKey(secondArray[i]))
               return true;

        }
        return false;
    }



}

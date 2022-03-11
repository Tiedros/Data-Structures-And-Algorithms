package log;

import java.util.HashSet;
import java.util.Set;

public class HasWithPairSum {

    public static boolean hasWithPairSum(int [] values, int sum){
        //O(n^2) Time complexity
        // O(1) space compexity
        for(int i=0;i<values.length;i++){
            for(int j=i+1;j<values.length-1;j++){
                if(values[i]+values[j] == sum)
                    return true;
            }
        }
        return false;

    }

    public static boolean hasWithPairSumUsingSet(int [] values, int sum){
        // O(n) time and space complexity
        Set<Integer> mySet = new HashSet<>();
        for(int i=0;i<values.length;i++){
            if(mySet.contains(values[i]))
                return true;
            else
                mySet.contains(sum-values[i]);
        }
        return false;

    }
}

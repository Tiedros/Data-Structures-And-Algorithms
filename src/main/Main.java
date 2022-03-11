package main;

import log.ContainsCommonItem;
import log.HasWithPairSum;
import log.Print;

class Main {
    public static void main(String[] args)
    {
    	char [] arr = {'a','b','c','d','e'};
    	System.out.println("********logAllPairsOfArray****");
    	Print.logAllPairsOfArray(arr);
    	
    	System.out.println("********printAllNumbersThenAllPairSums****");
    	Print.printAllNumbersThenAllPairSums(arr);


		System.out.println("********ContainsCommonItem****");
		char [] firstArray = {'a','b','c','x'};
		char [] secondArray = {'z','y','a'};
		System.out.println("Contains : " + ContainsCommonItem.containsCommonItem(firstArray,secondArray));
		System.out.println("********containsCommonItemUsingHashMap****");
		System.out.println("Contains : " + ContainsCommonItem.containsCommonItemUsingHashMap(firstArray,secondArray));


		System.out.println("********HasWithPairSum****");
		int [] values = {2,3,4,7,9};
		int sum=8;
		System.out.println("Contains : " + HasWithPairSum.hasWithPairSum(values,sum));
		System.out.println("Contains : " + HasWithPairSum.hasWithPairSumUsingSet(values,sum));

    }
    
     
}
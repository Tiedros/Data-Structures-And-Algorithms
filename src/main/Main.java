package main;

import log.Print;

class Main {
    public static void main(String[] args)
    {
    	char [] arr = {'a','b','c','d','e'};
    	System.out.println("********logAllPairsOfArray****");
    	Print.logAllPairsOfArray(arr);
    	
    	System.out.println("********printAllNumbersThenAllPairSums****");
    	Print.printAllNumbersThenAllPairSums(arr);
    }
    
     
}
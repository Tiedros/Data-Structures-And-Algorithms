package log;

public class Print {
	
	public static void  logAllPairsOfArray(char [] arr) {
    	// this loop runs in O(n^2)
   	 for(int i=0;i<arr.length;i++) {
   		 for(int j=0;j<arr.length;j++) {
   			 System.out.println(arr[i]+","+ arr[j]);
   		 }
   	 }
   }
	public static void printAllNumbersThenAllPairSums(char []arr) {
		//Over all the method runs in O(n + n^2)  which is O(n^2)
		
		// this loop runs in O(n)
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		// this loop runs in O(n^2)
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i] +" , "+ arr[j]);
			}
		}
		
	}

}

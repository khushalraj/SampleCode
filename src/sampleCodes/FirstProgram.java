package sampleCodes;

//packege is a collection of classes
//main method is an entry point of execution
//diff between for and for each
//for loop:if we know the starting and ending point
//for each:if we don't know the starting and ending point
public class FirstProgram {
	public static void main(String[] args) {
		// it will alliocate contiguous memory allocation and it will store 4
		// elements.
		// int partyIds[] = new int[4];
		int arr[] = { 10, 20, 30, 40 };
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		for(int element: arr){
			System.out.println(element);
		}
	}
}

/**
						 * Issa Ouedraogo
						 * Cisc 3130: Data Structure and Algorithm
						 * Prof. Katherine Chuang
						 * Assignment #2
						 */

import java.util.Arrays;
import java.util.PriorityQueue;

public class MergIng2SortedList {
	
	// Static Method for merging 2 sorted List into one sorted List
	
	
	public static void Merge2Sortedlist(int[] list1, int[] list2) {
		
		PriorityQueue<Integer> myQueue = new PriorityQueue<>();
		for(int i= 0; i<list1.length;i++) {
			myQueue.add(list1[i]);
		}
		for(int j= 0; j<list2.length;j++) {
			myQueue.add(list2[j]);
		}
		String output = "";
	    while(myQueue.peek() != null ){
	    	
	      //One by one pop all characters from stack and put them back to string.
	      output += Integer.toString(myQueue.poll())+" ";
	
	    }
	    // Display the sorted List as string array
	    System.out.println("Output\t" + Arrays.toString(output.split(" ")));
		
	}
	public static void main(String[] args) {
		
		 	int[] input1 = {1,3,5,9,100};
		 	int[] input2 = {2,4,5,67};
		    // Display Input1
		    System.out.println("Input1\t" + Arrays.toString(input1));
		    // Display Input2
		    System.out.println("Input2\t" + Arrays.toString(input2));
		    //Display Merge List
		    Merge2Sortedlist(input1,input2);
		    System.out.println("--------------------------------------------");
		    
		    int[] input3 = {0,1,3,5,9,100};
		 	int[] input4 = {2,4,5,67,34,102,2001};
		    // Display Input1
		    System.out.println("Input1\t" + Arrays.toString(input3));
		    // Display Input2
		    System.out.println("Input2\t" + Arrays.toString(input4));
		    // Display Merge List
		    Merge2Sortedlist(input3,input4);
		    System.out.println("--------------------------------------------");
		    
		    int[] input5 = {-1,0,1,3,5,9,100};
		 	int[] input6 = {-14,2,4,5,67,34,102,-2};
		    // Display Input1
		    System.out.println("Input1\t" + Arrays.toString(input5));
		    // Display Input2
		    System.out.println("Input2\t" + Arrays.toString(input6));
		    // Display Merge List
		    Merge2Sortedlist(input5,input6);
		    System.out.println("--------------------------------------------");

		}
	}
		
	

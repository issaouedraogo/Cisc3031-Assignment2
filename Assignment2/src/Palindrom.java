/**
						 * Issa Ouedraogo
						 * Cisc 3130: Data Structure and Algorithm
						 * Prof. Katherine Chuang
						 * Assignment #2
						 */
import java.util.Stack;

public class Palindrom {
	
	/**
	 * Method PalindromTest()
	 * input: 
	 * * input: String representing the word to check
	 * Process:
	 * * Turn the word into an stack of characthers
	 * * then retrieve the content which stack give in the reverse order
	 * * and finally check if reverse order match with the original input
	 * output
	 * * return an true of it match and false if not
	 */
	public static boolean PalindromTest(String input) {
		
		Stack<Character> stack = new Stack<Character>(); 
		for (int i = 0; i < input.length(); i++) 
			{ 
			stack.push(input.charAt(i)); 
			} 
		String reverseInput = ""; 
		while (!stack.isEmpty()) 
		{ 	
			// retrieve in the stack content in the reverse order.
			reverseInput += stack.pop(); 
		} 
		if (input.toLowerCase().equals(reverseInput.toLowerCase()))
		{
			return true;
		}else {
			  return false;
		}

		
	}
	public static void main(String[] args) {
		
		String input = "Annabel";
		// Display Sample input1
	    System.out.println("Input\t" + input);
	    // Display output
	    System.out.println("Output\t" + PalindromTest(input));
	    System.out.println("-----------------------");
	    
		String input1 = "Anna";
		// Display Sample input1
	    System.out.println("Input1\t" + input1);
	    // Display output
	    System.out.println("Output1\t" + PalindromTest(input1));
	    System.out.println("-----------------------");
	    
	    String input2 ="Civic";
	    System.out.println("Input2\t" + input2);
	    System.out.println("Output2\t" + PalindromTest(input2));
	    System.out.println("-----------------------");
	    
	    
		String input3 ="Google";
		System.out.println("Input3\t" + input3);
	    System.out.println("Output3\t" + PalindromTest(input3));
	    System.out.println("-----------------------");
	    
	    
		String input4 = "Racecar";
		System.out.println("Input4\t" + input4);
	    System.out.println("Output4\t" + PalindromTest(input4));
	    System.out.println("-----------------------");
	    
	}

}

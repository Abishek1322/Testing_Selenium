package HomeAssignments;
import java.util.*;  

public class Palindrome {

		   public static void main(String args[])    
		   {    
		      String original, reverse = "";    
		      Scanner in = new Scanner(System.in);     
		      System.out.println("Enter a word to check if it is a palindrome");    
		      original = in.nextLine();  //gets input from the user   
		      int length = original.length();//calculates the length of the given word 
		      
		      for ( int i = length - 1; i >= 0; i-- )    
		         reverse = reverse + original.charAt(i);  //charAt returns the character at the specified index in a string.  
		      if (original.equals(reverse))    //.equals checks if the original and reversed strings are same 
		         System.out.println("Entered word is a palindrome.");    
		      else    
		         System.out.println("Entered word isn't a palindrome.");     
		   }       
	}


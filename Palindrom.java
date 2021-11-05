package week1.day2;

public class Palindrom {

	public static void main(String[] args) {
		String str="madam";
		System.out.println("First string: "+str);
		String rev = "";
		 int length = str.length(); 
		 for ( int i = length - 1; i >= 0; i-- )  
	         rev = rev + str.charAt(i);  
			System.out.println("Reversed string: "+rev);
		   if (str.equalsIgnoreCase(rev))  
		         System.out.println("Given string is a palindrome"); 
		   else
			   System.out.println("Given string is not a Palindrome");
	}
		
	}



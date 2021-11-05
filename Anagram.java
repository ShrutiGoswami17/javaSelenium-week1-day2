package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		boolean b = true ;
		if(text1.length()== text2.length()) {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2= text2.toCharArray();
			System.out.println("Characters in 1st String");
			
			for (int i = 0; i < charArray1.length; i++) {
				System.out.println("charArray1["+i+"]: " + charArray1[i]);
			}
			
			System.out.println("Chracters in 2nd String ");
			for (int l = 0; l < charArray2.length; l++) {
				System.out.println("charArray2["+l+"]: " + charArray2[l]);
			}
			
			System.out.println("Sorting of Characters in both the String ");
			Arrays.sort(charArray1);  
			Arrays.sort(charArray2);
			
	        b = Arrays.equals(charArray1, charArray2);  
	        
	    		   if(b)
	    			 
	    			   System.out.println(" Both the Arrays have same characters - Anagrams ");
	    		   else
	    			   System.out.println("Both the Arrays have different characters -  Not Anagrams ");        
		}

}
}

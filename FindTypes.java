package week1.day2;

public class FindTypes {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		int  letter = 0, space = 0, num = 0, specialChar = 0;
		System.out.println("Characters in the String ");

		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		
		for(int i=0; i<charArray.length; i++) {
			

			if (Character.isLetter(test.charAt(i)))
				letter++;
			else if(Character.isDigit(test.charAt(i)))
				num++;
			else if(Character.isSpaceChar(test.charAt(i)))
				space++ ;

			else
				specialChar++;

		}
		System.out.println("Printing the count of each type in the string ");

		System.out.println("Letter: " + letter);
		System.out.println("Space: " + space);
		System.out.println("Number: " + num);
		System.out.println("SpecialCharcter: " + specialChar);
	}

}

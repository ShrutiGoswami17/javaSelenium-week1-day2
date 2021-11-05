package week1.day2;

import org.bouncycastle.util.Arrays;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		
		System.out.println("The string is :"+str);
		
		char charArray[]=str.toCharArray();
		int len=charArray.length;
		
		for(int i=0;i<len-1;i++)
		{
			if(charArray[i]=='e' || charArray[i]=='E')
				count++;
				
				
		}
		
		if(count>0)
			System.out.println("The number of time 'e' occured is "+count );

		else
			System.out.println("'e' has not occured in the statement" );
	}

}

package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,7,6,8};
		
		System.out.println("Array elements:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Printing sorted Array elements:");
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Printing missing Array elements:");
		for(int i=1;i<arr.length;i++)
		{
			if(i!=arr[i-1])
			{
			System.out.println(i);
			break;
			}
		}
	}

}

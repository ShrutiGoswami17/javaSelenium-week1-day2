package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		
		int length=arr.length;
		int count=0;
		
		System.out.println("Printing the array:");
		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("--------------------------------");
		
		for(int i=0;i<length;i++)
		{
			for(int j=i;j<length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					count+=1;
				}
			}
			if(count>1)
				System.out.println(arr[i]);
		}
	}

}
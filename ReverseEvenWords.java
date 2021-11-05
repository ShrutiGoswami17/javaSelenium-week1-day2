package week1.day2;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String str = "I am a software tester";
		System.out.println(str);
		String[] splitArr = str.split(" ");
		System.out.println("Splitting and traversing the string");
		
		for (int i = 0; i < splitArr.length; i++) {
			System.out.println("splitArr["+i+"]: " + splitArr[i]);
		}
		
		System.out.println("Printing the even position words in reverse order");
		
		for (int i = 0; i < splitArr.length; i++) {
			    	if (i % 2 != 0) {
			    		char arr1[] = splitArr[i].toCharArray();
						for (int j = (arr1.length) - 1; j >= 0; j--) {
							System.out.print(arr1[j]);
						}
						System.out.print(" ");	
				}

				else {
					System.out.print(splitArr[i]);
					System.out.print(" ");
				}

			}
	}
}

package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		
		System.out.println("Sum of numbers: "+cal.add(1,2,3));
		System.out.println("Subtraction of numbers: "+cal.sub(10,2,3));
		System.out.println("Division of numbers: "+cal.divide(10,2));
		System.out.println("Multiplication of numbers: "+cal.mul(1,2));
		
		
	}

}

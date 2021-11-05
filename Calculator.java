package week1.day2;

public class Calculator {
	
	int num1=0,num2=0,num3=0;
	int sum=0,sub=0;
	float div=0.0f;
	double mul=0.0d;
	
	public int add(int num1,int num2,int num3)
	{
		sum=num1+num2+num3;
		return sum;
	}
	
	public int sub(int num1,int num2,int num3)
	{
		sub=num1-num2-num3;
		return sub;
	}
	
	public float divide(float num1,float num2)
	{
		div=num1/num2;
		return div;
	}
	
	public int mul(double num1,double num2)
	{
		mul=num1*num2;
		return sum;
	}
	

	public static void main(String[] args) {

	}

}

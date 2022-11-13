package Exercises;

public class PrimeNumber {

	public static void main(String[] args) {
		int flag = 0;
	int a = 17;
	int b= a/2;

	for (int i=3; i<=b;i++)
	{
		if(a%i==0)
		{
			System.out.println("not prime");
			flag = 1;
			break;
		}
	}
			if(flag==0) {
			System.out.println(" prime");
		}
	}}
	
	



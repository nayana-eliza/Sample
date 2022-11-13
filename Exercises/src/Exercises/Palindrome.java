package Exercises;

public class Palindrome {

	public static void main(String[] args) {
		String s= "malayalam";
		char[] ch = s.toCharArray();
		String reverse = "" ;
			for (int j=ch.length-1;j>=0;j--)
{reverse = reverse + s.charAt(j);}
	if(s.equals(reverse)) {
		System.out.println("Palindrome");
	
	}
	else
	{
		System.out.println("not palindrome");	
	}
}
		}



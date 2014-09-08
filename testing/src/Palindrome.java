import java.util.Scanner;


public class Palindrome {
public static void main(String[] args){
	String original, reverse="";
	Scanner in = new Scanner(System.in);  
	System.out.println("Enter a string to check");
	original=in.nextLine();
	Integer length=original.length();
	System.out.print(length);
	for(int i=length-1;i>=0;i--)
	{
		reverse=reverse+original.charAt(i);
		
		System.out.print(reverse);
		System.out.print("\n");
	}
	if(original.equals(reverse))

		System.out.println("PALINDROME");
	
	else
		System.out.println("NOT PALINDROME");
}
}


import java.util.Scanner;


public class MethodsOne {
	public static void main(String[] args){
		Integer num1, num2;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the two numbers \n");
		num1=in.nextInt();
		num2=in.nextInt();
		Integer min=minFunction(num1,num2);
		System.out.println("The Min is: "+ min);
	}
	
	public static int minFunction(int a, int b){
		int Min;
		if(a>b)
			Min=b;
		else
			Min=a;3
		return Min;
	}

}

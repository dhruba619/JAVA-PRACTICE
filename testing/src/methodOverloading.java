import java.util.Scanner;


public class methodOverloading {
	public static void main(String[] args){
		int num1,num2;
		double num3,num4;
		Scanner in =new Scanner(System.in);
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextDouble();
		num4 = in.nextDouble();
		int min1 = minFunction(num1,num2);
		double min2 = minFunction(num3,num4);
		System.out.println("The min Integer : \n"+min1);
		System.out.println("The min Double : \n"+min2);
	}
public static int minFunction(int a , int b){
	if (a>b)
		return b;
	else
		return  a;
}
public static double minFunction(double a , double b){
	if (a>b)
		return b;
	else
		return  a;
}
}


public class VariableArguments {
	public static void main(String[] args){
		printMax(3,4,5,6,7,8,9,0);
		printMax(new double[]{0.435, .6789, 0.343});
	}
	public static void printMax(double...numbers){
		if(numbers.length==0){
			System.out.println("No argumnets passed \n");
		}
		else{
		double result =	numbers[0];
		for(int i=1;i<numbers.length;i++)
			if(numbers[i]>result)
				result=numbers[i];
			System.out.println("The max is: "+result);
		
		}
			
	
		
	}
}

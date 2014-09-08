
public class InsertionSort {
	public static void main(String[] args){
		int[] demoArray = {59,25,89,345,2};
		for(int i=0;i<demoArray.length;i++){
			System.out.print(demoArray[i]);
			System.out.println(" ");
		}
			
		for (int j=1;j<demoArray.length-1;j++){
			int value =demoArray[j];
			int index=j;
			while(demoArray[j-1]>value && index>0){
				demoArray[j]=demoArray[j-1];
				index=j-1;
			}
			value=demoArray[index];
		}
		for(int i=0;i<demoArray.length;i++){
			System.out.print(demoArray[i]);
			System.out.println(" ");                                                                                                                       
	}
	
}
}

public class SelectionSort {
	public static void main(String[] args){
		int[] demoAr = {23,78,90,12,45};
		
		for(int i=0;i<demoAr.length-1;i++)
		{
			int iMin = i;
			for(int j =i+1;j<demoAr.length;j++){
				if(demoAr[j]>demoAr[iMin])
					iMin=j;
			}
			int temp = demoAr[i];
			demoAr[i]=demoAr[iMin];
			demoAr[iMin]=temp;

		}
		for(int i=0;i<demoAr.length;i++){
			System.out.print(demoAr[i]);
			System.out.println(" ");
		}
		
	}
	
}

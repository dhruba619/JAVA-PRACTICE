
public class Sorting {
	public void swap(int a, int b){
		int tempVar=a;
		a=b;
		b=tempVar;
	}
	public int partion(int[] array, int start, int end){
		int pivot = array[end];
		int partionIndex = start;
		
//		for (int count = start; count <= end; count++) {
//			for(int j = count+1; j<=end; j++){
//				if(array[count] > array[j]){
//					int temp = array[count];
//					array[count] = array[j];
//					array[j] = temp;
//				}
//			}
//			
//		}
//		
		for(int count =start;count<end;count++){
			if(array[count]<=pivot){
				int temp = array[count];
				array[count] = array[partionIndex];
			 array[partionIndex] = temp;
			 partionIndex=partionIndex+1;
			}
				
				}
			
		
		//swap(array[partionIndex],array[end]);
		for(int count=0;count<array.length;count++)
			System.out.print(" "+array[count]);
		return partionIndex;
	}
}


public class insertionSortTry {
	public static void main(String[] args){
		int[] arr = {21,34,43,4};
		
		for(int count=1;count<=arr.length-1;count++){
			int value = arr[count];
			int index = count;
			while(arr[count-1]>value && count>0){
				arr[count]=arr[count-1];
				index=count-1;
				}
			value = arr[index];
		}
		for(int count =0;count<arr.length;count++){
		 System.out.println(" "+arr[count]);
		}
	}

}


public class BubbleSortTry {
	public static void main(String[] args){
		int[] arr = {12,11,10,2,3};
		for (int count =0;count<arr.length-1;count++){
			for (int counti= 0;counti<arr.length-1;counti++){
				if(arr[counti]<arr[counti+1]){
					int temp =arr[counti];
					arr[counti]=arr[counti+1];
					arr[counti+1]=temp;
					         
				}
				
			}
		}
			for(int counte =0;counte<arr.length;counte++){
				 System.out.println(" "+arr[counte]);
			}		
	
}
}
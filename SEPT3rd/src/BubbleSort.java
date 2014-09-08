
public class BubbleSort {
	public static void main(String[] args)
	{
		int[] arr = {23,67,9,34,565,23,76,23,786,235,546768};
	
		//bubble sort
		for (int i =0;i<arr.length-1;i++)
		{
		for (int j=0;j<arr.length-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
		for(int i=0;i<arr.length;i++)
		System.out.println(" "+arr[i]);
	}
}

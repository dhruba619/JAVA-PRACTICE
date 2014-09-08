
public class Array2 {
	public static void main(String[] args){
		double[] myList={1.2,3.5,4.4,5.6};
		for(Integer count=0;count<myList.length;count++){
			System.out.println(myList[count]);
		}
		double sum=0;
		for(Integer count=0;count<myList.length;count++){
			sum =sum+ myList[count];
		}
		System.out.print(sum);
		double max=myList[0];
		for (int count=1;count<myList.length;count++){
			if(myList[count]>max) max=myList[count];
		}
		System.out.println("\n");
		System.out.println(max);
	}

}

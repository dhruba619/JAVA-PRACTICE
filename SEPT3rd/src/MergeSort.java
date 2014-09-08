
public class MergeSort {
	public static void main(String[] args){
		int[] A={23,56,90,12,4,6};
		int lengthA =A.length;
		//dividing the array in two parts
		int midLength;
		if(lengthA%2==0)
			midLength = lengthA/2;
		else
			midLength = (lengthA+1)/2;
		int lengthL=midLength;
		int lengthR = lengthA-midLength;
		int[] L=new int[lengthL];
		
		int[] R = new int[lengthR];
		
		for(int count = 0;count<lengthL;count++)
			L[count]=A[count];
		for(int count =lengthL;count<=lengthR;count++)
			R[count]=A[count];
		int countA =0;
		int countL =0;
		int countR =0;
		while(countL < L.length && countR < R.length){
			if(L[countL] < R[countR]){
				A[countA]=L[countL];
				countA=countA+1;
				countL=countL+1;
			}
			else{
				A[countA] = R[countR];
				countA = countA+1;
				countR=countR+1;
			}
		}
		for(int countP=0;countP<A.length;countP++)
		System.out.println(" "+A[countP]);
	}
}

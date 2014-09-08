import java.util.Scanner;


public class AddMatrix {
	public static void main(String args[]){
		Integer numRows, numColomn, count1,count2;
		Scanner in=new Scanner(System.in);
	System.out.println("Enter the number of rows and colomns\n");
	numRows=in.nextInt();
	numColomn=in.nextInt();
	int firstMatrix[][]=new int [numRows][numColomn];
	int secondMatrix[][]=new int[numRows][numColomn];
	int sum[][]=new int [numRows][numColomn];
	System.out.println("ENTER the elements of the matrix \n");
	for(count1=0;count1<numRows;count2++){
		for(count2=0;count2<numColomn;count2++){
			firstMatrix[numRows][numColomn]=in.nextInt();
		}
	}
	System.out.println("Enter the second matrix\n");
	for(count1=0;count1<numRows;count2++){
		for(count2=0;count2<numColomn;count2++){
			secondMatrix[numRows][numColomn]=in.nextInt();
		}
	}
	for ( count1 = 0 ; count1 < numRows ; count1++ )
        for ( count2 = 0 ; count2 < numColomn ; count2++ )
            sum[numRows][numColomn] = firstMatrix[numRows][numColomn] + secondMatrix[numRows][numColomn]; 

     System.out.println("Sum of entered matrices:-");

     for ( count1 = 0 ; count1 < numRows ; count1++ )
     {
        for ( count2= 0 ; count2 < numColomn ; count2++ )
           System.out.print(sum[numRows][numColomn]+"\t");

        System.out.println();
     }
  }
	}



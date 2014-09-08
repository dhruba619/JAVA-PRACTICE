
public class SortingTest {
	public static void main(String[] args){
		Sorting quick =new Sorting();
		int[] array = {23,488,67,2,89};
		int partionIndex = quick.partion(array, 0, 4);
		System.out.println("   partition" +partionIndex);
	}
}

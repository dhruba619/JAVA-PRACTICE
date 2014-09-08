
public class PassByValue {
	public static void main(String[] args){
	int primtivVar = 890;
	passByValue(primtivVar);
	 
	System.out.println("Value after Passing is:" +primtivVar);
	}
public static void passByValue(int p){
	p=12345;
}
}

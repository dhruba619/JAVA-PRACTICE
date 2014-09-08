import java.util.*;

public class StackTest {
	static void showPush(Stack st, int a) {
	  st.push(new Integer(a));
	    System.out.println("push(" + a + ")");
	    System.out.println("stack: " + st);
	 }
	public static void main(String[] args){
		Stack num = new Stack();
		showPush(num,23);
	}
}

import java.util.*;
public class TestStack {
	static void showpop(Stack st){
	System.out.print("pop-->");
	Integer a =(Integer) st.pop();
	System.out.println(a);
	System.out.println("stack:" + st);	
	}
	static void showpush(Stack st, int a){
		st.push(new Integer(a));
	}
	public static void main(String[] args){
		Stack st = new Stack();
		System.out.println("Stack:" + st);
		showpush(st,43);
		showpop(st);
		try{
			showpop(st);
		} catch  (EmptyStackException e){
			System.out.println("Empty Stack");
		}
		
	}

}

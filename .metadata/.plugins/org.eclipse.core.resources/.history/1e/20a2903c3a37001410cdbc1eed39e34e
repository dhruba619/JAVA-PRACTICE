import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;


public class HashTable {
	public static void main(String[] args){
		Hashtable points = new Hashtable();
		Enumeration data;
		Scanner ip = new Scanner(System.in);
		
		points.put("TonyStark", ip.next());
		points.put("BruceWayne", ip.next());
		points.put("BruceBaner", ip.next());
		points.put("ClerkKent", ip.next());
		data = points.keys();
		while(data.hasMoreElements()){
			String str = (String)data.nextElement();
			System.out.println(str+": "+points.get(str));
		}
		String add;
		add = (String)points.get("TonyStark");
		points.put("TonyStark", add+" PepperPots");
		System.out.println(points.get("TonyStark"));
	}
	
}

import java.util.Enumeration;
import java.util.Hashtable;
public class VectorTest {
	public static void main(String[] args){
		Vector transformers = new Vector(3,3);// Vector with initial size 3 , and increament 3.
		System.out.println("Intial Size:" + transformers.size());
		System.out.println("Initial Capacity: " + transformers.capacity());
		transformers.addElement(new String("adghfhdhd"));
		transformers.addElement(new Double(6.08));
		System.out.println("Size:" + transformers.size());
		System.out.println(" Capacity: " + transformers.capacity());
		Enumeration disp = transformers.elements();
		System.out.print(disp.nextElement());
		transformers.add(0,"optimus prime");
		System.out.println("Size:" + transformers.size());
		transformers.add("optimus prime");
		System.out.println("Size:" + transformers.size());
		System.out.println("Size:" + transformers.hashCode());
		System.out.println("Size:" + transformers.get(0));
	}

}

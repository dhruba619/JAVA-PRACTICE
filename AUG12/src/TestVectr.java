import java.util.Vector;
import java.util.*;

public class TestVectr {
	public static void main(String[] args){
		Vector v=new Vector(3,2);
		System.out.println("Initial Capacity:" + v.capacity());
		System.out.println("Initial Size:" + v.size());
		v.addElement(new Integer(23));
		v.addElement(new Integer(45));
		v.addElement(new Float(56.6768));
		v.addElement(new Character('r'));
		System.out.println("Present Capacity:" + v.capacity());
		System.out.println("IPresent Size:" + v.size());
		Enumeration vEnum;
		vEnum=v.elements();
		while (vEnum.hasMoreElements()){
			System.out.print(vEnum.nextElement()+" ");
		}
		
		
	}
	
	

}

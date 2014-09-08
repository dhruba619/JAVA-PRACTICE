import java.util.Vector;
import java.util.Enumeration;
public class TestEnum {
	public static void main(String[] args){
		Enumeration days;
		Vector dayNames = new Vector();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		dayNames.add("DJday");
		days=dayNames.elements();
		while (days.hasMoreElements()){
			System.out.print(days.nextElement());
			System.out.print("\n");
		}
		
	}

}

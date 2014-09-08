import java.util.Enumeration;
import java.util.Vector;
import java.util.Scanner;
public class EnumerationTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Enumeration days;
		Vector dayNames = new Vector();
		String day= input.nextLine();
		dayNames.add(day);
		dayNames.add(" Tuesday");
		dayNames.add(" revifhvbf");
		days = dayNames.elements();
		while(days.hasMoreElements()){
			System.out.print(days.nextElement());
		}
		
	}
}
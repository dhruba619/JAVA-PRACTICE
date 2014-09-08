class hollywood{
	public void move(){
		System.out.println("Guardians of the galaxy");
	}
}

class character extends hollywood{
	public void move(){
		super.move();
		System.out.println("Star lord");
	}
}
public class InheritanceOverriding {
	public static void main(String[] args){
		hollywood charOne = new hollywood();
		character charTwo = new character();
		charTwo.move();
	}

}

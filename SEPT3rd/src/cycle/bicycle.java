package cycle;

public class bicycle {
	public int cadance;
	public int speed;
	private int gear;
	public static int cycleId =0;
	
	public bicycle(int startCadance, int startSpeed, int startGear){ //constructor for the class bicyle.
		cadance=startCadance;
		speed=startSpeed;
		gear=startGear;
		cycleId = cycleId +1;
		}
//methods
	public setCadance(int newValue){
		cadance = newValue;
	}
	
	public setGear(int newValue){
		gear = newValue;
	}
	public int getGear(){
		return gear;
	}
	public accelerate(){
		speed +=speed;
	}
	public brake(){
		speed -=speed;
	}
	public int getId(){
		return cycleId;
	}
}


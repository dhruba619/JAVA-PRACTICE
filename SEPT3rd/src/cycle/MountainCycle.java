package cycle;

public class MountainCycle extends bicycle {
	public int seatHeight;
	public MountainCycle(int sSeatHeight,int startCadance, int startSpeed, int startGear){
		super(startCadance, startSpeed, startGear);
		seatheight=sSeatHeight;
		}
	public void setSeatHeight(int newValue){
		seatHeight = newValue;
	}

}

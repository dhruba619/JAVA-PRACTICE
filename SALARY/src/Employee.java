
public class Employee {
	private String name;
	private String address;
	int number;
	
	public Employee(String name, String address, int number){
		System.out.println("Constructing a new employee");
		this.name=name;
		this.address=address;
		this.number=number;
	}
	public void mailCheck(){
		System.out.println("Mailing a chack to" + this.name+ " " + this.address);
	}
	public String toString(){
		return name + " " + address + " " + number;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public int getNumber(){
		return number;
	}
	public void setAddress(String newAddress){
		address = newAddress;
	}
}

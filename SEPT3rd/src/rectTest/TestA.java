package rectTest;

public class TestA {
	public int roll;
	public int id;
	public TestA(int a, int b){
		this.roll = a;
		this.id = b;
		
	}
	public int getProduct(TestA dj){
		int q=0;
		q=dj.roll*dj.id;
		return q;
		
		
	}

}

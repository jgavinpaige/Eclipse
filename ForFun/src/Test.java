
public class Test {
	private int x;
	
	Test(){ x= 0; }
	Test(int z){ x = z; }
	
	void set_x(int z) { x = z; }
	
	public static void main(String[] args) {
		
		
		
	}

}

class child extends Test{
	public child() {
		super();
		set_x(10);
	}
	
	void set_x(int z) {
		super.set_x(-1 * z);
	}
}

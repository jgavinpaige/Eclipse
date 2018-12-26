import java.util.ArrayList;

public class World {
	
	static ArrayList<Pipe> pipes= new ArrayList<Pipe>();
	static Bird player= new Bird();
	
	public static void addPipe() {
		
		pipes.add(new Pipe());
		
	}
	
	public static Bird getBird() {
		
		return player;
		
	}
	
	public static void moveBird() {
		
		player.move();
		
	}
	
}

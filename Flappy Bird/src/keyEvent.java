import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyEvent implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {

	    int key = e.getKeyCode();

	    if (key == KeyEvent.VK_SPACE) {
	        World.getBird().flap();
	    }

	   
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
		 
		 
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
		
	}
	
}

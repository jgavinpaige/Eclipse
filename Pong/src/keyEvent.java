import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyEvent implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {

	    int key = e.getKeyCode();

	    if (key == KeyEvent.VK_UP) {
	        Pong.player.moveUp();
	    }

	    if (key == KeyEvent.VK_DOWN) {
	        Pong.player.moveDown();
	    }
	    
	    if (key == KeyEvent.VK_W) {
	        Pong.player.moveUp();
	    }

	    if (key == KeyEvent.VK_S) {
	        Pong.player.moveDown();
	    }
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
		Pong.player.stop();
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyEvent implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {

	    int key = e.getKeyCode();

	    if (key == KeyEvent.VK_W) {
	    		Player.moveUp();
	    }

	    if (key == KeyEvent.VK_S) {
	        Player.moveDown();
	    }
	    
	    if (key == KeyEvent.VK_A) {
	        Player.moveLeft();
	    }

	    if (key == KeyEvent.VK_D) {
	        Player.moveRight();
	    }
	    
	    if (key == KeyEvent.VK_E) {
	        Player.addLife();
	    }
	    
	    //both not implemented on JFrame yet
	    if (key == KeyEvent.VK_Z) {
	        Turret.upgradeReload();
	    }
	    
	    if (key == KeyEvent.VK_X) {
	        Turret.upgradeBulletSpeed();
	    }

	    
	    //this will become a turret spawner
	    if (key == KeyEvent.VK_SPACE) {
	    	Turret.update();
	    	
	    } 
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		 int key = e.getKeyCode();

		    if (key == KeyEvent.VK_W) {
		        Player.stopUD();
		    }

		    if (key == KeyEvent.VK_S) {
		        Player.stopUD();
		    }
		    
		    if (key == KeyEvent.VK_A) {
		        Player.stopLR();
		    }

		    if (key == KeyEvent.VK_D) {
		        Player.stopLR();
		    }
		    
		   /* if (key == KeyEvent.VK_S) {
		        Player.circleClockwise=0;
		    }

		    if (key == KeyEvent.VK_A) {
		        Player.circleCounterclockwise=0;
		    }
		    */
		     
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

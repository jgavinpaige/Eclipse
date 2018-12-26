import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouseEvent implements MouseListener{

	static boolean pressed= false;
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		if(pressed==true) {
			Player.startShooting();
		}
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		Player.shoot=false;
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		pressed=true;
		Player.startShooting();
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		pressed=false;
		Player.stopShooting();
		
	}

}

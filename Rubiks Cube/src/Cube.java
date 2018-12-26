
public class Cube {
	
	int x, y, length, width; //specifies the cube
	Point p1, p2, p3, p4, p5, p6, p7, p8; //sets up the points
	Point[] points= new Point[8];
	
	public Cube() {
		
		x=50;
		y=50;
		length= 100;
		width= 100;
		p1= new Point(x,y);
		p2= new Point(x+width,y);
		p3= new Point(x+width,y+length);
		p4= new Point(x,y+length);
		p5= new Point(x,y);
		p6= new Point(x+width-30,y);
		p7= new Point(x+width,y+length);
		p8= new Point(x,y+length);
		
		
	}
	
	public void roatateUp() {
		
		 
		
	}
	
	
}

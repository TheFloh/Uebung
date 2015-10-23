
public class SimplePaintableRectangle extends SimpleRectangle implements Paintable {
	
public SimplePaintableRectangle(double width, double height){
	super(width, height);}

public void paintTo(java.awt.Graphics g){
	g.fillRect((int)width, (int)height, 0, 0);}
}



import java.awt.Color;
public class PaintablePanel extends SizedPanel{

	Paintable pa;
	
	public PaintablePanel(Paintable pa){this.pa=pa;}
	
	public void PaintComponent(java.awt.Graphics g){
		pa.paintTo(g);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShowInFrame.show (new PaintablePanel(new PaintableOval(100,50,30,50,new Color(23,23,23))));
		ShowInFrame.show (new PaintablePanel(new PaintableOval(10,10,130,40,new Color(59,34,65))));
		ShowInFrame.show(new PaintablePanel(new SimplePaintableRectangle(45,34,54,43,new Color(45,32,76,88))));
	
	}
	

}

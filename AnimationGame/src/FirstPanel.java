import javax.swing.*;
public class FirstPanel extends JPanel{

	@Override public void paintComponent(java.awt.Graphics g) {
		g.fillRect(30,50,45,80);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	JFrame f= new JFrame();
	f.add(new FirstPanel());
	f.setVisible(true);
	
	
	}

}

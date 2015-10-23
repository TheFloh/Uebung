
public class SimpleSizedPanel extends SizedPanel{
	public void paintComponent(java.awt.Graphics g){
		g.fillRect(30,50,45,80);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ShowInFrame.show(new SimpleSizedPanel());
	
	}

}

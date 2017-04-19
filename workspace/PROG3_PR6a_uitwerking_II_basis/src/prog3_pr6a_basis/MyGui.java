package prog3_pr6a_basis;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyGui extends JFrame{
	
	public void create(){
		MyContentPane myContent = new MyContentPane();

		this.setContentPane(myContent);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Paint test");
		
		this.pack();
		this.setVisible(true);
	}

}

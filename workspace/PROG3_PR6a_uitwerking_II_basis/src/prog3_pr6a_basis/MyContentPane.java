package prog3_pr6a_basis;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyContentPane extends JPanel implements ActionListener {

	private boolean buttonPressed = false;
	private JButton myButton = new JButton("Press me!");
	
	public MyContentPane() {
		this.setLayout(null);
		this.setPreferredSize(new Dimension(400, 300));
		
		myButton.addActionListener(this);
		myButton.setBounds(300, 0, 100, 300);
		
		this.add(myButton);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		buttonPressed = true;
		myButton.setText("Done!");
		this.repaint();
	}
	
	public void paintComponent(Graphics g){
		if(buttonPressed){
			g.setColor(Color.YELLOW);
		}else{
			g.setColor(Color.RED);
		}
		
		g.fillRect(0, 0, 300, 300);
	}
}

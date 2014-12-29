package Vjezbe;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buttons {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Gui 101");
		jf.setSize(300, 300);
		jf.setLocation(800, 200);
		Dimension dim = new Dimension(600, 600);
		jf.setMaximumSize(dim);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel jp = new JPanel();
		JButton jb = new JButton("OK");
		jp.add(jb);
		JButton jb1 = new JButton("Cancel");
		jp.add(jb1);
		jf.add(jp);
		ButtonHandler  bH = new ButtonHandler();
		jb.addActionListener(bH);
		jb1.addActionListener(bH);
		jf.setVisible(true);
	}
	private static class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Klik!");
			JButton b = (JButton)e.getSource();
			b.setText("Kliknuto");
		}
		
	}
}
/* ako se klikne jedno dugme pise na njemu kliknuto,
 * ako kline na dugme 2 vrati se isto na dugme 1 a dugme 2 se promijeni*/

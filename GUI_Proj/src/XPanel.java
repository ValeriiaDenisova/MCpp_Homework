import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class XPanel extends JPanel 
{
	JTextField txt  = null;
	JTextField txt1 = null;
	JTextField txt2 = null;
	JTextField txt3 = null;
	
	public XPanel() 
	{
		setLayout(null);
		
		JButton btn1 = new JButton("Click Me");
		btn1.setBounds(10, 10, 120, 20);
		add(btn1);
				
		txt = new JTextField();
		txt.setBounds(10, 30, 120, 20);
		add(txt);
		
		txt1 = new JTextField();
		txt1.setBounds(10, 50, 120, 20);
		add(txt1);
		
		txt2 = new JTextField();
		txt2.setBounds(10, 70, 120, 20);
		add(txt2);
		
		txt3 = new JTextField();
		txt3.setBounds(10, 90, 120, 20);
		add(txt3);
		
//		JButton btn2 = new JButton("Click Me");
//		btn2.setBounds(10, 70, 120, 20);
//		btn2.addActionListener( new BtnClick() );
//		add(btn2);
		
//		btn1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) 
//			{
//				JOptionPane.showMessageDialog(null, txt.getText());
//			}
//		});
		
//		btn1.addActionListener(new ActionListener() {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) 
//		{
//			txt2.setText(txt.getText() + txt1.getText());
//		}
//	});
		
		btn1.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			int res = Integer.parseInt(txt.getText()) + Integer.parseInt(txt2.getText());
			txt3.setText("" + res); 
		}
	});
		
//		txt.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) 
//			{
//				JOptionPane.showMessageDialog(null, txt);
//			}
//		});
	}
	
	class BtnClick implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			setBackground(Color.yellow);
			txt.setText("Привет!!!");
		}
	}
}

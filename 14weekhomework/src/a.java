import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class a extends JFrame{
	private JTextField inputSpace;
	public a() {
		setLayout(null);
		inputSpace= new JTextField();
		inputSpace.setEditable(false);
		inputSpace.setBackground(Color.WHITE);
		inputSpace.setHorizontalAlignment(JTextField.RIGHT);
		inputSpace.setBounds(8,10,270,70);
		
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
		buttonPanel.setBounds(8, 90, 270, 235);
		
		String button_names[] = { "C", "¡À", "¡¿", "=", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "0" };
		JButton buttons[] = new JButton[button_names.length];
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < button_names.length; i++) {
			buttons[i] = new JButton(button_names[i]);
			buttons[i].setBackground(Color.GRAY);
			buttons[i].setForeground(Color.WHITE);
			buttonPanel.add(buttons[i]);
		}
		add(inputSpace);
		add(buttonPanel);
		setTitle("°è»ê±â");
		setVisible(true);
		setSize(300,370);
		setLocationRelativeTo(null);
		setResizable(false);
		

		
	}
	public static void main(String[] args) {
		new a();
	}

}

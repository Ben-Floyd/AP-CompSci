package ch8.two.homework.twentytwo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	
	
	private JPanel pane;
	public static JTextField usr;
	public static JPasswordField pswd;
	private JLabel usrLabel, pswdLabel;
	private JButton submit, reset;
	private LoginForm form;
	
	public LoginWindow(){
		form = new LoginForm();
		setTitle("Login");
		setBounds(500, 200, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		pane = new JPanel();
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane);
		pane.setLayout(null);
		setupWindow();
		setVisible(true);
	}
	
	public void resetFields(){
		usr.setText(null);
		pswd.setText(null);
	}
	
	private void setupWindow(){
		usr = new JTextField();
		usr.setBounds(67, 55, 165, 28);
		pane.add(usr);
		usr.setColumns(10);
		
		pswd = new JPasswordField();
		pswd.setBounds(67, 125, 165, 28);
		pane.add(pswd);
		pswd.setColumns(10);
		
		usrLabel = new JLabel("Username:");
		usrLabel.setBounds(115, 34, 90, 16);
		pane.add(usrLabel);
		
		pswdLabel = new JLabel("Password:");
		pswdLabel.setBounds(115, 104, 90, 16);
		pane.add(pswdLabel);
		
		submit = new JButton("Submit");
		submit.setBounds(190, 180, 75, 25);
		pane.add(submit);
		submit.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				form.click("submit");
				if(form.login()){
					System.out.println("Loged in!");
					System.exit(0);
				} else{
					System.out.println("Username or password incorrect");
				}
			}
		});
		
		reset = new JButton("Reset");
		reset.setBounds(40, 180, 75, 25);
		pane.add(reset);
		reset.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				form.click("reset");
			}
			
		});
	}
	
	public static void main(String[] args) {
		new LoginWindow();
	}
}
package ch8.two.homework.PP1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;

public class ComboWindow extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JPanel pane;
	private JLabel label;
	private JSlider slider;
	private ComboLock lock;
	
	public ComboWindow(){
		lock = new ComboLock(39, 11, 2);
		setTitle("ZCombo Lock");
		setBounds(500, 200, 500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);
		setResizable(false);
		pane = new JPanel();
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//pane.setLayout(null);
		setupWindow();
		setContentPane(pane);
		setVisible(true);
	}
	
	public void setupWindow(){
		slider = new JSlider(JSlider.HORIZONTAL);
		slider.setMaximum(40);
		slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
		pane.add(slider);
	}
	
	public static void main(String[] args) {
		new ComboWindow();
	}

}

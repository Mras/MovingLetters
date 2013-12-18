package moving.letters;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.apache.log4j.Logger;

import entry.point.Main;

public class MovingLettersFrame extends JFrame {
	private static final Logger LOG = Logger.getLogger(Main.class);
	private JButton leftButton;
	private JButton rightButton;
	private JPanel buttonPanel;
	private JTextField movingText;

	public MovingLettersFrame(){
		super();
		initUI();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initUI() {
		LOG.info("UI init started");
		this.setTitle("Moving Letters");
		this.setResizable(false);
		
		buttonPanel = new JPanel();
		movingText = new JTextField(100);
		leftButton = new JButton("Add to the left");
		rightButton = new JButton("Add to the right");
		
		movingText.setEditable(false);

		leftButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {				
			}
		});
		rightButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		buttonPanel.add(leftButton);
		buttonPanel.add(rightButton);
		add(movingText);
		add(buttonPanel);
		pack();
		setLocationByPlatform(true);
		LOG.info("UI init ended");
	}
}

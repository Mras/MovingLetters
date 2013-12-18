package entry.point;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import moving.letters.MovingLettersFrame;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
	private static final Logger LOGGER = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		BasicConfigurator.configure(); //Log4J conf
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			LOGGER.error("Error while setting Look and Feel", e);
		}
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MovingLettersFrame movingLettersFrame = new MovingLettersFrame();
				movingLettersFrame.setVisible(true);
			}
		});
	}
}

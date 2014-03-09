package SeaChess;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChessDemoMenu {

	public ChessDemoMenu() {
		JFrame jf = new JFrame("SeaChess");
		jf.setSize(760, 760);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);

		JLabel background = new JLabel(new ImageIcon("D:\\chess.jpg"));
		jf.add(background);

		JMenuBar mb = new JMenuBar();

		JMenu newGame = new JMenu("New Game");
		newGame.setMnemonic(KeyEvent.VK_N);
		mb.add(newGame);

		final JMenuItem choose3x3 = new JMenuItem("Easy");
		choose3x3.setMnemonic(KeyEvent.VK_E);
		newGame.add(choose3x3);
		choose3x3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame1 = new JFrame("Easy");
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setDefaultCloseOperation(frame1.DISPOSE_ON_CLOSE);
				frame1.setSize(500, 500);
				JMenuBar jmb = new JMenuBar();
				frame1.add(new Buttons3x3());
				frame1.setVisible(true);
			}
		});

		final JMenuItem choose4x4 = new JMenuItem("Medium");
		choose4x4.setMnemonic(KeyEvent.VK_M);
		newGame.add(choose4x4);
		choose4x4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame1 = new JFrame("Medium");
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setDefaultCloseOperation(frame1.DISPOSE_ON_CLOSE);
				frame1.add(new Buttons4x4());
				frame1.setSize(700, 700);
				frame1.setVisible(true);
			}
		});

		final JMenuItem choose5x5 = new JMenuItem("Hard");
		choose5x5.setMnemonic(KeyEvent.VK_H);
		newGame.add(choose5x5);
		choose5x5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame1 = new JFrame("Hard");
//				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame1.add(new Buttons5x5());
				frame1.setSize(800, 800);
				frame1.setVisible(true);
			}
		});

		JMenu quit = new JMenu("Quit");
		quit.setMnemonic(KeyEvent.VK_Q);
		JMenuItem exit = new JMenuItem("Quit");
		exit.setMnemonic(KeyEvent.VK_Q);
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		quit.add(exit);
		mb.add(quit);
		jf.setJMenuBar(mb);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		new ChessDemoMenu();

	}

}

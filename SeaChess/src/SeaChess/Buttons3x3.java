package SeaChess;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Buttons3x3 extends JPanel implements ActionListener {

	private JButton[] buttons;
	private String str = "";
	private int count = 0;
	private boolean win = false;
	private String name;

	public Buttons3x3() {

		buttons = new JButton[9];
		setLayout(new GridLayout(3, 3));
		Font font;

		buttons[0] = new JButton("");
		buttons[1] = new JButton("");
		buttons[2] = new JButton("");
		buttons[3] = new JButton("");
		buttons[4] = new JButton("");
		buttons[5] = new JButton("");
		buttons[6] = new JButton("");
		buttons[7] = new JButton("");
		buttons[8] = new JButton("");

		buttons[0].addActionListener(this);
		buttons[1].addActionListener(this);
		buttons[2].addActionListener(this);
		buttons[3].addActionListener(this);
		buttons[4].addActionListener(this);
		buttons[5].addActionListener(this);
		buttons[6].addActionListener(this);
		buttons[7].addActionListener(this);
		buttons[8].addActionListener(this);

		add(buttons[0]);
		add(buttons[1]);
		add(buttons[2]);
		add(buttons[3]);
		add(buttons[4]);
		add(buttons[5]);
		add(buttons[6]);
		add(buttons[7]);
		add(buttons[8]);

		font = new Font(buttons[0].getFont().getName(), Font.BOLD, 160);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setFont(font);
		}

		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setBackground(Color.DARK_GRAY);

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;

		if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
			str = "X";

		} else if (count == 2 || count == 4 || count == 6 || count == 8) {
			str = "O";
		}

		if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
			JOptionPane.showMessageDialog(null, "NEXT is O ");

		} else if (count == 2 || count == 4 || count == 6 || count == 8) {
			JOptionPane.showMessageDialog(null, "NEXT is X ");
		}

		if (e.getSource() == buttons[0]) {
			buttons[0].setText(str);
			buttons[0].setEnabled(false);

		} else if (e.getSource() == buttons[1]) {
			buttons[1].setText(str);
			buttons[1].setEnabled(false);

		} else if (e.getSource() == buttons[2]) {
			buttons[2].setText(str);
			buttons[2].setEnabled(false);

		} else if (e.getSource() == buttons[3]) {
			buttons[3].setText(str);
			buttons[3].setEnabled(false);

		} else if (e.getSource() == buttons[4]) {
			buttons[4].setText(str);
			buttons[4].setEnabled(false);

		} else if (e.getSource() == buttons[5]) {
			buttons[5].setText(str);
			buttons[5].setEnabled(false);

		} else if (e.getSource() == buttons[6]) {
			buttons[6].setText(str);
			buttons[6].setEnabled(false);

		} else if (e.getSource() == buttons[7]) {
			buttons[7].setText(str);
			buttons[7].setEnabled(false);

		} else if (e.getSource() == buttons[8]) {
			buttons[8].setText(str);
			buttons[8].setEnabled(false);
		}
		// horizontali
		if (buttons[0].getText() == buttons[1].getText()
				&& buttons[1].getText() == buttons[2].getText()
				&& buttons[0].getText() != "") {
			win = true;
		} else if (buttons[3].getText() == buttons[4].getText()
				&& buttons[4].getText() == buttons[5].getText()
				&& buttons[3].getText() != "") {
			win = true;
		} else if (buttons[6].getText() == buttons[7].getText()
				&& buttons[7].getText() == buttons[8].getText()
				&& buttons[6].getText() != "") {
			win = true;
		}
		// vertikali
		else if (buttons[0].getText() == buttons[3].getText()
				&& buttons[3].getText() == buttons[6].getText()
				&& buttons[0].getText() != "") {
			win = true;
		} else if (buttons[1].getText() == buttons[4].getText()
				&& buttons[4].getText() == buttons[7].getText()
				&& buttons[1].getText() != "") {
			win = true;
		} else if (buttons[2].getText() == buttons[5].getText()
				&& buttons[5].getText() == buttons[8].getText()
				&& buttons[2].getText() != "") {
			win = true;
		}
		// diagonali
		else if (buttons[0].getText() == buttons[4].getText()
				&& buttons[4].getText() == buttons[8].getText()
				&& buttons[0].getText() != "") {
			win = true;
		} else if (buttons[2].getText() == buttons[4].getText()
				&& buttons[4].getText() == buttons[6].getText()
				&& buttons[2].getText() != "") {
			win = true;
		} else {
			win = false;
		}

		if (win == true) {
			JOptionPane.showMessageDialog(null, "CONGRATULATIONS! " + str + " "
					+ " WIN");
		} else if (count == 9 && win == false) {
			JOptionPane.showMessageDialog(null, "  " + " EQUALS ");
		}

	}
}

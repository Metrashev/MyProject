package SeaChess;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Buttons5x5 extends JPanel implements ActionListener {
	private JButton[] buttons;
	private String str = "";
	private int count = 0;
	private boolean win = false;

	public Buttons5x5() {
		buttons = new JButton[25];
		setLayout(new GridLayout(5, 5));
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
		buttons[9] = new JButton("");
		buttons[10] = new JButton("");
		buttons[11] = new JButton("");
		buttons[12] = new JButton("");
		buttons[13] = new JButton("");
		buttons[14] = new JButton("");
		buttons[15] = new JButton("");
		buttons[16] = new JButton("");
		buttons[17] = new JButton("");
		buttons[18] = new JButton("");
		buttons[19] = new JButton("");
		buttons[20] = new JButton("");
		buttons[21] = new JButton("");
		buttons[22] = new JButton("");
		buttons[23] = new JButton("");
		buttons[24] = new JButton("");

		buttons[0].addActionListener(this);
		buttons[1].addActionListener(this);
		buttons[2].addActionListener(this);
		buttons[3].addActionListener(this);
		buttons[4].addActionListener(this);
		buttons[5].addActionListener(this);
		buttons[6].addActionListener(this);
		buttons[7].addActionListener(this);
		buttons[8].addActionListener(this);
		buttons[9].addActionListener(this);
		buttons[10].addActionListener(this);
		buttons[11].addActionListener(this);
		buttons[12].addActionListener(this);
		buttons[13].addActionListener(this);
		buttons[14].addActionListener(this);
		buttons[15].addActionListener(this);
		buttons[15].addActionListener(this);
		buttons[16].addActionListener(this);
		buttons[17].addActionListener(this);
		buttons[18].addActionListener(this);
		buttons[19].addActionListener(this);
		buttons[20].addActionListener(this);
		buttons[21].addActionListener(this);
		buttons[22].addActionListener(this);
		buttons[23].addActionListener(this);
		buttons[24].addActionListener(this);

		add(buttons[0]);
		add(buttons[1]);
		add(buttons[2]);
		add(buttons[3]);
		add(buttons[4]);
		add(buttons[5]);
		add(buttons[6]);
		add(buttons[7]);
		add(buttons[8]);
		add(buttons[9]);
		add(buttons[10]);
		add(buttons[11]);
		add(buttons[12]);
		add(buttons[13]);
		add(buttons[14]);
		add(buttons[15]);
		add(buttons[16]);
		add(buttons[17]);
		add(buttons[18]);
		add(buttons[19]);
		add(buttons[20]);
		add(buttons[21]);
		add(buttons[22]);
		add(buttons[23]);
		add(buttons[24]);

		font = new Font(buttons[0].getFont().getName(), Font.BOLD, 150);
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

		if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9
				|| count == 11 || count == 13 || count == 15 || count == 17
				|| count == 19 || count == 21 || count == 23 || count == 25) {
			str = "X";

		} else if (count == 2 || count == 4 || count == 6 || count == 8
				|| count == 10 || count == 12 || count == 14 || count == 16
				|| count == 18 || count == 20 || count == 22 || count == 24) {
			str = "O";
		}

		if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9
				|| count == 11 || count == 13 || count == 15 || count == 17
				|| count == 19 || count == 21 || count == 23 || count == 25) {
			JOptionPane.showMessageDialog(null, "NEXT is O ");

		} else if (count == 2 || count == 4 || count == 6 || count == 8
				|| count == 10 || count == 12 || count == 14 || count == 16
				|| count == 18 || count == 20 || count == 22 || count == 24) {
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

		} else if (e.getSource() == buttons[9]) {
			buttons[9].setText(str);
			buttons[9].setEnabled(false);

		} else if (e.getSource() == buttons[10]) {
			buttons[10].setText(str);
			buttons[10].setEnabled(false);

		} else if (e.getSource() == buttons[11]) {
			buttons[11].setText(str);
			buttons[11].setEnabled(false);

		} else if (e.getSource() == buttons[12]) {
			buttons[12].setText(str);
			buttons[12].setEnabled(false);

		} else if (e.getSource() == buttons[13]) {
			buttons[13].setText(str);
			buttons[13].setEnabled(false);

		} else if (e.getSource() == buttons[14]) {
			buttons[14].setText(str);
			buttons[14].setEnabled(false);

		} else if (e.getSource() == buttons[15]) {
			buttons[15].setText(str);
			buttons[15].setEnabled(false);

		} else if (e.getSource() == buttons[16]) {
			buttons[16].setText(str);
			buttons[16].setEnabled(false);

		} else if (e.getSource() == buttons[17]) {
			buttons[17].setText(str);
			buttons[17].setEnabled(false);

		} else if (e.getSource() == buttons[18]) {
			buttons[18].setText(str);
			buttons[18].setEnabled(false);

		} else if (e.getSource() == buttons[19]) {
			buttons[19].setText(str);
			buttons[19].setEnabled(false);

		} else if (e.getSource() == buttons[20]) {
			buttons[20].setText(str);
			buttons[20].setEnabled(false);

		} else if (e.getSource() == buttons[21]) {
			buttons[21].setText(str);
			buttons[21].setEnabled(false);

		} else if (e.getSource() == buttons[22]) {
			buttons[22].setText(str);
			buttons[22].setEnabled(false);

		} else if (e.getSource() == buttons[23]) {
			buttons[23].setText(str);
			buttons[23].setEnabled(false);

		} else if (e.getSource() == buttons[24]) {
			buttons[24].setText(str);
			buttons[24].setEnabled(false);
		}

		// horizontali
		if (buttons[0].getText() == buttons[1].getText()
				&& buttons[1].getText() == buttons[2].getText()
				&& buttons[2].getText() == buttons[3].getText()
				&& buttons[3].getText() == buttons[4].getText()
				&& buttons[0].getText() != "") {
			win = true;

		} else if (buttons[5].getText() == buttons[6].getText()
				&& buttons[6].getText() == buttons[7].getText()
				&& buttons[7].getText() == buttons[8].getText()
				&& buttons[8].getText() == buttons[9].getText()
				&& buttons[5].getText() != "") {
			win = true;

		} else if (buttons[10].getText() == buttons[11].getText()
				&& buttons[11].getText() == buttons[12].getText()
				&& buttons[12].getText() == buttons[13].getText()
				&& buttons[13].getText() == buttons[14].getText()
				&& buttons[10].getText() != "") {
			win = true;

		} else if (buttons[15].getText() == buttons[16].getText()
				&& buttons[16].getText() == buttons[17].getText()
				&& buttons[17].getText() == buttons[18].getText()
				&& buttons[18].getText() == buttons[19].getText()
				&& buttons[15].getText() != "") {
			win = true;

		} else if (buttons[20].getText() == buttons[21].getText()
				&& buttons[21].getText() == buttons[22].getText()
				&& buttons[22].getText() == buttons[23].getText()
				&& buttons[23].getText() == buttons[24].getText()
				&& buttons[20].getText() != "") {
			win = true;
		}

		// vertikali
		else if (buttons[0].getText() == buttons[5].getText()
				&& buttons[5].getText() == buttons[10].getText()
				&& buttons[10].getText() == buttons[15].getText()
				&& buttons[15].getText() == buttons[20].getText()
				&& buttons[0].getText() != "") {
			win = true;

		} else if (buttons[1].getText() == buttons[6].getText()
				&& buttons[6].getText() == buttons[11].getText()
				&& buttons[11].getText() == buttons[16].getText()
				&& buttons[16].getText() == buttons[21].getText()
				&& buttons[1].getText() != "") {
			win = true;

		} else if (buttons[2].getText() == buttons[7].getText()
				&& buttons[7].getText() == buttons[12].getText()
				&& buttons[12].getText() == buttons[17].getText()
				&& buttons[17].getText() == buttons[22].getText()
				&& buttons[2].getText() != "") {
			win = true;

		} else if (buttons[3].getText() == buttons[8].getText()
				&& buttons[8].getText() == buttons[13].getText()
				&& buttons[13].getText() == buttons[18].getText()
				&& buttons[18].getText() == buttons[23].getText()
				&& buttons[3].getText() != "") {
			win = true;

		} else if (buttons[4].getText() == buttons[9].getText()
				&& buttons[9].getText() == buttons[14].getText()
				&& buttons[14].getText() == buttons[19].getText()
				&& buttons[19].getText() == buttons[24].getText()
				&& buttons[4].getText() != "") {
			win = true;
		}

		// diagonali
		else if (buttons[0].getText() == buttons[6].getText()
				&& buttons[6].getText() == buttons[12].getText()
				&& buttons[12].getText() == buttons[18].getText()
				&& buttons[18].getText() == buttons[24].getText()
				&& buttons[0].getText() != "") {
			win = true;

		} else if (buttons[4].getText() == buttons[8].getText()
				&& buttons[8].getText() == buttons[12].getText()
				&& buttons[12].getText() == buttons[16].getText()
				&& buttons[16].getText() == buttons[20].getText()
				&& buttons[4].getText() != "") {
			win = true;

		} else {
			win = false;
		}

		if (win == true) {
			JOptionPane.showMessageDialog(null, "CONGRATULATIONS! " + str + " "
					+ " WIN");
		} else if (count == 25 && win == false) {
			JOptionPane.showMessageDialog(null, "  " + " EQUALS ");
		}

	}
}

package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.io.File;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.io.File;

public class Settings extends JFrame implements ActionListener
{
	private JPanel contentPane;
	private JTextField txtWidth;
	private JTextField txtHeight;
	private JTextField txtMines;
	private JTextField txtMinesPercent;
	private JButton btnStart = new JButton("Start");
	private JButton btnReset = new JButton("Reset");
	public static Settings settings = new Settings();

	public static void main(String[] Args)
	{
	}

	// Create the frame.
	public Settings()
	{
		setTitle("Einstellungen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 500);
		setMinimumSize(new Dimension(300, 500));

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel pnlSouth = new JPanel();
		contentPane.add(pnlSouth, BorderLayout.SOUTH);

		pnlSouth.setLayout(new GridLayout(3, 1, 1, 1));

		// Mines Info
		JLabel lMinesInfo = new JLabel(
				"<html>*Bei \"Mines in Percent\" und \"Mines overall\" muss nur eines davon gesetzt werden. Werden beide Felder gefüllt mit einem Wert, der über Null ist, so wird immer der Prozent wert genommen.</html>");
		pnlSouth.add(lMinesInfo);

		btnReset.addActionListener(this);
		pnlSouth.add(btnReset);

		btnStart.addActionListener(this);
		pnlSouth.add(btnStart);

		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		pnlCenter.setLayout(new GridLayout(7, 1, 1, 1));

		JLabel label1 = new JLabel("Einstellungen");
		pnlCenter.add(label1);
		JLabel label2 = new JLabel(" ");
		pnlCenter.add(label2);

		// Start Labels and Input Fields

		// Width
		JLabel lWidth = new JLabel("Width:");
		pnlCenter.add(lWidth);

		txtWidth = new JTextField();
		pnlCenter.add(txtWidth);
		txtWidth.setColumns(10);

		// Height
		JLabel lHeight = new JLabel("Height:");
		pnlCenter.add(lHeight);

		txtHeight = new JTextField();
		pnlCenter.add(txtHeight);
		txtHeight.setColumns(10);

		// Mines
		JLabel lMines = new JLabel("Mines overall:");
		pnlCenter.add(lMines);

		txtMines = new JTextField();
		pnlCenter.add(txtMines);
		txtMines.setColumns(10);

		// Mines Percent
		JLabel lMinesPercent = new JLabel("Mines in Percent:");
		pnlCenter.add(lMinesPercent);

		txtMinesPercent = new JTextField();
		pnlCenter.add(txtMinesPercent);
		txtMinesPercent.setColumns(10);

		// End Labels and Input Fields

		pnlCenter.add(new JLabel(new ImageIcon("./")));

		JPanel pnlNorth = new JPanel();
		contentPane.add(pnlNorth, BorderLayout.NORTH);
		pnlNorth.setLayout(new BorderLayout(0, 0));

		txtWidth.setText("20");
		txtHeight.setText("20");
		txtMines.setText("0");
		txtMinesPercent.setText("15");

		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{

		if (e.getSource() == this.btnReset)
		{
			this.txtWidth.setText("20");
			this.txtHeight.setText("20");
			this.txtMines.setText("0");
			this.txtMinesPercent.setText("15");
		}
		else if (e.getSource() == this.btnStart)
		{
			if (isNumeric(txtWidth.getText()) && isNumeric(txtHeight.getText()) && isNumeric(txtMines.getText())
					&& isNumeric(txtMinesPercent.getText()))
			{
				if (Integer.parseInt(this.getTxtWidth().getText()) > 40
						|| Integer.parseInt(this.getTxtHeight().getText()) > 40)
				{
					JOptionPane.showMessageDialog(null, "Höhe und Breite über 40 nicht erlaubt!", "ERROR",
							JOptionPane.WARNING_MESSAGE);
				}
				else if (Integer.parseInt(this.getTxtWidth().getText()) * Integer.parseInt(this.getTxtHeight().getText()) < Integer.parseInt(this.getTxtMines().getText()))
				{
					JOptionPane.showMessageDialog(null, "Feld kann nicht mehr Minen als Felder besitzen.\nMaximale Menge Minen:"+Integer.parseInt(this.getTxtWidth().getText()) * Integer.parseInt(this.getTxtHeight().getText()), "ERROR",
							JOptionPane.WARNING_MESSAGE);
				}
				else
				{
					System.out.println(txtWidth.getText());
					game.gameloop(settings);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Nur 32bit Integer Zahlen sind erlaubt!", "ERROR", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	public static boolean isNumeric(String strNum)
	{
		if (strNum == null)
		{
			return false;
		}
		try
		{
			int d = Integer.parseInt(strNum);
		} catch (NumberFormatException nfe)
		{
			return false;
		}
		return true;
	}

	public JTextField getTxtWidth()
	{
		return txtWidth;
	}

	public void setTxtWidth(JTextField txtWidth)
	{
		this.txtWidth = txtWidth;
	}

	public JTextField getTxtHeight()
	{
		return txtHeight;
	}

	public void setTxtHeight(JTextField txtHeight)
	{
		this.txtHeight = txtHeight;
	}

	public JTextField getTxtMines()
	{
		return txtMines;
	}

	public void setTxtMines(JTextField txtMines)
	{
		this.txtMines = txtMines;
	}

	public JTextField getTxtMinesPercent()
	{
		return txtMinesPercent;
	}

	public void setTxtMinesPercent(JTextField txtMinesPercent)
	{
		this.txtMinesPercent = txtMinesPercent;
	}
}

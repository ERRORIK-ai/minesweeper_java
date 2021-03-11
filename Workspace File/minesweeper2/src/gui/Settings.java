package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
import javax.swing.JScrollPane;

public class Settings extends JFrame implements ActionListener
{
	private JPanel contentPane;
	private JTextField txtWidth;
	private JTextField txtHeight;
	private JTextField txtMines;
	private JTextField txtUsername;
	private JButton btnStart = new JButton("Start");
	private JButton btnReset = new JButton("Reset");
	String Error="";

	public static void main(String[] Args)
	{
		Settings newa = new Settings();
	}

	// Create the frame.
	public Settings()
	{
		setTitle("Einstellungen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setMinimumSize(new Dimension(200, 300));

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel pnlSouth = new JPanel();
		contentPane.add(pnlSouth, BorderLayout.SOUTH);

		btnReset.addActionListener(this);
		pnlSouth.add(btnReset);

		btnStart.addActionListener(this);
		pnlSouth.add(btnStart);

		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		pnlCenter.setLayout(new GridLayout(6, 2, 6, 6));

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
		JLabel lMines = new JLabel("Mines:");
		pnlCenter.add(lMines);

		txtMines = new JTextField();
		pnlCenter.add(txtMines);
		txtMines.setColumns(10);

		// Username
		JLabel lusername = new JLabel("Username:");
		pnlCenter.add(lusername);

		txtUsername = new JTextField();
		pnlCenter.add(txtUsername);
		txtUsername.setColumns(10);
		
		// Error
		JLabel Error = new JLabel(Error);
		pnlCenter.add(Error);

		// End Labels and Input Fields

		pnlCenter.add(new JLabel(new ImageIcon("./")));

		JPanel pnlNorth = new JPanel();
		contentPane.add(pnlNorth, BorderLayout.NORTH);
		pnlNorth.setLayout(new BorderLayout(0, 0));

		txtWidth.setText("20");
		txtHeight.setText("20");
		txtMines.setText("5");
		txtUsername.setText("Besucher");

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == this.btnReset)
		{
			this.txtWidth.setText("20");
			this.txtHeight.setText("20");
			this.txtMines.setText("5");
			this.txtUsername.setText("Besucher");
		}
		else if (e.getSource() == this.btnStart)
		{
			if
			//calculate.generator.generator(this.txtWidth, this.txtHeight);
		}
	}
}

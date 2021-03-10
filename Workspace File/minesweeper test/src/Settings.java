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
	private JTextField txtPercentage;
	private JTextField txtusername;
	private JButton btnStart = new JButton("Start");
	private JButton btnReset = new JButton("Reset");

	// Create the frame.
	public Settings()
	{
		setTitle("Einstellungen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 600);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel pnlSouth = new JPanel();
		contentPane.add(pnlSouth, BorderLayout.SOUTH);

		btnStart.addActionListener(this);
		pnlSouth.add(btnStart);

		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		pnlCenter.setLayout(new GridLayout(6, 2, 6, 6));

		// Width
		JLabel lWidth = new JLabel("Width:");
		pnlCenter.add(lWidth);

		txtWidth = new JTextField();
		pnlCenter.add(txtWidth);
		txtWidth.setColumns(10);

		// Width
		JLabel lHeight = new JLabel("Width:");
		pnlCenter.add(lHeight);

		txtHeight = new JTextField();
		pnlCenter.add(txtHeight);
		txtHeight.setColumns(10);

		// Width
		JLabel lWidth = new JLabel("Width:");
		pnlCenter.add(lWidth);

		txtWidth = new JTextField();
		pnlCenter.add(txtWidth);
		txtWidth.setColumns(10);

		pnlCenter.add(new JLabel(new ImageIcon("./")));

		JPanel pnlNorth = new JPanel();
		contentPane.add(pnlNorth, BorderLayout.NORTH);
		pnlNorth.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setPreferredSize(new Dimension(0, 200));
		pnlNorth.add(scrollPane);

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == this.btnReset)
		{
			this.Width.setText("");
		}
		else if (e.getSource() == this.btnStart)
		{

		}
	}
}

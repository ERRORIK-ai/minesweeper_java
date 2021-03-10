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
	private JTextField Width;
	private JTextField Height;
	private JTextField Percentage;
	private JTextField username;

	// Create the frame.
	public Settings()
	{
		setTitle("Poke");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 600);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel pnlSouth = new JPanel();
		contentPane.add(pnlSouth, BorderLayout.SOUTH);

		btnCancel.addActionListener(this);
		pnlSouth.add(btnCancel);

		btnSave.addActionListener(this);
		pnlSouth.add(btnSave);

		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		pnlCenter.setLayout(new GridLayout(6, 2, 6, 6));

		JLabel lblName = new JLabel("Name:");
		pnlCenter.add(lblName);

		txtName = new JTextField();
		pnlCenter.add(txtName);
		txtName.setColumns(10);

		JLabel lblCodename = new JLabel("Code:");
		pnlCenter.add(lblCodename);

		txtCodeName = new JTextField();
		pnlCenter.add(txtCodeName);
		txtCodeName.setColumns(10);

		JLabel lblAge = new JLabel("Weigth");
		pnlCenter.add(lblAge);

		weight = new JTextField();
		pnlCenter.add(weight);
		weight.setColumns(10);

		JLabel lblEvolution = new JLabel("Evolution:");
		pnlCenter.add(lblEvolution);

		chkEvolution = new JCheckBox("");
		pnlCenter.add(chkEvolution);

		JLabel lblCommentar = new JLabel("Kommentar:");
		pnlCenter.add(lblCommentar);

		Commentar = new JTextField();
		pnlCenter.add(Commentar);
		Commentar.setColumns(10);

		JLabel lblEvolution1 = new JLabel("https://www.pokemon.com");
		pnlCenter.add(lblEvolution1);

		pnlCenter.add(new JLabel(new ImageIcon("./")));

		JPanel pnlNorth = new JPanel();
		contentPane.add(pnlNorth, BorderLayout.NORTH);
		pnlNorth.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setPreferredSize(new Dimension(0, 200));
		pnlNorth.add(scrollPane);

		loadPokes();

		this.setVisible(true);
	}

	private void loadPokes()
	{
		ArrayList<PokeDTO> Pokes = pokemon.getPokes();
		model.clear();
		for (PokeDTO Poke : Pokes)
		{
			model.addElement(Poke);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == this.btnCancel)
		{
			this.txtName.setText("");
			this.txtCodeName.setText("");
			this.chkEvolution.setSelected(false);
			this.weight.setText("");
			this.Commentar.setText("");

		}
		else if (e.getSource() == this.btnSave)
		{
			PokeDTO a = new PokeDTO();
			a.setName(PokemonView.this.txtName.getText());
			a.setCodeName(PokemonView.this.txtCodeName.getText());
			a.setEvolution(PokemonView.this.chkEvolution.isSelected());
			a.setComment(PokemonView.this.Commentar.getText());
			int weight;
			try
			{
				weight = Integer.parseInt(PokemonView.this.weight.getText());
			} catch (NumberFormatException nfex)
			{
				weight = 0;
			}
			a.setWeight(weight);
			pokemon.addPoke(a);

			loadPokes();
		}
	}
}

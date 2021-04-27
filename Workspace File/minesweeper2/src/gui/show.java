package gui;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;
import java.lang.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import calculate.generator;
import calculate.reveal;
import calculate.winorlose;

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

public class show extends JPanel implements ActionListener
{
	private JButton[][] grid;
	private JButton flag;
	private static JLabel[] toolbar;
	private static byte[][] markedfields;
	private static int[][] mapB;
	private static boolean first = true;
	private static boolean lost = false;

	public static void showgui(int[][] map, byte[][] marked)
	{
		new show(map, marked);
	}

	JFrame frame = new JFrame();

	// Generiert Framelayout
	public show(int[][] map, byte[][] marked)
	{	
		first = true;
		markedfields = marked;
		mapB = map;
		int tempX = map[0].length;
		int TempY = map.length;
		grid = new JButton[tempX][TempY];
		System.out.println(tempX + " - " + TempY);
		frame.setLayout(new GridLayout(tempX, TempY, 3, 3));
		JPanel toolbar = new JPanel();
		toolbar.setLayout(new GridLayout(1, 1, 1, 1));
		addButtons(frame, TempY, tempX, map, marked);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();

		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

		// width will store the width of the screen
		double width = (int) size.getWidth()*0.8;
		

		// height will store the height of the screen
		double height = (int) size.getHeight()*0.8;
		System.out.println("Current Screen resolution : "
                + "width : " + width
                + " height : " + height);
		frame.setSize((int)width, (int)height);
		frame.setTitle("Minesweeper");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	// Definiert die Farben des Fensters
	@Override
	public void paint(Graphics g)
	{
		g.setColor(getBackground());
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.BLACK);
		for (int i = 0; i <= 9; i++)
		{
			if (i % 3 == 0)
			{
				int coord = i * 58;
				coord++;
				g.drawLine(coord, 0, coord, 58 * 9);
				g.drawLine(0, coord, 58 * 9, coord);
			}
		}
	}

	// Setzt die Farbe je nach Anzahl umliegenden Minen
	public void addButtons(JFrame frame, int x, int y, int[][] map, byte[][] marked)
	{
		for (int yb = 0; yb < y; yb++)
		{
			for (int xb = 0; xb < x; xb++)
			{
				String TempA = Integer.toString(map[xb][yb]);
				Color color = Color.white;
				if (marked[xb][yb] == 1)
				{
					switch (TempA)
					{
					case "0":
						color = new Color(200, 255, 200);
						break;
					case "1":
						color = Color.green;
						break;
					case "2":
						color = Color.yellow;
						break;
					case "3":
						color = Color.orange;
						break;
					case "4":
						color = Color.red;
						break;
					case "5":
						color = Color.red;
						break;
					case "6":
						color = Color.red;
						break;
					case "7":
						color = Color.red;
						break;
					case "8":
						color = Color.red;
						break;
					case "9":
						color = Color.white;
						// TempA = "\uD83D\uDCA3";
						TempA = "\u274C";
						break;
					}
				}
				if (marked[xb][yb] == 0)
				{
					TempA = "";
				}
				/*
				 * if (marked[xb][yb] == 3) { TempA = "\uD83C\uDFF3"; }
				 */
				grid[xb][yb] = new JButton(TempA);
				grid[xb][yb].setBackground(color);
				grid[xb][yb].setPreferredSize(new Dimension(55, 55));
				grid[xb][yb].addActionListener(this);
				frame.add(grid[xb][yb]); // adds button to grid
			}
		}
	}

	// Falls ein Feld ausgewählt wird werden revealmap, surrounding mit den
	// entsprechenden Koordinaten ausgeführt
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int y = grid[1].length;
		int x = grid.length;
		for (int yb = 0; yb < y; yb++)
		{
			for (int xb = 0; xb < x; xb++)
			{
				if (e.getSource() == this.grid[xb][yb])
				{
					System.out.println("Debug-Message=  " + xb + "." + yb + "." + markedfields[xb][yb]);
					if (first)
					{
						for (int yc = -1; yc <= 1; yc++)
						{
							for (int xc = -1; xc <= 1; xc++)
							{
								try
								{
									mapB[xb + xc][yb + yc] = 0;
								} catch (IndexOutOfBoundsException d)
								{
								}
							}
						}
						surrounding();
						first = false;
					}
					revealmap(xb, yb);
					for (int yc = 0; yc < y; yc++)
					{
						for (int xc = 0; xc < x; xc++)
						{
							frame.remove(grid[xc][yc]);
						}
					}
					addButtons(frame, x, y, mapB, markedfields);
					if (mapB[xb][yb] == 9)
					{
						markedfields[xb][yb] = 1;
						JOptionPane.showMessageDialog(null,
								"Mine Getroffen. Sie haben Eine Miene getroffen und verloren. Sie könne dennoch weiterspielen.",
								"Mine getroffen", JOptionPane.WARNING_MESSAGE);
						lost = true;
					}
					frame.validate();
					frame.repaint();
					if (win())
					{
						if (lost)
						{
							JOptionPane.showMessageDialog(null,
									"Alle Freien Felder aufgedeckt, Mine/n wurden jedoch getroffen", "Gewonnen",
									JOptionPane.WARNING_MESSAGE);
						}
						else
						{
							JOptionPane.showMessageDialog(null,
									"Gratulation. Alle freien Felder wurden aufgedeckt und keine Mine wurde getroffen.",
									"Gewonnen", JOptionPane.WARNING_MESSAGE);
						}
					}

				}
			}
		}
	}

	// Rechne umliegende Minen zusammen
	public static void surrounding()
	{
		mapB = generator.calc(mapB);
	}

	// Berechnung zur Aufdeckung von Karten
	public static void revealmap(int x, int y)
	{
		markedfields = reveal.reveal(mapB, markedfields, x, y);

	}

	// kontrolliert ob man schon gewonnen (mit & ohne Minen treffen) oder verloren
	// hat
	public static boolean win()
	{
		return winorlose.winorlose(mapB, markedfields);
	}
}

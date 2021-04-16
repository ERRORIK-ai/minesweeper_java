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

public class show extends JPanel implements ActionListener {
	private JButton[][] grid;
	public static void showgui(int[][] map, byte[][] marked) {
		new show(map, marked);
	}

	JFrame frame = new JFrame();

	public show(int[][] map, byte[][] marked) {
		int tempX = map[1].length;
		int TempY = map.length;
		grid= new JButton[tempX][TempY];
		System.out.println(tempX + " - " + TempY);
		frame.setLayout(new GridLayout(tempX, TempY, 3, 3));
		addButtons(frame, TempY, tempX, map, marked);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(getBackground());
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.BLACK);
		for (int i = 0; i <= 9; i++) {
			if (i % 3 == 0) {
				int coord = i * 58;
				coord++;
				g.drawLine(coord, 0, coord, 58 * 9);
				g.drawLine(0, coord, 58 * 9, coord);
			}
		}
	}

	private void addButtons(JFrame frame, int x, int y, int[][] map, byte[][] marked) {
		for (int yb = 0; yb < y; yb++) {
			for (int xb = 0; xb < x; xb++) {
				String TempA = Integer.toString(map[xb][yb]);
				if (marked[xb][yb] == 1) {
					switch (TempA) {
					case "1":
						break;
					case "2":
						break;
					case "3":
						break;
					case "4":
						break;
					case "5":
						break;
					case "6":
						break;
					case "7":
						break;
					case "8":
						break;
					case "9":
						TempA = "\uD83D\uDCA3";
						break;
					}
				}
				if (marked[xb][yb] == 0) {
					TempA = "";
				}
				if (marked[xb][yb] == 3) {
					TempA = "\uD83C\uDFF3";
				}
				grid[xb][yb] = new JButton(TempA);
				grid[xb][yb].setPreferredSize(new Dimension(55, 55));
				grid[xb][yb].addActionListener(this);
				frame.add(grid[xb][yb]); // adds button to grid
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.grid[1][1]) {
				System.out.println("testmessage1");
		}
		else
		{
		System.out.println("testmessage2");
		}
	}
}

package gui;

import java.awt.*;
import javax.swing.*;
import java.lang.*;

public class show extends JPanel
{
	public static void showgui(int[][] map, byte[][] marked)
	{
		new show(map, marked);
	}

	JFrame frame = new JFrame();
	int t = 10;

	public show(int[][] map, byte[][] marked)
		{ // constructor
		System.out.println(map[1].length+" - "+ map.length);
			frame.setLayout(new GridLayout(map[1].length, map.length, 3, 3));
			addButtons(frame, map.length);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);

		}

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

	private void addButtons(JFrame frame, int t)
	{
		JButton grid;
		for (int y = 0; y < t; y++)
		{
			for (int x = 0; x < t; x++)
			{
				grid = new JButton(x + "," + y); // creates new button
				grid.setPreferredSize(new Dimension(55, 55));
				frame.add(grid); // adds button to grid

			}
		}
	}
}

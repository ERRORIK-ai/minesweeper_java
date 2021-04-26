package gui;

import calculate.generator;
import gui.Settings;

public class game
{
	public static void main(String[] args)
	{
		Settings set = new Settings();
	}
	
	public static void gameloop(Settings SettingsB)
	{
		//Printed System relevante Infos aus
		System.out.println(SettingsB.getTxtWidth());
		System.out.println(Integer.parseInt(SettingsB.getTxtWidth().getText()) + " - "
				+ Integer.parseInt(SettingsB.getTxtHeight().getText()) + " - "
				+ Double.parseDouble(SettingsB.getTxtMines().getText()) + " - "
				+ Integer.parseInt(SettingsB.getTxtMinesPercent().getText()));
		//Generiert Map von der Generator Klasse
		int[][] map = generator.generator(Integer.parseInt(SettingsB.getTxtWidth().getText()),
				Integer.parseInt(SettingsB.getTxtHeight().getText()),
				Double.parseDouble(SettingsB.getTxtMines().getText()),
				Integer.parseInt(SettingsB.getTxtMinesPercent().getText()));
		//Printed Map aus
		for (int[] x : map)
		{
			for (int y : x)
			{
				System.out.print(y + " ");
			}
			System.out.println();
		}
		
		byte[][] marked = new byte[map.length][map[1].length];
		show.showgui(map, marked);
	}
}

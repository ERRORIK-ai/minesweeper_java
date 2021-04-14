package gui;

import calculate.generator;

public class game
{
	public static void gameloop(Settings SettingsB)
	{
		System.out.println(SettingsB.getTxtWidth());
		System.out.println( Integer.parseInt(SettingsB.getTxtWidth().getText())+" - "+Integer.parseInt(SettingsB.getTxtHeight().getText())+" - "+ Double.parseDouble(SettingsB.getTxtMines().getText())+" - "+ Integer.parseInt(SettingsB.getTxtMinesPercent().getText()));
		int[][] map = generator.generator(Integer.parseInt(SettingsB.getTxtWidth().getText()),Integer.parseInt(SettingsB.getTxtHeight().getText()), Double.parseDouble(SettingsB.getTxtMines().getText()), Integer.parseInt(SettingsB.getTxtMinesPercent().getText()));
		for (int[] x : map)
		{
		   for (int y : x)
		   {
		        System.out.print(y + " ");
		   }
		   System.out.println();
		}
		byte[][] marked= new byte[map.length][map[1].length];
		show.showgui(map, marked);
	}
}

package gui;

import calculate.generator;

public class game
{
	public static void gameloop(Settings SettingsB)
	{
		System.out.println(SettingsB.getTxtWidth());
		generator generator = new generator(Integer.parseInt(SettingsB.getTxtWidth().getText()),Integer.parseInt(SettingsB.getTxtWidth().getText()), Double.parseDouble(SettingsB.getTxtWidth().getText()), Integer.parseInt(SettingsB.getTxtWidth().getText()));
	}
}

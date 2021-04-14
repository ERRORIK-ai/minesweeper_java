package start;

import calculate.*;
import gui.*;

public class start {

	public static void main(String[] args) {
		int[][] generator_obj;
		
		Settings SettingsB = new Settings();
		int  width_x =Integer.parseInt(SettingsB.getTxtWidth().getText());
		System.out.println(width_x);
		int height_y=  Integer.parseInt(SettingsB.getTxtHeight().getText());
		System.out.println(height_y);
		double anzahl_minen= Double.parseDouble(SettingsB.getTxtMines().getText());
		double prozent_minen= Integer.parseInt(SettingsB.getTxtMinesPercent().getText());
		
		
		// width_x, height_y, prozent_minen, anzahl_minen
		generator_obj = generator.generator(width_x, height_y, prozent_minen, anzahl_minen);
		generator_obj = generator.calc(generator_obj, width_x, height_y);
		
		
		//output printer (l�schbar)--
		for (int x = 0; x < width_x; x++) {
			for (int y = 0; y < height_y; y++) {
				System.out.print(generator_obj[x][y]);
			}
			System.out.println();
		}
		//----------------------------
		
		
	}

}

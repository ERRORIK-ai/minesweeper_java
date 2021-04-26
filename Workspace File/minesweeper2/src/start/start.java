package start;

import calculate.*;
import gui.*;

public class start {

	public static void main(String[] args) {
		int[][] generator_obj;
		boolean[][] reveal_obj;
		int winorlose_obj;

		Settings SettingsB = new Settings();
		int width_x = Integer.parseInt(SettingsB.getTxtWidth().getText());
		
		int height_y = Integer.parseInt(SettingsB.getTxtHeight().getText());
		
		double anzahl_minen = Double.parseDouble(SettingsB.getTxtMines().getText());
		double prozent_minen = Integer.parseInt(SettingsB.getTxtMinesPercent().getText());

		/* width_x, height_y, prozent_minen, anzahl_minen
		generator_obj = generator.generator(width_x, height_y, prozent_minen, anzahl_minen);
		generator_obj = generator.calc(generator_obj, width_x, height_y);

		// Simuliert Spieler eingabe ->Hier wird das Feld (6/6) angeklickt /x+1 & y+1
		int pos_x = 6;
		int pos_y = 6;

		//Kreiert Booleanmap die anzeigt, welche Felder aufgedeckt sind.
		reveal_obj = reveal.createreveal(width_x, height_y);
		
		//Diese beiden Klassen müssen nach jeder Spieler eingabe ausgeführt werden.
		reveal_obj = reveal.reveal(reveal_obj, generator_obj, width_x, height_y, pos_x, pos_y);
		winorlose_obj = winorlose.winorlose(reveal_obj, generator_obj, width_x, height_y);

		// output printer (löschbar)--
		System.out.println(width_x);
		System.out.println(height_y);
		
		if (winorlose_obj==-1) {
			System.out.println("Du hast verloren!");
		} else if (winorlose_obj==1) {
			System.out.println("Du hast gewonnen!");
		}
		
		for (int x = 0; x < width_x; x++) {
			for (int y = 0; y < height_y; y++) {
				System.out.print(generator_obj[x][y]);
			}
			System.out.println();
		}

		System.out.println("--------------------------------");

		for (int x = 0; x < width_x; x++) {
			for (int y = 0; y < height_y; y++) {
				if (reveal_obj[x][y] == true) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}

			}
			System.out.println();
		}
		// ----------------------------
*/
	}

}

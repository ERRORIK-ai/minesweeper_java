package start;

import calculate.*;
import gui.*;

public class start {

	public static void main(String[] args) {
		int[][] generator_obj;
		
		int width_x=10;
		int height_y=10;
		
		//Eines muss Null sein!
		//prozent minen max 100 / min 1
		int prozent_minen=0;
		//anzahl minen darf nicht mehr als (width_x*height_y) sein
		int anzahl_minen=0;
		
		
		
		// width_x, height_y, prozent_minen, anzahl_minen
		generator_obj = generator.generator(width_x, height_y, prozent_minen, anzahl_minen);
		generator_obj = generator.calc(generator_obj, width_x, height_y);
		
		
		//output printer (löschbar)--
		for (int x = 0; x < width_x; x++) {
			for (int y = 0; y < height_y; y++) {
				System.out.print(generator_obj[x][y]);
			}
			System.out.println();
		}
		//----------------------------
		
		
	}

}

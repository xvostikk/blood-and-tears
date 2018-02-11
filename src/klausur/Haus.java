package klausur;

import java.util.Random;

public class Haus {
	public Wohnung [] wohnungen;
	
	public int neueWohnung() {
		Random r = new Random();
		int qmMin = 20;
		int qmMax = 100;
		int qm = r.nextInt(20) + 20;
		int anzZimmer = r.nextInt(1) + 1;
		int etage = r.nextInt() * 5;
		double min = 8.5;
		double max = 12.5;
		double qmMiete = ((min + (max - min) + 0.5)) * r.nextDouble();	
		return 0;
		
	}

}

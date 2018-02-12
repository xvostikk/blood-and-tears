package klausur;

import java.util.Random;

public class Haus {
	private Wohnung[] wohnungen;

	// Objektmethode die gibt ein Objekt Typ Wohnung zurück
	public Wohnung neueWohnung() {
		Random r = new Random();

		// 1. Variante: Array
		int qms[] = { 20, 40, 60, 80, 100 };
		int qm = qms[r.nextInt(qms.length)];

		// 2. Variante: min/max
		// int qmMin = 20;
		// int qmMax = 100;
		// int qm = qmMin + r.nextInt(qmMax - qmMin + 1);
		int anzZimmer = 1 + r.nextInt(5);
		int etage = r.nextInt(6);

		double qmMieten[] = { 8.5, 9, 9.5, 10, 10.5, 11, 11.5, 12, 12.5 };
		double qmMiete = qmMieten[r.nextInt(qmMieten.length)];

		// double qmMieteMin = 8.5;
		// double qmMieteMax = 12.5;
		// double qmMieteStep = 0.5;
		// int qmMieteNumSteps = (int)((qmMieteMax - qmMieteMin) / qmMieteStep);
		// double qmMiete = qmMieteMin + r.nextInt(qmMieteNumSteps + 1) * qmMieteStep;
		if (etage == 5) {
			return new Dachgeschosswohnung(qm, anzZimmer, qmMiete);
		}

		return new Wohnung(qm, anzZimmer, qmMiete, etage);

	}

	// Konstruktor
	public Haus(int anzWohnungen) {
		wohnungen = new Wohnung[anzWohnungen];

		for (int index = 0; index < anzWohnungen; index++) {
			wohnungen[index] = neueWohnung();
		}

	}

	public void print() {
		System.out.println("Das Haus besteht aus: ");

		for (int index = 0; index < wohnungen.length; index++) {
			System.out.print("  ");
			wohnungen[index].print();
		}
	}

	public Wohnung[] wohnungenInEtage(int etage) {
		int wohnungenInEtage = 0;
		for (int index = 0; index < wohnungen.length; index++) {
			Wohnung k = wohnungen[index];
			if (k.getEtage() == etage) {
				wohnungenInEtage++;
			}
		}

		int speicherplatz = 0;
		Wohnung ergebnis[] = new Wohnung[wohnungenInEtage];
		for (int index = 0; index < wohnungen.length; index++) {
			Wohnung k = wohnungen[index];
			if (k.getEtage() == etage) {
				ergebnis[speicherplatz] = k;
				speicherplatz++;
			}
		}
		return ergebnis;
	}
	
	/**
	public void print(Wohnung[] wohnungen) {
		for (int index = 0; index == wohnungen.length; index++) {
			System.out.println(wohnungen);
		}
		
	}**/

}

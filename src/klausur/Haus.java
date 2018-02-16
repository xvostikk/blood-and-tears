package klausur;

import java.util.Arrays;
import java.util.Random;

public class Haus {
	private Wohnung[] wohnungen;

	// Objektmethode die gibt ein Objekt Typ Wohnung zurück
	public Wohnung neueWohnung() {
		Random r = new Random();

		// Zufallszahlen
		// Ein Wert für eine Quadratmeterzahl qm aus dem Wertebereich 20, 40, 60, 80,
		// 100
		// 1. Variante: Array
		int qms[] = { 20, 40, 60, 80, 100 };
		int qm = qms[r.nextInt(qms.length)];

		// 2. Variante: min/max
		// int qmMin = 20;
		// int qmMax = 100;
		// int qm = qmMin + r.nextInt(qmMax - qmMin + 1);

		// Ein Wert für die Anzahl der Zimmer anzZimmer aus dem Wertebereich 1, 2, 3, 4,
		// 5
		int anzZimmer = 1 + r.nextInt(5);

		// Ein Wert für die etage aus dem Wertebereich 0, 1, 2, 3, 4, 5
		int etage = r.nextInt(6);

		// Ein Wert für den Mietpreis pro Quadratmeter qmMiete aus dem Wertebereich 8.0,
		// 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 12.5
		// Variante 1
		double qmMieten[] = { 8.5, 9, 9.5, 10, 10.5, 11, 11.5, 12, 12.5 };
		double qmMiete = qmMieten[r.nextInt(qmMieten.length)];

		// Variante 2
		// double qmMieteMin = 8.5;
		// double qmMieteMax = 12.5;
		// double qmMieteStep = 0.5;
		// int qmMieteNumSteps = (int)((qmMieteMax - qmMieteMin) / qmMieteStep);
		// double qmMiete = qmMieteMin + r.nextInt(qmMieteNumSteps + 1) * qmMieteStep;

		// Was wird ausgegeben wenn Dachgeschosswohnung wird
		if (etage == 5) {
			return new Dachgeschosswohnung(qm, anzZimmer, qmMiete);
		}

		return new Wohnung(qm, anzZimmer, qmMiete, etage);

	}

	// parametrisierte Konstruktor. Wohnung Array ist mit Objekten Typ Wohnung
	// gefüllt. Für jedes Element des wohnungen-Arrays die Objektmethode
	// neueWohnung() wird aufgerufen.
	public Haus(int anzWohnungen) {
		wohnungen = new Wohnung[anzWohnungen];

		for (int index = 0; index < anzWohnungen; index++) {
			wohnungen[index] = neueWohnung();
		}

	}

	// wohnungen-Array wird ausgegeben
	public void print() {
		System.out.println("Das Haus besteht aus: ");

		for (int index = 0; index < wohnungen.length; index++) {
			System.out.print("  ");
			wohnungen[index].print();
		}
	}

	// Objektmethode, die gibt ein Wohnung[] Array zurück 
	// liegen.
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

	// Diese Methode gibt das als Parameter übergebene wohnungen-Array auf der
	// Konsole aus, in der Form, die wir haben schon in Klasse Wohnung in Methode
	// toString ausgegeben
	public void print(Wohnung[] wohnungen) {
		for (int index = 0; index < wohnungen.length; index++) {
			Wohnung k = wohnungen[index];
			System.out.println(k);
		}

	}

	public Wohnung teuersteWohnung() {
		// Am Anfang ist noch keine Wohnung mit Max-Miete bekannt
		Wohnung maxMiete = null;
		
		// Gehe alle Wohnungen durch
		for (int index = 0; index < wohnungen.length; index++) {
			// Hole wohnung aus dem Array
			Wohnung k = wohnungen[index];
			
			// Wenn noch keine Wohnung mit Max-Miete bekannt ODER die Miete von k > als die von Max-Miete
			// dann haben wir eine neue teuerste Wohnung gefunden
			if(maxMiete == null || k.gesamtMiete() > maxMiete.gesamtMiete()) {
				maxMiete = k;
			}
		}

		return maxMiete;
	}

	public double gesamtMieteHaus() {
		double summe = 0;
		
		for(int index = 0; index < wohnungen.length; index++) {
			Wohnung k = wohnungen[index];
			summe = k.gesamtMiete() + summe;
		}
		return summe;

	}

	// e: Sortieren Wohnungen nach Preis
	//Bubblesort
	public void sortieren() {
		for (int n = wohnungen.length; n>1; n= n-1) {
			for(int i=0; i<n-1; i=i+1) {
				if (wohnungen[i+1].billiger(wohnungen[i]) ) {
					Wohnung tmp = wohnungen[i];
					wohnungen[i] = wohnungen[i+1];
					wohnungen[i+1] = tmp;
				}
			}
			
		}
	}
}

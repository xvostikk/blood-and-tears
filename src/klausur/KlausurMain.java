package klausur;

public class KlausurMain {

	public static void main(String[] args) {
		Wohnung w1 = new Wohnung(70, 3, 8.5, 4);
		Wohnung w2 = new Wohnung(40, 1, 7.5, 0);
		Dachgeschosswohnung w3 = new Dachgeschosswohnung(100, 4, 12.5);
		Haus h1 = new Haus(5);
		Haus h2 = new Haus(20);

		w1.print();
		w2.print();
		w3.print();
		h1.print();
		h2.print();

		System.out.println("Wohnungen in Etage 2");
		h1.print(h1.wohnungenInEtage(2));
		
		
		for (int etage = 0; etage<=5; etage++) {
			System.out.println("Etage " + etage + "------------------");
			h2.print(h2.wohnungenInEtage(etage));
		}
		
		System.out.println("Die teuerste Wohnung ist: ");
		h2.teuersteWohnung().print();
		
		System.out.println("Die Gesamtmiete für das Haus ist " + h2.gesamtMieteHaus());
		
		System.out.println("Haus 2 unsortiert");
		h2.print();
		
		h2.sortieren();
		System.out.println("Haus 2 sortiert");
		h2.print();
		
		
	}
}

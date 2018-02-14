package klausur;

import com.sun.org.apache.xml.internal.utils.Hashtree2Node;

public class KlausurMain {

	public static void main(String[] args) {
		Wohnung w1 = new Wohnung(70, 3, 8.5, 4);
		Wohnung w2 = new Wohnung(40, 1, 7.5, 0);
		Dachgeschosswohnung w3 = new Dachgeschosswohnung(100, 4, 12.5);
		Haus h1 = new Haus(5);

		w1.print();
		w2.print();
		w3.print();
		h1.print();

		System.out.println("Wohnungen in Etage 2");
		for (Wohnung wohnung : h1.wohnungenInEtage(2)) {
			wohnung.print();
		}
	}
}

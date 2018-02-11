package klausur;

public class Dachgeschosswohnung extends Wohnung{

	public Dachgeschosswohnung(int qm, int anzZimmer, double qmMiete, int etage) {
		super(qm, anzZimmer, qmMiete, etage);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		
			System.out.println(anzZimmer + " DG Wohnung mit " + qm + " qm in der 5. Etage.\\r\\n "
					+ "Monatliche Miete: " + gesamtMiete() + " Euro");
		
		return toString();
	}

}

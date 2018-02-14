package klausur;

public class Dachgeschosswohnung extends Wohnung{

	public Dachgeschosswohnung(int qm, int anzZimmer, double qmMiete) {
		super(qm, anzZimmer, qmMiete, 5);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {	
			return getAnzZimmer() + "-Zimmer DG Wohnung mit " + getQm() + " qm in der 5. Etage. "
					+ "Monatliche Miete: " + gesamtMiete() + " Euro";
	}

}

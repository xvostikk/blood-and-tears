package klausur;

public class Wohnung {
	//Objektvariablen, nur innerhalb der Klasse sichtbar
	private int qm;
	private int anzZimmer;
	private int etage;
	private double qmMiete; //Mietpreis pro m2
	
	//getter mit Sichtbarkeit public
	public int getQm() {
		return qm;
	}
	
	public int getAnzZimmer() {
		return anzZimmer;
	}
	
	public int getEtage() {
		return etage;
	}
	
	//Konstruktor 
	public Wohnung(int qm, int anzZimmer, double qmMiete, int etage) {
		this.qm=qm;
		this.anzZimmer=anzZimmer;
		this.etage=etage;
		this.qmMiete=qmMiete;
	}
	
	//Methode, die Gesamtmiete berechnet und gibt das Wert zurück
	public double gesamtMiete(){
		return (qm * qmMiete);
	}	
	
	public boolean billiger(Wohnung w) {
		/*if (gesamtMiete() < w.gesamtMiete()) {
			return true;
		}
		else {
			return false;
		}*/
		return gesamtMiete() < w.gesamtMiete();
	}
	
	public boolean teuerer(Wohnung w) {
		if (gesamtMiete() > w.gesamtMiete()) {
			return true;
		}
		else { 
			return false;
		}
	}
	
	@Override
	public String toString() {
		if (etage == 0) {
			return anzZimmer + "-Zimmer Wohnung mit " + qm + " qm im Erdgeschoss. "
					+ "Monatliche Miete: " + gesamtMiete() + " Euro";
		}
		else {
			 return anzZimmer + "-Zimmer Wohnung mit " + qm + " qm in der " + etage
					 + ". etage.  Monatliche Miete: " + gesamtMiete() + " Euro";
		}
		
	}
	
	public void print() {
		System.out.println(toString());
		
	}
}

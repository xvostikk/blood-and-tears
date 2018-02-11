package klausur;

public class Wohnung {
	//Objektvariablen, nur innerhalb der Klasse sichtbar
	protected int qm;
	protected int anzZimmer;
	protected int etage;
	protected double qmMiete; //Mietpreis pro m2
	
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
		if () {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean teuerer(Wohnung w) {
		if () {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		if (etage <= 0) {
			System.out.println(anzZimmer + " Wohnung mit " + qm + " qm im Erdgeschoss.\\r\\n "
					+ "Monatliche Miete: " + gesamtMiete() + " Euro");
		}
		if (etage >= 1) {
			System.out.println(anzZimmer + " Wohnung mit " + qm + " qm in der " + etage
					+ ". etage. \\\\r\\\\n Monatliche Miete: " + gesamtMiete() + " Euro");
		}
		return toString();
	}
}

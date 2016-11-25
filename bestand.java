/**@author Christian
 * @version 1.1
 *
 */

public class bestand{
	
	private static String kennzeichen;
	private int km;
	int kminspektion;
	private boolean vermietet;
	private boolean lkw;
	private int nutzlast;
	public int strecke;
	public int tage;
	public int preis;
	private int nr=0;
	public int fahrzeuge[]= new int[100]; 
	
	public bestand(String Kennzeichen, int km, int kminspektion, boolean vermietet, int nutzlast, boolean lkw){
		this.kennzeichen=kennzeichen;
		this.km=km;
		this.kminspektion=kminspektion;
		this.vermietet=vermietet;
		this.nutzlast=nutzlast;	
		this.lkw=lkw;
		nr=nr+1;
	}
	
	/**
	 * rückgabe eines fahrzeugs, überprüfung der inspektion und Preisberechnung
	 * @param strecke zurückgelegte Strecke während der Ausleihe
	 * @param tage Mietdauer
	 */
	public void ruckgabe(int strecke, int tage){
		km=km+strecke;
		kminspektion=kminspektion+strecke;
		vermietet=false;
		if(kminspektion>=30000 && lkw == false){
			System.out.println("PKW muss zur Inspektion!");
			kminspektion=0;
			
		}
		if(kminspektion>=20000 && lkw == true){
			System.out.println("LKW muss zur Inspektion!");
			kminspektion=0;
			
		}
		
		
		if(lkw==false){
			preis=30*tage;
		}
		if(lkw==true && nutzlast <= 1800){
			preis=50*tage;
		}
		else{
			preis=80*tage;
		}
		System.out.println("Der Preis beträgt " + preis + " €");
		
	}
	
	public boolean ausleihe(){
		if(vermietet==true){
			System.out.println("Fahrzeug ist bereits vermietet!");
		}
		else{
			vermietet=true;
			return vermietet;
		}
		return vermietet;
	}
}



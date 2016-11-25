
public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bestand f1 = new bestand("coe xy 123", 0, 0, false, 0, false);
		bestand f2 = new bestand("coe xy 122", 40000, 29900, false, 0, false);
		bestand f3 = new bestand("coe ll 456", 0, 0, false, 1500, true);
		bestand f4 = new bestand("coe ll 567", 50000, 19600, false, 3500, true);
		
		f1.ausleihe();
		f1.ausleihe();
		f2.ruckgabe(200, 3);
		f2.ruckgabe(200, 5);
		f1.ruckgabe(50, 1);
		f1.ausleihe();
		f4.ruckgabe(500, 2);
		System.out.println(f2.kminspektion);

	}

}

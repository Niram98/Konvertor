import java.util.*;
public class Konvertor {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Izaberite dinare (D) ili evre (E): ");
		String valuta = input.next();
		while (!valuta.equals("E") && !valuta.equals("D")) {
			System.out.print("Molim Vas unesite samo D za dinare ili E evre: ");
			valuta = input.next();
		}
	
		if (valuta.equals("E")) {
			System.out.print("Unesi iznos u evrima: ");
			double evro = input.nextDouble();
			double dinar = 118 * evro;
			System.out.println("Iznos u dinarima je: " + dinar);	
		} else {
			System.out.print("Unesi iznos u dinarima: ");
			double dinar = input.nextDouble();
			double evro = dinar / 118;
			System.out.println("Iznos u evrima je: " + evro);
		}
		
		/* Drugi nacin sa "private" metodom */
		
		Kurs k = new Kurs (118D);
		Double dinari = k.konvertujURSD(100D);
		System.out.println(dinari);
		
	}

}

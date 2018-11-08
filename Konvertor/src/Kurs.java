
public class Kurs {
	
	private Double srednjiKurs;
	
	public Kurs (Double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
	
	public Double konvertujURSD (Double iznos) {
		return srednjiKurs * iznos;
	}
	
	public Double pretvoriUValutu (Double iznos) {
		return iznos/srednjiKurs;
	}


}

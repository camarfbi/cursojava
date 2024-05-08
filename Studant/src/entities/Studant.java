package entities;

public class Studant {
	
	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double mediaFinal() {
		return note1 + note2 + note3;  	
	}
	
	public double missing() {
		if (mediaFinal() > 60.00) {
			return mediaFinal();
		}
		else {
			return 60 - mediaFinal();
		}
	}
	
}

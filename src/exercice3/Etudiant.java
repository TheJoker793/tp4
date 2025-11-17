package exercice3;

public class Etudiant {
	String nom;
	double note;
	public Etudiant(String nom, double note) {
		this.nom=nom;
		this.note=note;
	}
   
	@Override 
	public String toString() {
		return "etudiant { nom :"+nom +" note:"+note+"}";
	}

}

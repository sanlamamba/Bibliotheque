package exercice.com.supinfo.java;


public class Manuel extends Livre {
	private int niveau;

	public Manuel(int enregistement, String titre, String Auteur, int NbPage, int niveau ) {
		super(enregistement, titre, Auteur, NbPage);
		// TODO Auto-generated constructor stub
		this.niveau = niveau;
		
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return super.toString() + "Manuel [niveau=" + niveau + "]";
	}
	
	

	
}
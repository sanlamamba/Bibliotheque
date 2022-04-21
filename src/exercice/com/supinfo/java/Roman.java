package exercice.com.supinfo.java;


public class Roman extends Livre {
	private PrixLitteraire prixLitt;

	public Roman(int enregistement, String titre, String Auteur, int NbPage, PrixLitteraire prixLitt) {
		super(enregistement, titre, Auteur, NbPage);
		// TODO Auto-generated constructor stub
		this.prixLitt = prixLitt;
	}


	public PrixLitteraire getPrixLitt() {
		return prixLitt;
	}


	public void setPrixLitt(PrixLitteraire prixLitt) {
		this.prixLitt = prixLitt;
	}


	@Override
	public String toString() {
		return super.toString() + "Roman [prixLitt=" + prixLitt + "]";
	}
	
	

}
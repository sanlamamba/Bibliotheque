package exercice.com.supinfo.java;

public class Livre extends Document {
    protected int NbPage;
    protected String Auteur;


    public Livre(int enregistement, String titre, String Auteur, int NbPage) {
		super(enregistement, titre);
		// TODO Auto-generated constructor stub
		this.Auteur = Auteur;
		this.NbPage = NbPage;
	}

	public int getNbPage() {
		return NbPage;
	}


	public void setNbPage(int nbPage) {
		NbPage = nbPage;
	}


	public String getAuteur() {
		return Auteur;
	}


	public void setAuteur(String auteur) {
		Auteur = auteur;
	}


	@Override
	public String toString() {
		return super.toString() + "Livre [NbPage=" + NbPage + ", Auteur=" + Auteur + ", enregistement=" + enregistement + ", titre="
				+ titre + "]";
	}

    
	

}
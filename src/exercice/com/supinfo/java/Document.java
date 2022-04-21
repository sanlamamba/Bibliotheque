package exercice.com.supinfo.java;

public class Document {
	protected String titre;
	protected int enregistement;

	public Document(int enregistement, String titre) {
		this.enregistement = enregistement;
		this.titre = titre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getEnregistement() {
		return enregistement;
	}

	public void setEnregistement(int enregistement) {
		this.enregistement = enregistement;
	}

	@Override
	public String toString() {
		return "Document [titre=" + titre + ", enregistement=" + enregistement + "]";
	}

}
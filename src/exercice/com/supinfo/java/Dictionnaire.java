package exercice.com.supinfo.java;

public class Dictionnaire extends Document {
	private String langue;

	public Dictionnaire(int enregistement, String titre, String langue) {
		super(enregistement, titre);
		// TODO Auto-generated constructor stub
		this.langue = langue;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	@Override
	public String toString() {
		return super.toString() + "Dictionnaire [langue=" + langue + "]";
	}
	
}

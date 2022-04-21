package exercice.com.supinfo.java;

import java.util.ArrayList;

public class Livrotheque extends Bibliotheque {
	public ArrayList<Livre> listLivres;

	public Livrotheque() {
		listLivres = new ArrayList<Livre>();
	}
	
	@Override
	public void afficherAuteur() {
		 for(Livre livre : listLivres) {
			 System.out.println(livre.getAuteur());
		 }
	}
}

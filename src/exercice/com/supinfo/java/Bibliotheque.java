package exercice.com.supinfo.java;

import java.util.ArrayList;

public class Bibliotheque {
	public ArrayList<Document> listDocs;



	public Bibliotheque() {
		listDocs = new ArrayList<Document>();
	}

	public void afficherDoc() {
		System.out.println("Liste des Documents: " + listDocs);
	}

	public Document document(int i) {
		return listDocs.get(i);
	}

	public void ajouter(Document document) {
		listDocs.add(document);
	}

	public boolean supprimer(Document document) {
		if (listDocs.contains(document)) {
			listDocs.remove(document);
			return true;
		}
		
		return false;
		
	}

	public void afficherAuteur() {
		 for(int i=0;i<listDocs.size();i++){
            if(listDocs.get(i) instanceof Livre)
                System.out.println( ((Livre) listDocs.get(i)).getAuteur() );
	    }
	}
}

package fr.eisti.ing1.java.cdmanager.data;

public class CDAudio {
	private long iSBN;
	private String artiste;
	private String titre;
	private String style;
	private int nbrePistes;
   
	/**
	 * constructeur d'un CD audio à partir de ses propriétés
	 */
	public CDAudio(long iSBN, String artiste, String titre, String style, int
			nbrePistes){
		this.iSBN = iSBN;
		this.artiste = artiste;
		this.titre = titre;
		this.style = style;
		this.nbrePistes = nbrePistes;
 	}
   
	// accesseurs en lecture des différentes propriétés d'un CD audio

	public long getISBN(){
		return iSBN;
	}

	public String getArtiste(){
    	return artiste;
	}
   
	public String getTitre(){
    	return titre;
	}
   
	public String getStyle(){
		return style;
	}
   
	public int getNbrePistes(){
		return nbrePistes;
	}

	/**
	 * représentation sous la forme d'une chaîne de caractères d'un CD Audio
	 * @return la représentation sous forme de chaîne de caractères du CD
	 */
	public String toString(){
    	String str = "CD[";
      
      	str += iSBN + ",";
      	str += artiste + ",";
      	str += titre + ",";
      	str += style + ",";
      	str += nbrePistes + "]";
      	return str;
   }
}

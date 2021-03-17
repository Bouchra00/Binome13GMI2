package fr.eisti.ing1.java.cdmanager.data;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class CDTheque implements Iterable<CDAudio> {
	// la liste ordonnée des CDs
	private List<CDAudio> catalogue; 
	
	// indexations des CDs
	private Map<Long,CDAudio> cdByIsbn;
	private Map<String,CDAudio> cdByArtistTitle;
	private Map<String,CDAudio> cdByStyleTitle;
	
	
	

	/**
	 * constructeur de CDTheque
	 * initialise la liste des CDs et les index
	 */
	public CDTheque(){
		
		this.catalogue = new ArrayList<CDAudio>();
		this.cdByIsbn = new HashMap<Long,CDAudio>();
		this.cdByArtistTitle = new HashMap<String,CDAudio>();
		this.cdByStyleTitle = new HashMap<String,CDAudio>();
		
		
	}
   
	/**
 	 * ajout d'un CD dans la CDTheque
	 * @param cd le CD à ajouter
	 * @return true si le CD a bien été ajouté, false s'il y a un 
	 * doublon dans l'indexation ou un problème lors de l'ajout dans la liste
	 */
	
	public boolean ajouterCD(CDAudio cd) {
		//for (int i=0; i<(; i++) {
			if((this.cdByIsbn.containsKey(cd.getISBN()))){ // il suffit de vérifier dans 1 || (this.cdByArtistTitle.containsKey(cd.getArtiste())) || (this.cdByStyleTitle.containsKey(cd.getTitre()))) { 
			
			
				return false;
				}
	
			else {
				catalogue.add(cd);
				cdByIsbn.put(cd.getISBN(),cd);
                cdByArtistTitle.put(clefArtisteTitre(cd),cd);
                cdByStyleTitle.put(clefStyleTitre(cd),cd);
                return true;
					
				}
			
		
	}
		
	/**
 	 * ajout d'un CD dans la CDTheque à partir de ses propriétés
	 * @param iSBN le numéro ISBN du CD à ajouter
	 * @param artiste l'artiste du CD à ajouter
	 * @param titre le titre du CD à ajouter
	 * @param style le style ISBN du CD à ajouter
	 * @param nbrePistes le nombre de psites du CD à ajouter
	 * @return true si le CD a bien été ajouté, false s'il y a un 
	 * doublon dans l'indexation ou un problème lors de l'ajout dans la liste
	 */
	public boolean ajouterCD(long iSBN, String artiste, String titre, String
			style, int nbrePistes){
		CDAudio cd = new CDAudio(iSBN, artiste, titre, style, nbrePistes);
		return this.ajouterCD(cd);
	}

	/**
	 * suppression d'un CD dans la CDTheque à partir de sa référence
	 * @param cd le CD à supprimer
	 * @return true si le CD était présent dans la CDTheque et a bien été
	 * supprimé
	 */
	public boolean supprimerCD(CDAudio cd) {
		// TODO

	}
			
	/**
	 * suppression d'un CD dans la CDTheque à partir de son numéro ISBN
	 * @param iSBN le numéro ISBN du CD à supprimer
	 * @return true si le CD était présent dans la CDTheque et a bien été
	 * supprimé
	 */
	public boolean supprimerCD(long iSBN) {
		// suppression du CD en se servant de son indexation par ISBN
		return supprimerCD(iSBN, cdByIsbn);
	}
		
	/**
	 * suppression d'un CD dans la CDTheque à partir de son artiste
	 * et de son titre
	 * @param artiste l'artiste du CD à supprimer
	 * @param titre le titre du CD à supprimer
	 * @return true si le CD était présent dans la CDTheque et a bien été
	 * supprimé
	 */
	public boolean supprimerCDparArtisteTitre(String artiste, String titre) {
		// suppression du CD en se servant de son indexation par artiste et
		// titre
		return supprimerCD(clef(artiste, titre), cdByArtistTitle); 
	}

	/**
	 * suppression d'un CD dans la CDTheque à partir de son style
	 * et de son titre
	 * @param style le style du CD à supprimer
	 * @param titre le titre du CD à supprimer
	 * @return true si le CD était présent dans la CDTheque et a bien été
	 * supprimé
	 */
	public boolean supprimerCDparStyleTitre(String style, String titre) {
		// suppression du CD en se servant de son indexation par style et
		// titre
		return supprimerCD(clef(style, titre), cdByStyleTitle); // indexStyleTitre est la map 
	}

	/**
	 * recherche d'un CD par son numéro ISBN
	 * @param iSBN le numéro ISBN du CD à rechercher
	 * @return le CD correspondant au numéro ISBN s'il est présent dans la
	 * CDThèque, null sinon
	 */
	public CDAudio rechercherCD(long iSBN) {

		// TODO
		
	}

	/**
	 * recherche d'un CD par son artiste et titre
	 * @param artiste l'artiste du CD à rechercher
	 * @param titre le titre du CD à rechercher
	 * @return le CD correspondant aux critères de recherche s'il est présent dans la
	 * CDThèque, null sinon
	 */
	public CDAudio getCDparArtisteTitre(String artiste, String titre) {
		
		// TODO
	}
	
	/**
	 * recherche d'un CD par son style et titre
	 * @param style l'artiste du CD à rechercher
	 * @param titre le titre du CD à rechercher
	 * @return le CD correspondant aux critères de recherche s'il est présent 
	 * dans la CDThèque, null sinon
	 */
	public CDAudio getCDparStyleTitre(String style, String titre) {
		
		// TODO
	}

	/**
	 * construction d'un itérateur pour parcourir la CDThèque
	 * @return un itérateur pour parcourir la CDThèque
	 */
	public Iterator<CDAudio> iterator() {
		return catalogue.iterator();
	}

	/**
	 * construction d'un itérateur ordonné pour parcourir la CDThèque
	 * @return un itérateur ordonné pour parcourir la CDThèque
	 */
	public ListIterator<CDAudio> listIterator() {
		return catalogue.listIterator();
	}

	/**
	 * sauvegarde d'une CDTheque dans un fichier
	 * TODO
	 * @param nomFichier le nom du fichier contenant la sauvegarde de la
	 * CDThèque
	 */
    public void sauvegarder(String nomFichier){
      //TODO
   	}

	/**
	 * chargement d'une CDTheque à partir d'un fichier
	 * TODO (pour l'instant chargement en dur)
	 * @param nomFichier le nom du fichier contenant la sauvegarde de la
	 * CDThèque
	 */
  	public void charger(String nomFichier) {
		// Pour l'instant chargement en dur de qqs CDs
		this.ajouterCD(1L, "J.Geils Band", "live in Detroit", "Rythm&Blues", 14);
		this.ajouterCD(2L, "Deep Purple", "Made in Europe", "Hard Rock", 12);
		this.ajouterCD(3L, "Rolling Stones", "Love you Live", "Rythm&Blues", 7);
	}

	/**
	 * suppression d'un CD à partir d'une clef d'indexation et d'un index
	 * @param clef la clef d'indéxation
	 * @param index l'index dans lequel chercher le CD à partir de la clef
	 * @return true si le CD était présent dans la CDTheque et a bien été
	 * supprimé
	 */
	private <K> boolean supprimerCD(K clef, Map<K,CDAudio> index) { 
        // TODO
	}

	/**
	 * fabrication d'une clef normalisée à partir d'un tuple de chaînes
	 * de caractères
	 * @param parties le tuple à partir duquel fabriquer la clef
	 * @return la clef constitués des différentes parties (normalisée en
	 * majuscule) et séparées par le caractère '-'
	 * @throws IllegalArgumentException le tuple doit contenir au moins un
	 * élément
	 */
	private static String clef(String... parties) { //les ... veulent dire nb de paramètre=variable, un chaine 2 ou 3... chainesde caract
		
		 String clefResultat;                       //code donné par prof

		 

         if (parties.length < 1) {
             // NB : ne doit pas arriver ici
             throw new IllegalArgumentException("clé d'indexation vide");
         }
         clefResultat = parties[0].toUpperCase();
         for (int i = 1; i < parties.length; i++) {
             clefResultat += "-" + parties[i].toUpperCase();
         }
         return clefResultat;
     }
	

	/**
	 * fabrication d'une clef à partir des propriétés artiste et titre d'un CD
	 * @param cd le CD dont on veut extraire la clef
	 * @return la clef constituée à partir du nom d'artiste et du titre du CD
	 */
	private static String clefArtisteTitre(CDAudio cd) {
		return clef(cd.getArtiste(),cd.getTitre());
	}

	/**
	 * fabrication d'une clef à partir des propriétés style et titre d'un CD
	 * @param cd le CD dont on veut extraire la clef
	 * @return la clef constituée à partir du style et du titre du CD
	 */
	private static String clefStyleTitre(CDAudio cd) {
		
		return clef(cd.getStyle(),cd.getTitre());
	}


}

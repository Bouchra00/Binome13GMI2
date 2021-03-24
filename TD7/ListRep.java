package testFichiers;
import java.io.*;

public class ListRep {
	
	public static void main(String[] args) {
		listRep(new File("."));
		}
	
		public static void listRep(File rep) {
		if (rep.isDirectory()) {
		//liste les fichier du répertoire
		String t[]=rep.list();  //t=tableau de chaine de caract
		for (int i=0;i<t.length;i++)
		    System.out.println(t[i]); //pour la tabulation on met System.out.println("  " +t[i]);
		    
		}
		}

}

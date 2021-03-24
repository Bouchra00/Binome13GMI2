package testFichiers;
import java.io.*;

public class CopieFichier {
	public static void main(String[] args) {
		
		try 
		{
		FileReader fr = new FileReader("essai.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("copie.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
	   
		String str;
	    // Copie le contenu dans le nouveau fichier
	    while((str = br.readLine()) != null)         //tant que il ya des lignes (non vides) dans mon fichier source ici essai     
	    {
			   bw.write(str); //on écrit dans le fichier copie la ligne récupérée grâce a br.readLine
			   bw.newLine(); 
			   
	    }
		 bw.close();
		}
		catch (Exception e)
		{ System.out.println("Erreur "+e);}
		
	}
}

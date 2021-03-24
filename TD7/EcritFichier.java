package testFichiers;
import java.io.*;

public class EcritFichier {
	public static void main(String[] args)
	{
	
	try
	
	{
	FileWriter fw = new FileWriter("essai.txt");
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write("La vie est belle!");
	bw.newLine();
	
	bw.write("Il faut en profiter et rester optimiste");
    bw.newLine();
	
	bw.write("Tout en gardant à l'esprit qu'il ya des hauts et des bas. Mais il ne faut jamais abandonner");
	bw.close();
	
	}
	
	catch (Exception e)
	{ System.out.println("Erreur "+e);}
	}

}

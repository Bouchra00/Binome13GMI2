package testFichiers;
import java.io.*;

public class TestPerformance {
	
	public static void main(String[] args) {
		try
		
		{
		FileWriter fw = new FileWriter("test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		int n=1000000;
		
		for(int i=0; i<n;i=i+2) {  
		bw.write(Integer.toString(i));  //bw.write(" " +i);  // permet de convertir i en une chaine de caractères
		bw.newLine();
		
		}
		bw.close();
		
		}
		
		catch (Exception e)
		{ System.out.println("Erreur "+e);}
		
		
	try 
	{
		
	FileInputStream fis = new FileInputStream("test.txt"); 
	BufferedInputStream bis = new BufferedInputStream(fis);
	byte[] buf = new byte[8]; //on réserve 8 octets pour le buffer 
	long startTime = System.currentTimeMillis();
	
	while(fis.read(buf) != -1);
	System.out.println("Temps de lecture avec FileInputStream : " +
	(System.currentTimeMillis() - startTime));
	
	startTime = System.currentTimeMillis();
	while(bis.read(buf) != -1);
	System.out.println("Temps de lecture avec BufferedInputStream : " +
	(System.currentTimeMillis() - startTime));
	
	fis.close();
	bis.close();
	}
	catch (FileNotFoundException e) { e.printStackTrace(); }
	catch (IOException e) { e.printStackTrace(); }
	}

	}




package myfirstproject;
import java.util.Scanner;

public class Calc
{
	public static void main(String[] args)
	{
		Scanner sc;
		 sc = new Scanner(System.in);
        	System.out.print("Saisir un entier : ");
        	int value1 = sc.nextInt();  // saisie d'un premier entier avec le Scanner
		// value1= sc.nextInt(); 
        	sc.nextLine();
		
        	System.out.print("Saisir un entier2 : ");
        	int value2= sc.nextInt();  // saisie d'un deuxième entier avec le Scanner

        	System.out.printf("La somme est " + (value1+value2));

        	sc.close() ; // fermeture de l’entrée
	}
}


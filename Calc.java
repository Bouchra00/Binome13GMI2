package myfirstproject;
import java.util.Scanner;

public class Calc
{
	public static void main(String[] args)
	{
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.print("Saisir un entier : ");
		int value;
		value = sc.nextInt();
		sc.nextLine();
		System.out.printf("L'entier entré est " + value);
		
		sc.close() ; // fermeture de l’entrée
	}
}


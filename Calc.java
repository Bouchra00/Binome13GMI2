package myfirstproject;
import java.util.Scanner;


1)
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

3)
	//3)
public class Calc
{
	public static void main(String[] args)
	{
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.print("Saisir un ENTIER : ");
		int value = sc.nextInt();
		sc.nextLine();
		System.out.printf("L'entier entré est " + value);
		
		sc.close() ; // fermeture de l’entrée
	}
}

//4)

public class Calc
{
	public static void main(String[] args)
	{
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.print("Saisir un ENTIER1 : ");
		int value1= sc.nextInt();
		sc.nextLine();
		System.out.print("Saisir un ENTIER2 : ");
		int value2= sc.nextInt();
		sc.nextLine();
		
		System.out.printf("La somme est " + (value1+value2));
		
		sc.close() ; // fermeture de l’entrée
	}
}

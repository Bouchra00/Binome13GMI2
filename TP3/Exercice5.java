package com.company;
import java.util.Scanner;
import java.lang.Integer;

public class Exercice5 {
    // 12) méthode qui prend un tableau de chaînes de caractères en argument et
    //renvoie un tableau d'entiers de même taille contenant les entiers issus des chaînes de
    //caractères.

    public static int[] TabStr2TabInt(String[] tab) {

        int[] res = new int[tab.length]; // initialise tableau vide
        
        for(int i =0; i < tab.length; i++) { // pour toute les case du tableau
            res[i] = Integer.parseInt(tab[i]); // on colle le string converti en entier
        }
        return res;
    }
  
  //13) 13. Écrire une méthode qui prend un tableau d'entiers en argument et renvoie la
   //somme de ceux- ci
    public static int SommeTab(int[] tab) {

        int res = 0; // initialse resultat à 0
        for (int x : tab)  { // pour chaq entier du tableau
            res += x; // on l'additionne au resultat
        }
        return res; // on retourne ça
    }
  
  
    public static void main(String[] args) {
        
        String [] test = { "0","1","2","10"}; 
        System.out.println(SommeTab(TabStr2TabInt(test))); // affiche la somme des element de tab

    }
}

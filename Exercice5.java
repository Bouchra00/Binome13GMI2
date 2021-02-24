package com.company;
import java.util.Scanner;
import java.lang.Integer;

public class Exercice5 {
    // 12) méthode qui prend un tableau de chaînes de caractères en argument et
    //renvoie un tableau d'entiers de même taille contenant les entiers issus des chaînes de
    //caractères.

    public static int[] TabStr2TabInt(String[] tab) {

        int[] res = new int[tab.length];
        for(int i =0; i < tab.length; i++) {
            res[i] = Integer.parseInt(tab[i]);
        }
        return res;
    }
  
  //13) 13. Écrire une méthode qui prend un tableau d'entiers en argument et renvoie la
   //somme de ceux- ci
    public static int SommeTab(int[] tab) {

        int res = 0;
        for (int x : tab)  {
            res += x;
        }
        return res;
    }
  
  
    public static void main(String[] args) {
        String [] test = { "0","1","2"};
        System.out.println(SommeTab(TabStr2TabInt(test)));

    }
}

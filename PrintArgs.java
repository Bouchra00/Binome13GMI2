package com.company;
import java.util.Scanner;

public class PrintArgs {

    public static void main(String[] args) {
        // args c juste la listes de strings saisie par exemple "java Main.java beteau 0 pingpong"
        // la liste de d'argument yaura "bateau","0","pingpong"
       
         System.out.println(args[0].toString()); // afficher le premier argument
      
        // exemple
        String [] names = { "Le", "langage", "Java", "me", "plait", "beaucoup"}; // liste de mot

        for (String mot : names) // for chaque 'mot' dans 'names'
            System.out.println(mot.toString()); // afficher le mot

    }
}

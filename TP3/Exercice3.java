
import java.util.Scanner;

public class Exercice3 {
    // fct pour saisir un entier
    public static int SaisieInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    // fonction retourne la valeur max d'un tableaud 'entier
    public static int Max(int[] tab) {
        int max = tab[0];
        for( int x : tab ) {
            if (x > max) {
                max = x;
            }
        }

        return max;
    }

    public static int Fact(int n) {
        int res = 1;
        for( int i=2; i <= n; i++ ) {
            res *= i;
        }

        return res;
    }
    public static boolean estPremier(int x) {
        if (x > 2) {
            int i = 2;

            while ((x % i != 0) && (i < x))
                i++;

            return (i==x);

        }else {
            return false;
        }

    }

    public static void ex1() {
        int [] liste2saisie = new int[4];
        for (int i = 0; i < 4; i++){
            System.out.println(String.format("[%d] >",i ));
            liste2saisie[i] = SaisieInt();

        }
        System.out.println(String.format(" max ---> %d",Max(liste2saisie) ));


    }
    public static void ex2() {
        System.out.println(" saisir un entier n > ");int n = SaisieInt();
        int res = Fact(n);
        System.out.println(" = " + res );
    }
    public static void ex3() {
        System.out.println(" > ");int x = SaisieInt();
        boolean res = estPremier(x);
        System.out.println(x + " premier ? " + res );
    }
    public static void main(String[] args) {
	// write your code here
        ex2();
    }
}

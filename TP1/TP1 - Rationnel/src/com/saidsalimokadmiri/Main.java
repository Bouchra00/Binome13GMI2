package com.saidsalimokadmiri;


public class Main {

    public static void main(String[] args) {

        Rational x = new Rational(3,2);
        System.out.println("x : " + x);
        /*
        Rational z = new Rational(3,0);
        System.out.println(z); // Q3 : à ce stade ou on peut creer un rationnel de dénominateur égal à 0. C'est un pb
        // parce que c'est impossible */
        Rational y = new Rational(1,3);
        System.out.println("y : " + y);

        // Q5
        System.out.println("--------------\n *** Question 5 : ");
       // x.mult(y);
       // System.out.println("x*y : " + x);
        // Q6
        System.out.println("--------------\n *** Question 6 : ");
        x.add(y); // x = x + y
        System.out.println("x+y : " + x);
        //Q7
        System.out.println("--------------\n *** Question 7 : ");
        Rational z = new Rational(5,10);
        System.out.println("z : " + z);
        z.reduce();
        System.out.println("z (reduced) : " + z);

        // Q8
        System.out.println("--------------\n *** Question 8 : ");
        Vector u = new Vector(new Rational[] {x,y}); // initialiser vector u avec un tableau de rationel contenant x,y
        System.out.println("u : " + u);

        // Q9
        System.out.println("--------------\n *** Question 9 : ");
        u.set(1,z);
        System.out.println("u (after change): " + u);

        System.out.println("--------------\n *** Question 9.b : ");
        Vector v = new Vector(new Rational[] {new Rational(0,1),new Rational(0,1)});
        System.out.println("v : " + v);
        Rational a = new Rational(2,3);
        v.set(0,a); // le premier élement du vecteur est à l'indice 0
        System.out.println("v (after change) : " + v);
        Rational b = new Rational(3,2);
        a.mult(b);
        System.out.println("v (after change) : " + v);
        // on observe que le premier élement de v a été modifié via la var a (ça doit etre une histoire de pointeur)
        // c'est pas un pb,
        // On constate aussi on peut optimiser le 'problème" en ajoutant des conditions d'affichage en améliorant la fct toString()

        System.out.println("--------------\n *** Question 9.d : ");
        Vector vv = new Vector(new Rational[] {new Rational(1,2),new Rational(1,2)});
        System.out.println("v : " + vv);
        Rational aa = vv.get(0);
        aa.mult(new Rational(1,3));
        System.out.println("v : " + vv);
        // On constate
        System.out.println("--------------\n *** Question 10 : ");
        Vector v0 = new Vector(new Rational[] {new Rational(2,3),new Rational(1,2)});
        System.out.println("v0 : " + v0);
        v0.mult(new Rational(1,2));
        System.out.println("(v0 = v0*1/2) v0 : " + v0);
        Vector v1 = new Vector(new Rational[] {new Rational(3,3),new Rational(1,2)});
        System.out.println("v1 : " + v1);
        v0.addV(v1);
        System.out.println("(v0 = v0+v1) v0 : " + v0);

    }
}

package com.saidsalimokadmiri;


public class Main {

    public static void main(String[] args) {

        Rational a = new Rational(5,2);
        System.out.println("a : " + a);
        /*
        Rational z = new Rational(3,0);
        System.out.println(z); // Q3 : à ce stade ou on peut creer un rationnel de dénominateur égal à 0. C'est un pb
        // parce que c'est impossible */
        Rational y = new Rational(1,2);
        System.out.println("y : " + y);
        
        // Q5
        a.mult(y);
        System.out.println("a*y : " + a);



    }
}

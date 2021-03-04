package com.saidsalimokadmiri;



public class Rational {


    private int den;
    private int num;

    public Rational(int numerateur, int denominateur) {
        this.den = denominateur;
        this.num = numerateur;

        if (this.den == 0) { // Q4 : si le dénominateur vaut 0, une erreur est donné, le programme s'arrete
            throw new java.lang.Error("ZeroDivisionError");

        }
    }
// Question 2
    public String toString() {
        return this.num + " / " + this.den;
    }

    // Question 5
    public void mult(Rational f2) {
        this.num *= f2.num;
        this.den *= f2.den;

    }


    // Question 6
    public void add(Rational f2) { // a/b + c/d == (ad + cb) / bd

        this.num = this.num*f2.den + f2.num*this.den;
        this.den *= f2.den;

    }
// Question 7
    public int pgcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return pgcd(b,(a % b));
        }
    }

    public void reduce() { // a/b + c/d == (ad + cb) / bd
        int p = pgcd(this.num,this.den);
        this.num = this.num / p;
        this.den = this.den / p;

    }



}

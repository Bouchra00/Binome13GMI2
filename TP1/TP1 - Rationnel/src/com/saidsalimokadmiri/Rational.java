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
}

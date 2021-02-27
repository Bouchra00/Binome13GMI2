package com.saidsalimokadmiri;

public class Rational {


    private int den;
    private int num;

    public Rational(int numerateur, int denominateur) {
        this.den = denominateur;
        this.num = numerateur;
    }

    public String toString() {
        return this.num + "/" + this.den;
    }
}

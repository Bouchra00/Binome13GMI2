package com.saidsalimokadmiri;

public class Vector {

    private Rational[] vec;

    public Vector(Rational[] vecteur) {
        if (vecteur.length > 0) { // Q4 : si le dénominateur vaut 0, une erreur est donné, le programme s'arrete
            this.vec = vecteur;
        } else {
            throw new java.lang.Error("La tableau de rationels est vide");

        }
    }

    public String toString() {

        String res = "< " ;
        for(int i = 0; i < this.vec.length-1; i++) {
            res += this.vec[i].toString();
            res += ", ";
        }
        res += this.vec[this.vec.length-1].toString();
        res += " >";
        return res;
    }
    public void set(int i, Rational r) { // Q9.a

        if ((i < 0) || (i >= this.vec.length)) {
            throw new java.lang.Error("i excède la dimension du vecteur");
        }

        this.vec[i] = r;
    }

    public Rational get(int i) { // Q9.a

        if ((i < 0) || (i >= this.vec.length)) {
            throw new java.lang.Error("i excède la dimension du vecteur");
        }

        return this.vec[i];
    }

}

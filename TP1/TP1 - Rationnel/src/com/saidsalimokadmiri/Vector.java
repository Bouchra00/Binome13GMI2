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
    // Question 10
    public void mult(Rational r) { // Q10.a

        for(int i = 0; i < this.vec.length; i++) {
            this.vec[i].mult(r);
        }

    }
    public void addV(Vector u) { // Q10.b
        if(this.vec.length != u.vec.length) {
            throw new java.lang.Error("le vecteur passé en paramètre n’est pas de même dimension");
        }

        for(int i = 0; i < this.vec.length; i++) {
            this.vec[i].add(u.vec[i]);
        }

    }

}

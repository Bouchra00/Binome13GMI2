package saidsalimokadmiri;

import java.util.Objects;

public class Rectangle extends Figure{
private double largeur;
private double longueur;


    public Rectangle(String nom, String color, double lo, double la) {

        super(nom, color);
        this.largeur = la;
        this.longueur = lo;


    }
    public Rectangle(String color, double lo, double la) {
        super("Rectangle", color);
        this.largeur = la;
        this.longueur = lo;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.largeur, largeur) == 0 &&
                Double.compare(rectangle.longueur, longueur) == 0 && rectangle.getCouleur() == this.getCouleur();
    }

    @Override
    public int hashCode() { // ça sert à quoi en vrai ?

        return Objects.hash(largeur, longueur);
    }

    @Override
    public double perimetre() {
        return this.longueur*2 + this.largeur*2;
    }

    @Override
    public double surface() {
        return this.longueur*this.largeur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
}

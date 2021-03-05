package saidsalimokadmiri;

import java.util.Objects;

public class Cercle extends Figure {

    private double rayon;

    public Cercle(String color, double r) {
       super("Cercle",color);
       this.rayon = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cercle)) return false;
        Cercle cercle = (Cercle) o;
        return Double.compare(cercle.rayon, rayon) == 0 && cercle.getCouleur() == this.getCouleur();
    }

    @Override
    public int hashCode() {
        return Objects.hash(rayon);
    }

    @Override
    public double perimetre() {
        return this.rayon*2*Math.PI;
    }

    @Override
    public double surface() {
        return this.rayon*this.rayon*Math.PI;
    }
}

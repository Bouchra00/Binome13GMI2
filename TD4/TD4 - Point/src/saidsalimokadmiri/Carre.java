package saidsalimokadmiri;

public class Carre extends Rectangle {


    public Carre(String color, double cote) {
        super("Carré",color,cote,cote);
    }

    @Override
    public double perimetre() {
        return this.getLongueur()*4;
    }

    @Override
    public double surface() {
        return this.getLongueur()*this.getLongueur();
    }
}

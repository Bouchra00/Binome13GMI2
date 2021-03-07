package saidsalimokadmiri;

public class Regime {
    private String nom;
    private double prixKg;

    public Regime(String nom, double prixKg) {
        this.nom = nom;
        this.prixKg = prixKg;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixKg() {
        return prixKg;
    }

    public void setPrixKg(double prixKg) {
        this.prixKg = prixKg;
    }
}

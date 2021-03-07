package saidsalimokadmiri;

public class Canard extends Animal{
    private String couleurPlume;
    public Canard(String nom, int poid, Regime regime, String couleur) {
        super(nom, poid, regime);
        this.couleurPlume = couleur;
    }
    public Canard(String nom, int poid,  String couleur) {
        super(nom, poid);
        this.couleurPlume = couleur;
    }

    public void crier() {
        System.out.println(this.getNom() + " crie... c un canard il a les plumes " + this.getCouleurPlume() + " hein");
    }


    public String getCouleurPlume() {
        return couleurPlume;
    }
}

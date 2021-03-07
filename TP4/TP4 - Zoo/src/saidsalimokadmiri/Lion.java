package saidsalimokadmiri;

public class Lion extends Animal {

    private double vitesse;

    public Lion(String nom, int poid,Regime regime,double vitesse) {
        super(nom, poid, regime);
        this.vitesse = vitesse;

    }
    public Lion(String nom, int poid,double vitesse) {
        super(nom, poid);
        this.vitesse = vitesse;

    }

    public void crier() {
        System.out.println(this.getNom() + " crie... c un lion, il court vite hein");
    }


    public double getVitesse() {
        return vitesse;
    }


}

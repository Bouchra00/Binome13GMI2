package saidsalimokadmiri;

public class Tigre extends Animal{

private double puissMachoire;
    public Tigre(String nom, int poid,Regime regime, double m) {
        super(nom, poid, regime);
        this.puissMachoire = m;
    }
    public Tigre(String nom, int poid, double m) {
        super(nom, poid);
        this.puissMachoire = m;
    }

    public void crier() {
        System.out.println(this.getNom() + " crie... c un tigre, il mort fort hein");
    }

    public double getPuissMachoire() {
        return puissMachoire;
    }


}

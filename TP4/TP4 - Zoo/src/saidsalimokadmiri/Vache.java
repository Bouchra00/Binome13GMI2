package saidsalimokadmiri;

public class Vache extends Animal{

    private int nbTaches;
    public Vache(String nom, int poid, Regime regime, int nbTaches) {
        super(nom, poid, regime);
        this.nbTaches = nbTaches;

    }
    public Vache(String nom, int poid, int nbTaches) {
        super(nom, poid);
        this.nbTaches = nbTaches;

    }
    public void crier() {
        System.out.println(this.getNom() + " crie... c une vache, il a des taches elle hein");
    }

    public int getNbTaches() {
        return nbTaches;
    }
}

package saidsalimokadmiri;

public class Animal {
    private String nom;
    private String prenom;
    private int poid;
    private Regime regime;


    public Animal(String nom, int poid,Regime regime) {
        this.nom = nom;
        this.poid = poid;
        this.regime = regime;
    }
    public Animal(String nom, int poid) { // pour que le param regime ne soit pas obligatoire
        this.nom = nom;
        this.poid = poid;

    }

    public int getPoid() {
        return poid;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nom='" + nom + '\'' +
                ", poid=" + poid +
                '}';
    }

    public void crier() {
        System.out.println("<"+ this.nom +"> crie...");
    }

    public double coutNourritureJour() {
        String x = getClass().getSimpleName();
        switch (x) {
            case "Lion" : double kgNourrLion = this.getPoid()*0.25;return this.regime.getPrixKg()*kgNourrLion;
            case "Tigre" : double kgNourrTigre = this.getPoid()*0.5;return this.regime.getPrixKg()*kgNourrTigre;
            case "Vache": double kgNourrVache = this.getPoid()*0.1;return this.regime.getPrixKg()*kgNourrVache;
            case "Canard": return this.regime.getPrixKg()*1;


        }
        return this.regime.getPrixKg();
    }
}

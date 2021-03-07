package saidsalimokadmiri;

import java.util.LinkedList ;
public class Zoo {

    private String nom;
    private  LinkedList<Animal> animaux;

    public Zoo(String nom) {
        this.nom = nom;
        animaux = new LinkedList<Animal>();
    }

    public int getNbAnimaux() {
        return animaux.size();
    }

    public void ajouterAnimal(Animal a) {
        animaux.add(a);
    }
    public void crier() {
        for(Animal a : this.animaux) {
            a.crier();
        }
    }

    public double coutGlobalNourrJour() {
        double s = 0.0;
        for(Animal a : this.animaux) {
           s += a.coutNourritureJour();
        }
        return s;
    }


    @Override
    public String toString() {
        return "Zoo{" +
                "nom='" + nom + '\'' +
                ", animaux=" + animaux +
                '}';
    }
}

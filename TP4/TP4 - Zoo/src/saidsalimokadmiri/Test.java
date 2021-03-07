package saidsalimokadmiri;

public class Test {

    public static void lunchQ3() {
        Animal a = new Animal("Catherine",200);
        Animal b = new Animal("Julie",150);
        Animal c = new Animal("Sarah",50);
        Animal d = new Animal("Nicolas",50);
        Animal e = new Animal("Benoit",50);
        Animal f = new Animal("Sébastien",50);
        Animal g = new Animal("Sylvain",50);

        Zoo Z = new Zoo("EISTI");
        Z.ajouterAnimal(a);
        Z.ajouterAnimal(b);
        Z.ajouterAnimal(c);
        Z.ajouterAnimal(d);
        Z.ajouterAnimal(e);
        Z.ajouterAnimal(f);
        Z.ajouterAnimal(g);

        Z.crier();
        // Question 2 : L'action de la méthode crier fait crier chacun des animaux stockées dans le zoo (dans l'attribut animaux de la classe zoo)


    }

    public static void lunchQ5() {
        Animal d = new Lion("Nicolas",50,100);
        Animal e = new Tigre("Benoit",50,50);
        Animal f = new Vache("Sébastien",50,5);
        Animal g = new Canard("Sylvain",50,"bleu");

        Zoo Z = new Zoo("EISTI");
        Z.ajouterAnimal(d);
        Z.ajouterAnimal(e);
        Z.ajouterAnimal(f);
        Z.ajouterAnimal(g);
        Z.crier();
    }
}

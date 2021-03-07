package saidsalimokadmiri;

public class Main {

    public static void main(String[] args) {

        // Question 2 : L'action de la méthode crier fait crier chacun des animaux stockées dans le zoo (dans l'attribut animaux de la classe zoo)
// Question 3
        //Test.lunchQ3();
        //Test.lunchQ5();
        // Et on  pas besoin de modifier votre classe Zoo pour que le programme fonctionne
        // Oui, les animaux crient-ils correctement ?
        // Q7
        Animal e = new Tigre("Benoit",50,new Regime("viande",10.5),50);
        System.out.println(e);
        System.out.println(e.coutNourritureJour());
        //
        // Question 10
       //En effet, si l’on ne connaît pas de quelle espèce exacte est l’animal, comment savoir ce qu’il va manger ?
        // Réponse : Chéap
        // De même le zoo a besoin de pouvoir calculer le coût de nourriture d’un animal, mais comment répondre à cette question pour un animal quelconque ?
        // Réponse : créer un attribut qui correspond au "kg mangé par jour"
        // Plus généralement, à votre avis, est-il légitime de pouvoir instancier directement un Animal qui n’est pas, en fait, un canard, un tigre ou une vache ?
        // Oui, on va pas créer des class pour tout les animaux, et puis les classe tigre canard vache on pour seul différence leur carac physique
    }
}

package saidsalimokadmiri;

public class TestAffichageInfixe {

    public static void main () {

        ExpAbstraite expPlus = new BinairePlus(new Variable("y"), new Constante(3));
        System.out.println(expPlus.toStringInfixe());

        ExpAbstraite expMult = new BinaireMult(new BinairePlus(new Variable("x"),new Variable("x")),new Constante(5));;
        System.out.println(expMult.toStringInfixe());

        ExpAbstraite expS=new BinaireMult(new Constante(-3.5),new UnaireSin(new BinairePlus(new Variable("a"),new Variable("b"))));
        System.out.println(expS.toStringInfixe());
        System.out.println(expS) ;
    }
}

package saidsalimokadmiri;

public class TestEval {
    public static void main(){
        Env env=new Env(7);
        env.associer("y", (double) 2);
        env.associer("x", (double) 1);
        env.associer("a", (double) 9);
        env.associer("b", (double) 3);
        System.out.println(env);

        //test expression * y 3
        ExpAbstraite exp = new BinaireMult(new Variable("y"), new Constante(3));
        System.out.println(exp.toStringInfixe());
        System.out.print("Valeur de l'expression, compte tenu des valeurs des variables : ");
        System.out.println(exp.evaluer(env));

        //test expression * + x x 5
        exp=new BinaireMult(new BinairePlus(new Variable("x"),new Variable("x")),new Constante(5));
        System.out.println(exp.toStringInfixe());
        System.out.print("Valeur de l'expression, compte tenu des valeurs des variables : ");
        System.out.println(exp.evaluer(env));

        //test * -3.5 sin + a b
        exp=new BinaireMult(new Constante(-3.5),new UnaireSin(new BinairePlus(new Variable("a"),new Variable("b"))));
        System.out.println(exp.toStringInfixe());
        System.out.print("Valeur de l'expression, compte tenu des valeurs des variables : ");
        System.out.println(exp.evaluer(env));
    }
}

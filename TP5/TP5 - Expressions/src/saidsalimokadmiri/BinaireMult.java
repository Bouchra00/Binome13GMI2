package saidsalimokadmiri;

public class BinaireMult extends ExpBinaire {
    public BinaireMult(ExpAbstraite opGauche, ExpAbstraite opDroit) {
        super(opGauche, opDroit);
    }

    @Override
    public double evaluer(Env env) {
        return this.getOpDroite().evaluer(env)*this.getOpGauche().evaluer(env);
    }

    @Override
    public String toStringInfixe() {
        return "( " + this.getOpGauche().toStringInfixe()+" * "+this.getOpDroite().toStringInfixe() + " )";
    }
}

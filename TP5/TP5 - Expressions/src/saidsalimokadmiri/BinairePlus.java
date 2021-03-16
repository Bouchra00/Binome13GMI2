package saidsalimokadmiri;

public class BinairePlus extends ExpBinaire {

    public BinairePlus(ExpAbstraite opGauche, ExpAbstraite opDroit) {
        super(opGauche, opDroit);
    }

    @Override
    public double evaluer(Env env) {
        return this.getOpDroite().evaluer(env)+this.getOpGauche().evaluer(env);
    }

    @Override
    public String toStringInfixe() {
        return "( " + this.getOpGauche().toStringInfixe()+" + "+this.getOpDroite().toStringInfixe() + " )";
    }
}

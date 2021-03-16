package saidsalimokadmiri;
import java.lang.Math;

public class BinairePuiss extends ExpBinaire  {
    public BinairePuiss(ExpAbstraite opGauche, ExpAbstraite opDroit) {
        super(opGauche, opDroit);
    }

    @Override
    public double evaluer(Env env) {
        return Math.pow(this.getOpGauche().evaluer(env),this.getOpDroite().evaluer(env));
    }

    @Override
    public String toStringInfixe() {
        return "( " + this.getOpGauche().toStringInfixe()+" ^ "+this.getOpDroite().toStringInfixe() + " )";
    }
}

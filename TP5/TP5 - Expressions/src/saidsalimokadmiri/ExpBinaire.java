package saidsalimokadmiri;

public abstract class ExpBinaire extends ExpAbstraite {
    private ExpAbstraite opGauche;
    private ExpAbstraite opDroite;

    public ExpBinaire(ExpAbstraite opGauche, ExpAbstraite opDroite) {
        this.opGauche = opGauche;
        this.opDroite = opDroite;
    }

    public ExpAbstraite getOpGauche() {
        return opGauche;
    }

    public ExpAbstraite getOpDroite() {
        return opDroite;
    }

}

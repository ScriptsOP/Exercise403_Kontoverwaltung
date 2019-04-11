package htl.sulzbacher.exercise403_kontoverwaltung2;

public class Konto {
    private double betrag = 50;

    public Konto(double betrag) {
        this.betrag = betrag;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }
}
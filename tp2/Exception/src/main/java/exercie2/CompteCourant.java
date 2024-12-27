package exercie2;

public class CompteCourant extends CompteBancaire{
    private double decouvert;

    public CompteCourant(int compte, double solde, String nom) {
        super(compte, solde, nom);
        this.decouvert= decouvert;
    }


}

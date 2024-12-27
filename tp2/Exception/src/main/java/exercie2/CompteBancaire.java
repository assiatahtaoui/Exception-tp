package exercie2;

public class CompteBancaire {
    private int compte;
    private double solde;
    private String nom;

    public CompteBancaire(int compte, double solde, String nom) {
        this.compte = compte;
        this.solde = solde;
        this.nom = nom;
    }

    public double getSolde() {
        return solde;
    }

    public String getNom() {
        return nom;
    }

    public int getCompte() {
        return compte;
    }
    public void depot(double montant){
        if (montant>0){
            solde+=montant;
        }
    }
    public void retrait(double montant)throws FondsInsuffisantsException{
        if (montant>0){
            throw new FondsInsuffisantsException("fond insuffisants dans le compte");
        }
        solde-=montant;
    }
    public void afficher(){
        System.out.println("solde est du : " + compte + " " + "est " + solde);
    }
    public void transfert(CompteBancaire compteDestination, double montant)
            throws FondsInsuffisantsException, CompteInexistantException{
            if (compteDestination == null){
                throw new CompteInexistantException("compte de destination n'existe pas");
            }
            this.retrait(montant);
            compteDestination.depot(montant);
        }

    }



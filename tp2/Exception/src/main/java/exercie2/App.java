package exercie2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        try {
            CompteBancaire compt1=new CompteBancaire(123,3000, "jad");
            CompteBancaire compt2=new CompteBancaire(124,5000, "omar");

            ArrayList<CompteBancaire> comptes = new ArrayList<>();
            comptes.add(compt1);
            comptes.add(compt2);

            // affichage
            compt1.afficher();
            compt2.afficher();

            //depot
            compt1.depot(30);
            compt2.depot(1000);
            try {
                compt1.retrait(4000);
            }catch (FondsInsuffisantsException e ){
                System.out.println(e.getMessage());
            }

            try {
                compt1.transfert(null,500);
            }catch (CompteInexistantException e ){
                System.out.println(e.getMessage());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

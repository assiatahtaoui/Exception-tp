package org.example;

public class Test {
    public static void main(String[] args) {
        try {
            // initialiser
            EntierNaturel entier=new EntierNaturel(4);
            System.out.println("valeur inital : "+ entier.getVal());

            // decrementer
            entier.decrementer();
            System.out.println("valeur apres decrementation : " + entier.getVal());

            // modifier
            entier.setVal(6);
            System.out.println("nouvelle valeur " + entier.getVal());

            // test
            entier.setVal(-2);

        }catch (NombreNegatifException e){
            System.out.println(e.getMessage()+ " valeur errone : "+e.getValeurERR());

        }




}
}
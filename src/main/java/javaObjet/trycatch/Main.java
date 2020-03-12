package javaObjet.trycatch;

public class Main {

    public static void main(String[] args) {
        try {
            int i = Calculatrice.factorielle(18);
            System.out.println(i);
        } catch (FactorielleNegativeException | FactorielleDepassementException e) {
            System.out.println("ATTENTION !!!! ERREUR DE LA CALCULATRICE : " + e.getMessage());
        }

        try {
            int i = Calculatrice.factorielle(-18);
            System.out.println(i);
        } catch (FactorielleNegativeException | FactorielleDepassementException e) {
            System.out.println("ATTENTION !!!! ERREUR DE LA CALCULATRICE : " + e.getMessage());
        }

        //Grâce au runtime exception, on pourrait appeller la méthode factorielle en dehors du bloc try/catch
        //Calculatrice.factorielle(18);
    }

}

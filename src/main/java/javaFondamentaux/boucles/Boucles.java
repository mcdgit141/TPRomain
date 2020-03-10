package javaFondamentaux.boucles;

public class Boucles {

    public static void main(String[] args) {

        //boucleInfinie();
        System.out.println(fact(5));
        dessinerRectangle(3,5, 'X');

        int[] tabEntier = {0,1,2,3};
        tabEntier = addToArray(tabEntier, 4);
        for (int i = 0; i < tabEntier.length; i++) {
            System.out.print(tabEntier[i]);
        }
        System.out.println();

        int somme = sommeEntiers(1, 2, 3, 3, 2, 4, 6);
        System.out.println(somme);

    }

    private static int sommeEntiers(int...entiers) {
        int somme = 0;
        for (int i = 0; i < entiers.length; i++) {
            somme += entiers[i];
        }
        return somme;
    }

    private static int[] addToArray(int[] tabEntier, int ajout) {
        int[] result = new int[tabEntier.length+1];
        for (int i = 0; i < tabEntier.length; i++) {
            result[i] = tabEntier[i];
        }
        result[tabEntier.length] = ajout;
        return result;
    }




    private static void dessinerRectangle(int hauteur, int largeur, char charactere) {
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                System.out.print(charactere);
            }
            System.out.println();
        }
    }

    public static void boucleInfinie(){
        while(true){
            System.out.println("Je boucle !");
        }
    }

    public static int fact(int i){
        int result = 1;
        for (int j = 1; j <= i ; j++) {
            result = j * result;
        }
        return result;
    }



}

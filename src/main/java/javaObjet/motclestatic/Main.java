package javaObjet.motclestatic;

public class Main {

    public static void main(String[] args) {
        System.out.println(Centaure.NOMBRE_DE_BRAS);
        System.out.println(Centaure.NOMBRE_DE_PATTES);

        for (int i = 0; i < 20; i++) {
            Centaure c = new Centaure();
        }

        System.out.println(Centaure.getPopulation());

//        ---------------------------

        Dictionnaire d = Dictionnaire.recupererInstance();
        Dictionnaire d2 = Dictionnaire.recupererInstance();
        Dictionnaire d3 = Dictionnaire.recupererInstance();

        System.out.println(d.getTitre());
        System.out.println(d2);
        System.out.println(d3);

//        Dictionnaire opoei = new Dictionnaire("zeazeazeae");

    }

}

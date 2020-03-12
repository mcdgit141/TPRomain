package javaObjet.motclestatic;

public class Centaure {

    public static final int NOMBRE_DE_PATTES = 4;
    public static final int NOMBRE_DE_BRAS = 2;

    private static int population = 0;

    public Centaure(){
        incrementerPopulation();
    }

    private void incrementerPopulation() {
        population++;
    }

    public static int getPopulation(){
        return population;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        population --;
//        super.finalize();
//    }
}

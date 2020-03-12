package javaObjet.trycatch;

public class FactorielleException extends RuntimeException {

    private static int NOMBRE_DE_FOIS_PLANTE = 0;

    public FactorielleException(String message) {
        super(message);
        NOMBRE_DE_FOIS_PLANTE ++;
    }
}

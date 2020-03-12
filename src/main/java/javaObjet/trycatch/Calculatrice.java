package javaObjet.trycatch;

public class Calculatrice {

    public static int factorielle(int max) /*throws FactorielleDepassementException, FactorielleNegativeException*/{
        if (max<0) {
            throw new FactorielleNegativeException("Nombre négatif");
        }

        int result = 1;

        for (int i = 1; i <= max; i++) {
            int temp = result;
            result *= i;
            if(temp != result/i){
                throw new FactorielleDepassementException("Vous avez dépassé l'entier maximal !");
            }
        }
        return result;
    }

}

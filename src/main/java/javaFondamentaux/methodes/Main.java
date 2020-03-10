package javaFondamentaux.methodes;

public class Main {

    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("Addition de A et B = "+additionner(a,b));
        System.out.println("Partie entière de A et B = "+retournerPartieEntiere(a,b));

    }

    public static int additionner(int a, int b){
        return a+b;
    }

    public static int retournerPartieEntiere(int a, int b){
        int modulo = a%b;
        System.out.println((a - modulo) / b);

        int partieEntiere = a/b;
        System.out.println(partieEntiere);
        return partieEntiere;

    }
}

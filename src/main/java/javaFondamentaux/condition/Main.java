package javaFondamentaux.condition;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        diviser(a,b);
    }

    private static int diviser(int a, int b) {
        if(b == 0){
            System.out.println("DIVISION PAR ZERO !!");
            return 0;
        }
        return a/b;
    }
}

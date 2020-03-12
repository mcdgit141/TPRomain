package javaObjet.trycatch;

public class TestMainRollback {
    public static void main(String[] args) {
        int i = 0;
        try{
            i = 20;
            i = i/0;
            i=30;
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println();
    }
}

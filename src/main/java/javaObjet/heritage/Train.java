package javaObjet.heritage;

public class Train extends Vehicule {

    Train() {
        super(100);
    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        System.out.println("Tchoo tchoo !");
    }


}

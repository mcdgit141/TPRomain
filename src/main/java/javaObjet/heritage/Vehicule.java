package javaObjet.heritage;

public class Vehicule {

    int nombreRoues;

    public Vehicule(int nombreRoues) {
        this.nombreRoues = nombreRoues;
    }

    public void direBonjour() {
        System.out.println("Bonjour, je suis un véhicule à "+nombreRoues+" roues !");
    }

    @Override
    public String toString() {
        return super.toString()+" Bonjour, je suis un véhicule à "+ nombreRoues+ " en passant par le toString()";
    }
}

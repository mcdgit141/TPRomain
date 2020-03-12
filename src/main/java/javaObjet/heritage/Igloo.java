package javaObjet.heritage;

public class Igloo extends Batiment implements TrucQueJePeuxChauffer{

    int nombreDeblocs;

    public Igloo(int nombreDeblocs) {
        this.nombreDeblocs = nombreDeblocs;
    }

    void ilFaitFroid(){
        System.out.println("aglagla !");
    }

    public void chauffer(){
        System.out.println("Je chauffe mon Igloo");
        super.temperature++;
    }

    @Override
    public int getTemperature() {
        return temperature;
    }
}

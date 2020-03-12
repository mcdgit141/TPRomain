package javaObjet.heritage;

public class Maison extends Batiment implements TrucQueJePeuxChauffer, TrucQueJePeuxRefroidir{

//    Maison() {
//        super(10);
//    }

    int temperature;

    @Override
    public void chauffer() {
        System.out.println("Je chauffe ma maison");
        temperature++;
    }

    @Override
    public void refroidir() {
        System.out.println("Je refroidis ma maison");
        temperature++;
    }

    @Override
    public int getTemperature() {
        return temperature;
    }
}

package javaObjet.heritage;

public class Datacenter extends Batiment implements TrucQueJePeuxRefroidir {

    @Override
    public void refroidir() {
        temperature = 20;
    }

    @Override
    public int getTemperature() {
        return temperature;
    }
}

package javaObjet.heritage;

import java.util.ArrayList;

public class MainInterface {


    public static void main(String[] args) {
        Maison maison = new Maison();
        maison.chauffer();
        Igloo igloo = new Igloo(500);
        Datacenter dc = new Datacenter();

        TrucQueJePeuxChauffer[] tab = new TrucQueJePeuxChauffer[10];
        tab[0] = igloo;
        tab[1] = maison;
//        tab[2] = dc;

        TrucQueJePeuxChauffer trucQueJePeuxChauffer = tab[0];

        TrucQueJePeuxChauffer truc = igloo;
        TrucQueJePeuxChauffer truc2 = new Igloo(40);











    }




}

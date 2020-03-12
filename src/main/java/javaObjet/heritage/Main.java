package javaObjet.heritage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vehicule v = new Vehicule(2);
        Vehicule v2 = new Vehicule(2);
        v.direBonjour();
        System.out.println(v);
        System.out.println(v.toString());

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("azepoazepoazi");
        arrayList.add("azepoazepoazi");
        arrayList.add("azepoazepoazi");
        arrayList.add("azepoazepoazi");
        System.out.println(arrayList);

//        Velo velo = new Velo();
//        velo.direBonjour();
//        Train train = new Train();
//        train.direBonjour();
//
//        System.out.println(v.hashCode());
//        System.out.println(velo.hashCode());
//        System.out.println(v.equals(v2));
//        System.out.println(v == v2);
    }
}

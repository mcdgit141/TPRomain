package javaApi.collections;

import java.nio.file.Files;
import java.util.*;

public class Main {

    public static void main(String[] arguments) {
        //1
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Riri");
        arrayList.add("Fifi");
        arrayList.add("Loulou");

        //2
        afficherListe(arrayList);

        //3
        Collections.sort(arrayList);
        System.out.println(arrayList);

        //4
        TreeSet<String> set = new TreeSet<>(new CustomComparator());
        set.add("Tutuuuuuuuuu");
        set.add("Tata");
        set.add("Titiiiiii");
        System.out.println(set);

        //5
        ArrayList<ArrayList<String>> arrayList2 = new ArrayList<>();

    }

    private static void afficherListe(ArrayList<String> arrayList) {
        System.out.println(arrayList);
        for (String neveu : arrayList) {
            System.out.println(neveu);
        }
    }

}

package javaApi;

public class Main {
    public static void main(String[] args) {
        System.out.println(Jour.JEUDI.getHumeur());
        System.out.println(Jour.JEUDI.isWeekend());
        System.out.println(Jour.SAMEDI.getHumeur());
        System.out.println(Jour.SAMEDI.isWeekend());

        Jour[] semaine = Jour.values();
        for (int i = 0; i < semaine.length; i++) {
            System.out.print(semaine[i].name());
            System.out.print(semaine[i].getHumeur());
            System.out.println(semaine[i].isWeekend());
        }

        int ordinalLundi = Jour.LUNDI.ordinal();
        int ordinalJeudi = Jour.JEUDI.ordinal();

        if ((ordinalLundi<ordinalJeudi)) {
            System.out.println("Lundi est avant jeudi");
        }

        int i = Jour.LUNDI.compareTo(Jour.JEUDI);
        if (i<0) {
            System.out.println("Lundi est avant jeudi");
        }

    }
}

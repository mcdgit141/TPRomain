package javaFondamentaux.typesPrimitfs;

class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World !");

        int a = 21;
        System.out.println("Affectation de a = "+a);
        int a2 = 15;
        System.out.println("Affectation de a2 = "+a2);
        int a3 = 13;
        System.out.println("Affectation de a3 = "+a2);
        int b = 21;
        System.out.println("Affectation de b = "+b);

        //Echange des variables a et b
        System.out.println("-------------------------------");
        System.out.println("Valeur de a avant échange = "+a);
        System.out.println("Valeur de b avant échange = "+b);
        int tmp = 0;
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("Valeur de a après échange = "+a);
        System.out.println("Valeur de b après échange = "+b);
        System.out.println("-------------------------------");

        System.out.println("-------------------------------");
        System.out.println("Valeur de a = "+a);
        System.out.println("Valeur de b = "+b);
        int modulo = a%b;
        System.out.println("Valeur de la partie entière = " + (a - modulo) / b);
        int partieEntiere = a/b; //Fonctionne aussi si on met la veleur de la division dans un entier
        System.out.println("-------------------------------");

        System.out.println("------------Exercice tableau-------------------");
        String[] tableauDeString = new String[3];
        tableauDeString[0] = "zero";
        tableauDeString[1] = "un";
        tableauDeString[2] = "deux";
        System.out.println(tableauDeString[0]+" "+tableauDeString[1]+" "+tableauDeString[2]);
        String[] tableauDeString2 = {"zero", "un", "deux"}; //Fonctionne aussi de cette manière
        System.out.println(tableauDeString2[0]+" "+tableauDeString2[1]+" "+tableauDeString2[2]);
        System.out.println("-----------------------------------------------");

        System.out.println("-----------------Création d'un tableau à 3 dimensions-------------------------");
        //int[][][] tabbleau3Diemntions2 = {{{0,1}, {0,1}}}; //Fonctionne aussi de cette manière, mais c'est moins élégant
        int[][][] tabbleau3Diemntions = new int[2][2][2];
        tabbleau3Diemntions[0][0][0] = 0;
        tabbleau3Diemntions[0][0][1] = 1;
        tabbleau3Diemntions[0][1][0] = 10;
        tabbleau3Diemntions[0][1][1] = 11;
        tabbleau3Diemntions[1][0][0] = 100;
        tabbleau3Diemntions[1][0][1] = 101;
        tabbleau3Diemntions[1][1][0] = 110;
        tabbleau3Diemntions[1][1][1] = 111;

        //Pour accéder aux cases
        System.out.println("Affichage de certaines cases du tableau à 3 dimension :");
        System.out.println(tabbleau3Diemntions[0][0][0]);
        System.out.println(tabbleau3Diemntions[0][1][0]);
        System.out.println(tabbleau3Diemntions[1][1][0]);
        System.out.println("-----------------------------------------------");
    }

}

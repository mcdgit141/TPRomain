package javaObjet.motclestatic;

public class Dictionnaire {

    private String titre;

    private static Dictionnaire seuleInstance;

    private Dictionnaire(String titre){
        this.titre = titre;
    }

    public static Dictionnaire recupererInstance(){
        if(seuleInstance==null){
            seuleInstance = new Dictionnaire("Larousse");
        }
        return seuleInstance;
    }

    public String getTitre(){
        return titre;
    }

}

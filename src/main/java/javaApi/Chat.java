package javaApi;

import java.util.Objects;

public class Chat {

    private String nom = "Felix";
    private String prenom;
    private String couleur;
    private int taille;

    public Chat(){}

    public Chat(String nom, String prenom, String couleur, int taille) {
        this.nom = nom;
        this.prenom = prenom;
        this.couleur = couleur;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getTaille() {
        return taille;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, couleur, taille);
//        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return ((Chat) obj).getNom().equals(this.getNom());
    }
}

package javaApi;

public enum Jour {
    LUNDI(false, ":-("),
    MARDI(false, ":-|"),
    MERCREDI(false, ":-|"),
    JEUDI(false, ":-/"),
    VENDREDI(false, ":-)"),
    SAMEDI(true, ":-D"),
    DIMANCHE(true, ":-D");

    private boolean isWeekend;
    private String humeur;

    Jour(boolean isWeekend, String humeur) {
        this.isWeekend = isWeekend;
        this.humeur = humeur;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public String getHumeur() {
        return humeur;
    }
}

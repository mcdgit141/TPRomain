package javaObjet.conceptClasse;

class Enfant {

    String nom;
    String prenom;
    int age = 0;
    Enfant amoureux;

    Enfant(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    void sePresenter(){
        System.out.println("Bonjour, je m'appelle "+this.prenom+" "+this.nom+" et j'ai "+age+"an(s)");
    }

    void feterAnniversaire(){
        if(age < 17) {
            this.age++;
        }
    }

    String getPrenom(){
        return this.prenom;
    }

    void joueAuBallonAvec(Enfant ami) {
        System.out.println(this.prenom + " joue au ballon avec " + ami.getPrenom());
    }

    void tombeAmoureux(Enfant autreEnfant) {
        this.amoureux = autreEnfant;
    }


    public boolean estAmoueux() {
        if(this.amoureux != null){
            return true;
        }
        return false;
    }
}

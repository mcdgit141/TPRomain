package javaObjet.conceptClasse;

public class MainEnfant {

    public static void main(String[] args) {
        Enfant olivier = new Enfant("Olivier", "DUPONT");
        Enfant charlotte = new Enfant("Charlotte", "DUPOND");
        for (int i = 0; i < 5; i++) {
            olivier.feterAnniversaire();
        }
        charlotte.feterAnniversaire();
        charlotte.feterAnniversaire();
        charlotte.feterAnniversaire();
        charlotte.feterAnniversaire();
        charlotte.feterAnniversaire();
        charlotte.feterAnniversaire();
        charlotte.feterAnniversaire();

        olivier.sePresenter();
        charlotte.sePresenter();

        olivier.joueAuBallonAvec(charlotte);

        olivier.tombeAmoureux(charlotte);

        System.out.println(olivier.estAmoueux());
        System.out.println(charlotte.estAmoueux());

    }
}

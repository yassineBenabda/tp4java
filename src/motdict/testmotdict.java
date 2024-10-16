package motdict;

public class testmotdict {
	
    public static void main(String[] args) {

        dict d1 = new dict("DICTIONAIRE", 5);

        d1.Ajouter_Mot(new motdict("pomme", "a fruit"));
        d1.Ajouter_Mot(new motdict("banana", "a fruit"));
        d1.Ajouter_Mot(new motdict("cat", "an animal"));

        d1.Lister_dictionnaire();

        System.out.println(d1.Recherche_dicho("banana"));

        d1.Supprimer_Mot(new motdict("pomme", ""));

        d1.Lister_dictionnaire();
    }
}
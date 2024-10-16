package motdict;

public class dict {
	
	motdict[] dict;
	private String nom;
    private int nb_mots;

    public dict(String nom, int taille) {
        dict = new motdict[taille]; 
    	this.nom = nom;
        this.nb_mots = 0;
    }

    public void Ajouter_Mot(motdict mot) {
        if (nb_mots < dict.length) {
            dict[nb_mots] = mot;
            nb_mots++;
            Trier();
        } else {
            System.out.println("dict est plein");
        }
    }

    public void Trier() {
        for (int i = 0; i < nb_mots - 1; i++) {
            for (int j = 0; j < nb_mots - i - 1; j++) {
                if (dict[j].getMot().compareTo(dict[j + 1].getMot()) > 0) {
                    motdict temp = dict[j];
                    dict[j] = dict[j + 1];
                    dict[j + 1] = temp;
                }
            }
        }
    }

    public void Supprimer_Mot(motdict mot) {
        boolean found = false;
        for (int i = 0; i < nb_mots; i++) {
            if (dict[i].getMot().equals(mot.getMot())) {
                for (int j = i; j < nb_mots - 1; j++) {
                    dict[j] = dict[j + 1];
                }
                dict[nb_mots - 1] = null; 
                nb_mots--;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("mot n'est pas dans le dict");
        }
    }

    public String Recherche_dicho(String mot) {
        for (int i = 0; i < nb_mots; i++) {
            if (dict[i].getMot().equals(mot)) {
                return dict[i].getDefinition();
            }
        }
        return "mot non trouve";
    }

    public void Lister_dictionnaire() {
        if (nb_mots == 0) {
            System.out.println("dict est vide");
        } else {
            for (int i = 0; i < nb_mots; i++) {
                System.out.println("mot: " + dict[i].getMot() + ", definition: " + dict[i].getDefinition());
            }
        }
    }

    public int Nombre_synonyme(motdict mot) {
        int count = 0;
        for (int i = 0; i < nb_mots; i++) {
            if (dict[i].synonyme(mot.getMot())) {
                count++;
            }
        }
        return count;
    }

    public int getNb_mots() {
        return nb_mots;
    }
}

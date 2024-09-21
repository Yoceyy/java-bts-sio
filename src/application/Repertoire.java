package application;

import java.util.ArrayList;
import java.util.Collections;

public class Repertoire {
    private ArrayList<Personne> personnes;

    // Constructeur
    public Repertoire() {
        personnes = new ArrayList<>();
    } 

    // Méthode pour ajouter une personne au répertoire
    public void ajoutePersonne(Personne personne) {
        personnes.add(personne);         // Ajoute la personne à la liste
        Collections.sort(personnes);     // Trie la liste après l'ajout
    }

    // Méthode pour afficher le répertoire
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Personne personne : personnes) {
            result.append(personne.toString()).append("\n");
        }
        return result.toString();
    }
}

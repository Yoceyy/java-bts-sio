package application;

import javafx.fxml.FXML;

public class Personne implements Comparable<Personne> {
	
	@FXML
    public String nom;
	@FXML
    public String prenom;
	@FXML
    public Adresse adresse;
	@FXML
    public String telephone;

    // Constructeur avec nom et prénom
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = new Adresse();  // Initialise avec une adresse vide par défaut
        this.telephone = "";
    }
   
    // Constructeur avec tous les attributs
    public Personne(String nom, String prenom, Adresse adresse, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    // Accesseurs (getters)
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    // Modificateurs (setters)
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    // Méthode affiche : affichage des coordonnées de la personne
    public void affiche() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Téléphone: " + telephone);
        System.out.print("Adresse: ");
        adresse.affiche();
    }

    // Méthode toString : retour des coordonnées sous forme de chaîne
    @Override
    public String toString() {
        return nom + "; " + prenom + "; " + telephone + "; " + adresse.toString();
    }

    // Implémentation de la méthode compareTo de l'interface Comparable
    @Override
    public int compareTo(Personne autre) {
        // Comparaison des noms
        int resultat = this.nom.compareTo(autre.nom);
        
        // Si les noms sont identiques, comparer les prénoms
        if (resultat == 0) {
            resultat = this.prenom.compareTo(autre.prenom);
        }
        
        return resultat;
    }
}

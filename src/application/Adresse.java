package application;

public class Adresse {
	
	
	//Attribut Adressse
	
	private String rue;
	private String codePostal;
	private String ville;
	
	
    // Constructeur sans attribut
    public Adresse() {
        this.rue = "";
        this.codePostal = "";
        this.ville = "";
    }
	

  // Constructeur avec tout les attribut
	
	public Adresse(String rue, String codePostal, String ville) {
		this.rue=rue;
		this.codePostal=codePostal;
		this.ville=ville;
	}
	
	
	// Accesseurs
    public String getRue() {
        return rue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }
    
    
 // Modificateurs
    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    
    
    // Méthode d'affichage
    public void affiche() {
        System.out.println("Rue : " + rue);
        System.out.println("Code postal : " + codePostal);
        System.out.println("Ville : " + ville);
    }

    // Méthode de conversion en chaîne de caractères
    @Override
    public String toString() {
        return rue + ", " + codePostal + ", " + ville;
    }
    
    
    



    
}
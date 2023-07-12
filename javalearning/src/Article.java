// Créer une classe représentant un article d’un magasin de vente par en ligne.
// Un article est caractérisé par sa référence, sa désignation, son prix.
// Créer ensuite une méthode main permettant de tester le bon fonctionnement de la classe précédente.

// Création de ma classe
public class Article{
    private String ref;
    private String designation;
    private double price;

    // Mon constructeur
    public Article(String ref, String designation, double price) {
        this.ref = ref;
        this.designation = designation;
        this.price = price;
    }

    // Création de mes getters et mes setters
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
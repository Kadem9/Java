// Créer une classe représentant un client d’un magasin de vente par en ligne.
// Un client est caractérisé par son nom, son prénom, son adresse, son code postal et sa ville.
// Créer ensuite une méthode main permettant de tester le bon fonctionnement de la classe précédente.

public class ClientMarket {

    private String lastname;
    private String firstname;
    private String address;
    private Integer postal;
    private String city;

    public ClientMarket(String lastname, String firstname, String address, Integer postal, String city){
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.postal = postal;
        this.city = city;
    }

    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPostal() {
        return postal;
    }

    public void setPostal(Integer postal) {
        this.postal = postal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}

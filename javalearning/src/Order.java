//Créer une classe représentant une commande d’un magasin de vente par en ligne.
//Une commande est caractérisée par son numéro, sa date, le client qui passe la commande,
// le tableau des articles commandés et le tableau des quantités commandées pour chaque article.
// Créer ensuite une méthode main permettant de tester le bon fonctionnement de la classe précédente.

import java.lang.reflect.Array;
import java.util.Date;

public class Order {

    private Integer number;
    private Date date;
    private ClientMarket client;
    // Tableau d'objets de type Article.
    private Article[] articles;
    private Integer[] quantity;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ClientMarket getClient() {
        return client;
    }

    public void setClient(ClientMarket client) {
        this.client = client;
    }

    public Article[] getArticles() {
        return articles;
    }

    public void setArticles(Article[] articles) {
        this.articles = articles;
    }

    public Integer[] getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer[] quantity) {
        this.quantity = quantity;
    }

    public Order(Integer number, Date date, ClientMarket client, Article[] articles, Integer[] quantity){
        this.number = number;
        this.date = date;
        this.client = client;
        this.articles = articles;
        this.quantity = quantity;
    }
}

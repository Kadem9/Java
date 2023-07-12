import java.util.Date;

public class Main {

    public static void main(String[] args){

        Article article1 = new Article("RFE-89", "Jersey PSG", 59.99);
        ClientMarket client1 = new ClientMarket("Garnier", "Kadem", "5 Rue du Cours", 69007, "Lyon");

        Article[] arrayArticles = {article1};
        Integer[] quantity = {6};

        Order order1 = new Order(93150, new Date(), client1, arrayArticles, quantity);

        //printArticle(article1);
        //printClient(client1);
        printOrder(order1);
    }

    public static void printArticle(Article art) {
        System.out.println("Article : " + art.getRef() + " - " + art.getDesignation() + " - " + art.getPrice() + "€");
    }

    public static void printClient(ClientMarket client) {
        System.out.println("The first client is : " + client.getFirstname() + " " + client.getLastname());
        System.out.println("He lives at " + client.getAddress() + " " + client.getCity() + " " + client.getPostal());
    }

    public static void printOrder(Order order){
        System.out.println("Order number : " + order.getNumber() + " passed on " + order.getDate() + " by " + order.getClient().getFirstname());

        for (int i = 0; i < order.getArticles().length ; i++){
            Article article = order.getArticles()[i];
            int quantite = order.getQuantity()[i];
            System.out.println("- " + article.getDesignation() + " (Quantity : " + quantite + ")");
        }

    }

}


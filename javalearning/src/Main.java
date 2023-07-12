public class Main {

    public static void main(String[] args){

        Article article1 = new Article("RFE-89", "Jersey PSG", 59.99);
        ClientMarket client1 = new ClientMarket("Garnier", "Kadem", "5 Rue du Cours", 69007, "Lyon");

        printArticle(article1);
        printClient(client1);
    }

    public static void printArticle(Article art) {
        System.out.println("Article : " + art.getRef() + " - " + art.getDesignation() + " - " + art.getPrice() + "€");
    }
    public static void printClient(ClientMarket client) {
        System.out.println("Le client 1 est : " + client.getFirstname() + " " + client.getLastname());
        System.out.println("Il habite au " + client.getAddress() + " " + client.getCity() + " " + client.getPostal());
    }
}


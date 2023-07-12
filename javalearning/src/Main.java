public class Main {

    public static void main(String[] args){

        Article article1 = new Article("RFE-89", "Jersey PSG", 59.99);


        printArticle(article1);
    }

    public static void printArticle(Article art) {
        System.out.println("Article : " + art.getRef() + " - " + art.getDesignation() + " - " + art.getPrice() + "€");
    }
}


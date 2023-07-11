public class Main {
    public static void main(String[] args) {
        String[] emails = new String[10];
        // je déclare un tableau de string qui peut contenir 10 elements

        emails[0] = "jpp@sfr.fr";
        emails[1] = "tom@gmail.com";
        emails[2] = "fred@sfr.fr";
        emails[3] = "victor@sfr.fr";
        emails[4] = "chris@sfr.fr";
        emails[5] = "robert@orange.fr";
        emails[6] = "paul@sfr.fr";
        emails[7] = "lise@gmail.com";
        emails[8] = "thierry@isitech.fr";
        emails[9] = "marie@isitech.fr";

        // je remplie mon tableau emails et j'adresse chaque mail à un index


        int compteurGmail = 0;
        // je declare et j'intialise mon compteur de gmail
        int totalEmails = emails.length;
        // je declare et j'intiialise mon total d'adresse mail avec length
        //System.out.println(totalEmails);
        for (String email : emails) {
            // boucle for qui itère tous les élements du tableau puis avec la methode endsWith on verifie les mails qui finissent pas "gmail.com" pour augmenter mon compteur
            if (email.endsWith("@gmail.com")) {
                compteurGmail++;
                //System.out.println(compteurGmail);
            }
            // DOCS : public boolean endsWith(String suffix)
            //Tests if this string ends with the specified suffix.
            //Parameters:
            //suffix - the suffix.
            //Returns:
            //true if the character sequence represented by the argument is a suffix of the character sequence represented by this object; false otherwise. Note that the result will be true if the argument is the empty string or is equal to this String object as determined by the equals(Object) method.
        }
        double percentage = (double) compteurGmail / totalEmails * 100;
    // ensuite je calcule le pourcentage avec un double pour avoir un résultat décimal.
        System.out.println("Pourcentage de fournisseurs Gmail : " + percentage + "%");
        // j'affiche le résultat du pourcentage de fournisseurs

    }

    public static double calculEmailPercentage(String[] emails){
        int compteurGmail = 0;

        int totalEmails = emails.length;

        for(String email: emails) {
            if(email.endsWith("@gmail.com")) {
                compteurGmail++;
            }
        }

        double percentage = (double) compteurGmail / totalEmails * 100;
        return percentage;
        }
    }


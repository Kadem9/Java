public class ExerciseFirstDay {


    public static void main(String[] args){
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

        double percentage = calculEmailPercentage(emails);
        System.out.println("Pourcentage de fournisseurs de gmail : " + percentage + "%");
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


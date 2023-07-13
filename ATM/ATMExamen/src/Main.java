import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Je genère mon chiffre aléatoire pour l'id
        Random numberId = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello ! Welcome to Maze Bank");
        System.out.println("Please, entry your informations");

        System.out.println("Firstname : ");
        String firstname = scanner.nextLine();

        System.out.println("Lastname : ");
        String lastname = scanner.nextLine();

        System.out.println("Address : ");
        String address = scanner.nextLine();

        System.out.println("Your postal code : ");
        Integer postal = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Your city : ");
        String city = scanner.nextLine();

        Integer id = numberId.nextInt(200000);

        Client clientBank = new Client(id,firstname, lastname, address, postal, city);
        Database db = new Database();
        db.addUserOnDatabase(clientBank);

        AccountBank clientAccountBank = new AccountBank(clientBank, 0.0);

        System.out.println("Hello " + clientBank.firsname + ", you are connected in your account !");

        Integer choice;
        do {
            System.out.println("What do you want to do?");
            System.out.println("1. View my balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View all operations");
            System.out.println("5. Edit my information");
            System.out.println("6. Exit");
            System.out.println("Your choice: ");
            choice = scanner.nextInt();

            whatDoYouWant(choice, clientAccountBank, clientBank);

        } while (choice != 6);


    }

    public static String whatDoYouWant(Integer choice, AccountBank clientAccount, Client client){
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();

        switch (choice){
            case 1:
                System.out.println("");
                System.out.println("You want view your balance");
                clientAccount.viewBalance();

                Operation operation1 = new Operation(new Date(), clientAccount.getClient(), "Consult sold", clientAccount.getBalance());
                Operation.addOperation(operation1);
                database.addOperationOnDatabase(operation1);
                break;
            case 2:
                System.out.println("");
                System.out.println("You want deposit money");
                clientAccount.depositMoney(clientAccount);

                Operation operation2 = new Operation(new Date(), clientAccount.getClient(), "Deposit Money", clientAccount.getBalance());
                Operation.addOperation(operation2);
                database.addOperationOnDatabase(operation2);
                break;
            case 3:
                System.out.println("");
                System.out.println("You want draw money");
                clientAccount.drawMoney(clientAccount);

                Operation operation3 = new Operation(new Date(), clientAccount.getClient(), "WithDraw money", clientAccount.getBalance());
                Operation.addOperation(operation3);
                database.addOperationOnDatabase(operation3);
                break;
            case 4:
                System.out.println("");
                System.out.println("You want view your operations");
                System.out.println("Your operations :");

                List<Operation>operations = Operation.getAllOperations();
                for (Operation operation: operations) {
                    System.out.println("Operation : " + operation.typeOperation + " on " + operation.date.getDate());
                    System.out.println("");
                }
                break;
            case 5:
                System.out.println("");
                System.out.println("You want to edit your account information");
                client.editClientInformation(client);
                break;
            case 6:
                System.out.println("Exit");
                break;
            default:
                System.out.println("");
                System.out.println("Your choice is incorrect, please try again.");
                break;
        }
        return "";
    }
}
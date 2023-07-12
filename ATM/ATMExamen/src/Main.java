import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
        //scanner.nextLine();

        System.out.println("Your city : ");
        String city = scanner.nextLine();

        Client clientBank = new Client(firstname, lastname, address, postal, city);

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

            whatDoYouWant(choice, clientAccountBank);

        } while (choice != 6);


    }

    public static String whatDoYouWant(Integer choice, AccountBank clientAccount){
        Scanner scanner = new Scanner(System.in);

        switch (choice){
            case 1:
                System.out.println("");
                System.out.println("You want view your balance");
                clientAccount.viewBalance();

                Operation operation1 = new Operation(new Date(), clientAccount.getClient(), "Consult sold", clientAccount.getBalance());
                Operation.addOperation(operation1);
                break;
            case 2:
                System.out.println("");
                System.out.println("You want deposit money");
                clientAccount.depositMoney(clientAccount);

                Operation operation2 = new Operation(new Date(), clientAccount.getClient(), "Deposit Money", clientAccount.getBalance());
                Operation.addOperation(operation2);
                break;
            case 3:
                System.out.println("");
                System.out.println("You want draw money");
                System.out.println("How money you want to withdraw ?");
                clientAccount.drawMoney(clientAccount);

                Operation operation3 = new Operation(new Date(), clientAccount.getClient(), "WithDraw money", clientAccount.getBalance());
                Operation.addOperation(operation3);
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
                System.out.println("You want edit your information account");
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
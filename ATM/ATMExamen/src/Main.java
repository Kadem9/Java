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

        System.out.println("What do you want to do ?");
        System.out.println("1. View my balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. With Draw Money");
        System.out.println("4. View all operations");
        System.out.println("5. Edit my information");
        System.out.println("Your choices : ");
        Integer choice = scanner.nextInt();

        whatDoYouWant(choice, clientAccountBank);

    }

    public static String whatDoYouWant(Integer choice, AccountBank clientAccount){
        Scanner scanner = new Scanner(System.in);

        switch (choice){
            case 1:
                System.out.println("You want view your balance");
                System.out.println("Your sold is " + clientAccount.balance);
                break;
            case 2:
                System.out.println("You want deposit money");
                System.out.println("How much money do you want to deposit? : ");
                Double moneyDeposit = scanner.nextDouble();
                clientAccount.setBalance(clientAccount.getBalance() + moneyDeposit);
                System.out.println("Your balance is now " + clientAccount.balance);
                break;
            case 3:
                System.out.println("You want draw money");
                System.out.println("How money you want to withdraw ?");
                Double moneyWithDraw = scanner.nextDouble();
                clientAccount.setBalance(clientAccount.balance - moneyWithDraw);
                System.out.println("Your balance is now " + clientAccount.balance);
                break;
            case 4:
                System.out.println("You want view your operations");
                break;
            case 5:
                System.out.println("You want edit your information account");
                break;
            default:
                System.out.println("Your choice is incorrect");
                break;
        }
        return "";
    }
}
import java.util.Scanner;

public class AccountBank {

    Client client;
    Double balance = 0.0;

    public AccountBank(Client client, Double balance){
        this.client = client;
        this.balance = balance;

    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void viewBalance(){
        if(balance == 0){
            System.out.println("You have no money.. Back to work!");
            System.out.println("The account balance is : " + balance);
            System.out.println("");
        } else if (balance < 0) {
            System.out.println("WARNING : You are in negative !");
            System.out.println("The account balance is : " + balance);
            System.out.println("");
        } else {
            System.out.println("The account balance is : " + balance);
            System.out.println("");
        }
    }

    public void depositMoney(AccountBank accountBank){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much money do you want to deposit? : ");
        Double moneyDeposit = scanner.nextDouble();

        if(moneyDeposit <= 0){
            System.out.println("");
            System.out.println("It is not possible to deduct or give zero euros, please try again.");
            System.out.println("How much money do you want to deposit? : ");
           moneyDeposit = scanner.nextDouble();
        }

        setBalance(balance + moneyDeposit);
        System.out.println("Yeaah, it's good ! Your account balance is : " + balance);
        System.out.println("");


    }

    public void drawMoney(AccountBank accountBank){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How money you want to withdraw ?");
        Double moneyWithDraw = scanner.nextDouble();

        setBalance(balance - moneyWithDraw);

        System.out.println("Your balance is now " + balance + " $");
        System.out.println("");
    }

}

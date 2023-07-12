public class AccountBank {

    Client client;
    Double balance = 0.0;
    Operation[] operations;

    public AccountBank(Client client, Double balance, Operation[] operations){
        this.client = client;
        this.balance = balance;
        this.operations = operations;
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

    public Operation[] getOperations() {
        return operations;
    }

    public void setOperations(Operation[] operations) {
        this.operations = operations;
    }
}

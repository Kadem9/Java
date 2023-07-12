import java.util.Date;

public class Operation {
    Date date;
    Client client;
    String typeOperation;
    double money;

    public Operation(Date date, Client client, String typeOperation, double money){
        this.date = date;
        this.client = client;
        this.typeOperation = typeOperation;
        this.money = money;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}

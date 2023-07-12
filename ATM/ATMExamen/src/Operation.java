import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Operation {
    Date date;
    Client client;
    String typeOperation;
    double money;
    // lien doc : https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html
    // lien qui m'a aidé : https://www.data-transitionnumerique.com/arraylist-java/
    private static List<Operation> operations = new ArrayList<>();

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

    public static List<Operation> getAllOperations(){
        return operations;
    }

    public static void addOperation(Operation operation){
        operations.add(operation);
    }

}

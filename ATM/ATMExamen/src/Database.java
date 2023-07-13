import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    // Vidéo qui m'a aidé : https://www.youtube.com/watch?v=AHFBPxWebFQ&ab_channel=CodeWithArjun

    String url = "jdbc:mysql://localhost:3306/mazebank";
    String username = "root";
    String password = "root";

    public void main(String [] args){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM client");

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + "" + resultSet.getString(2) + resultSet.getInt(3));
            }
            connection.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    // Methode pour enregistrer mes users
    public void addUserOnDatabase(Client client) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String insertQuery = "INSERT INTO client (id, firstname, lastname, address, postal, city) VALUES ('" +
                    client.id + "', '" +
                    client.firsname + "', '" +
                    client.lastname + "', '" +
                    client.address + "', " +
                    client.postal + ", '" +
                    client.city + "')";


            statement.executeUpdate(insertQuery);

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Methode pour ajouter mes opérations en db

    public void addOperationOnDatabase(Operation operation) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String insertQuery = "INSERT INTO operations (id, type, client) VALUES ('" +
                    operation.id + "', '" +
                    operation.typeOperation + "', '" +
                    operation.client.id + "')";

            statement.executeUpdate(insertQuery);

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateUserInDatabase(Client client) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String updateQuery = "UPDATE client SET firstname='" + client.getFirsname() +
                    "', lastname='" + client.getLastname() +
                    "', address='" + client.getAddress() +
                    "', postal=" + client.getPostal() +
                    ", city='" + client.getCity() +
                    "' WHERE id=" + client.getId();

            statement.executeUpdate(updateQuery);

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


import java.util.Scanner;

public class Client {
    Integer id;
    String firsname;
    String lastname;
    String address;
    Integer postal;
    String city;

    public Client(Integer id, String firstname, String lastname, String address, Integer postal, String city){
        this.id = id;
        this.firsname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.postal = postal;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirsname() {
        return firsname;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPostal() {
        return postal;
    }

    public void setPostal(Integer postal) {
        this.postal = postal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFullName(String fullName){
        return this.firsname + " " + this.lastname;
    }

    public void editClientInformation(Client client) {
        Database db = new Database();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the information you want edit:");
        System.out.println("1. Firstname");
        System.out.println("2. Lastname");
        System.out.println("3. Address");
        System.out.println("4. Postal");
        System.out.println("5. City");
        System.out.println("6. Return to the main menu");
        System.out.println("Your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter the new firstname: ");
                String newFirstname = scanner.nextLine();
                setFirsname(newFirstname);
                System.out.println("Firstname updated successfully.");
                db.updateUserInDatabase(client);
                break;
            case 2:
                System.out.println("Enter the new lastname: ");
                String newLastname = scanner.nextLine();
                setLastname(newLastname);
                System.out.println("Lastname updated successfully.");
                db.updateUserInDatabase(client);
                break;
            case 3:
                System.out.println("Enter the new address: ");
                String newAddress = scanner.nextLine();
                setAddress(newAddress);
                System.out.println("Address updated successfully.");
                db.updateUserInDatabase(client);
                break;
            case 4:
                System.out.println("Enter the new postal code: ");
                Integer newPostal = scanner.nextInt();
                scanner.nextLine();
                setPostal(newPostal);
                System.out.println("Postal updated successfully.");
                db.updateUserInDatabase(client);
                break;
            case 5:
                System.out.println("Enter the new city: ");
                String newCity = scanner.nextLine();
                setCity(newCity);
                System.out.println("City updated successfully.");
                db.updateUserInDatabase(client);
                break;
            case 6:
                System.out.println("Returning to the main menu...");
                break;
            default:
                System.out.println("Invalid choice. Returning to the main menu...");
                break;
        }
    }

}

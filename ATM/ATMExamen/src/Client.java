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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

public class Customer {
    public String libraryNumber;
    public String password;
    private String name;
    private String email;
    private int contact;

    public Customer(String libraryNumber,String password, String name, String email, int contact) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.name = name;
        this.email = email;
        this.contact = contact;
    }

    public String toString()
    {
        return name + " " + email + " " + contact;
    }

}

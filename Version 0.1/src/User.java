public class User {
    protected String userId;
    protected String name;
    protected String email;
    protected String phoneNumber;
    protected String address;
    protected String password;

    // Constructor
    public User(String userId, String name, String email, String phoneNumber, String address, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password = password;
    }

    public void login() {
        System.out.println(name + " logged in.");
    }

    public void logout() {
        System.out.println(name + " logged out.");
    }
}

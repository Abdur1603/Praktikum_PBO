package models;

public class Person {
    protected String username;
    protected String password;
    
    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public void login() {
        System.out.println(username + " login berhasil.");
    }

    public void logout() {
        System.out.println(username + " logout.");
    }
}

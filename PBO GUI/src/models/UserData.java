package models;
import java.util.ArrayList;

public class UserData {
    public static ArrayList<Person> akunTerdaftar = new ArrayList<>();

    public static void tambahUser(String username, String password) {
        akunTerdaftar.add(new Person(username, password));
    }

    public static Person cariUser(String username, String password) {
        for (Person p : akunTerdaftar) {
            if (p.getUsername().equals(username) && p.getPassword().equals(password)) {
                return p;
            }
        }
        return null;
    }
}

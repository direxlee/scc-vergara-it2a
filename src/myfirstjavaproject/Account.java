
package myfirstjavaproject;

public class Account {
    
     int lastId = 0;
     int id;
     String firstName;
     String lastName;
     String email;
     String username;
     String password;

    public Account(String firstName, String lastName, String email, String username, String password) {
        this.id = ++lastId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
     
    public String toString() {
        return "\nID: " + id + " \nFirst Name: " + firstName + " \nLast Name: " + lastName + 
               " \nEmail: " + email + " \nUsername: " + username;
    }
}


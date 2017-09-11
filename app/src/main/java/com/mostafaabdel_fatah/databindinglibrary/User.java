package com.mostafaabdel_fatah.databindinglibrary;

/**
 * Created by Mostafa AbdEl_Fatah on 9/10/2017.
 */

public class User {
    private String firstName,lastName;

    public User(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

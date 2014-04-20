package com.allowify.client.model;

public class Customer {

    private String firstName;
    private String lastName;
    private String facebookID;
    private String email;
    
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
    public String getFacebookID() {
            return facebookID;
    }
    public void setFacebookID(String facebookID) {
            this.facebookID = facebookID;
    }
    public String getEmail() {
            return email;
    }
    public void setEmail(String email) {
            this.email = email;
    }
    
    @Override
    public String toString() {
            return "Customer [firstName=" + firstName + ", lastName=" + lastName
                            + ", facebookID=" + facebookID + ", email=" + email + "]";
    }
	
}

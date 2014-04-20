package com.allowify.client.model;

public class SocialUser {

    private String firstName;
    private String lastName;
    private String email;
    
    private String facebookID;      
    private String facebookAppID;
    
    private String shortToken;
    private Long shortTokenExpiration;

    private String longToken;
    private Long longTokenExpiration;
    
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
    public String getEmail() {
            return email;
    }
    public void setEmail(String email) {
            this.email = email;
    }
    public String getFacebookID() {
            return facebookID;
    }
    public void setFacebookID(String facebookID) {
            this.facebookID = facebookID;
    }
    public String getFacebookAppID() {
            return facebookAppID;
    }
    public void setFacebookAppID(String facebookAppID) {
            this.facebookAppID = facebookAppID;
    }
    public String getShortToken() {
            return shortToken;
    }
    public void setShortToken(String shortToken) {
            this.shortToken = shortToken;
    }
    public Long getShortTokenExpiration() {
            return shortTokenExpiration;
    }
    public void setShortTokenExpiration(Long shortTokenExpiration) {
            this.shortTokenExpiration = shortTokenExpiration;
    }
    public String getLongToken() {
            return longToken;
    }
    public void setLongToken(String longToken) {
            this.longToken = longToken;
    }
    public Long getLongTokenExpiration() {
            return longTokenExpiration;
    }
    public void setLongTokenExpiration(Long longTokenExpiration) {
            this.longTokenExpiration = longTokenExpiration;
    }
    
    @Override
    public String toString() {
            return "SocialUser [firstName=" + firstName + ", lastName=" + lastName
                            + ", email=" + email + ", facebookID=" + facebookID
                            + ", facebookAppID=" + facebookAppID + ", shortToken="
                            + shortToken + ", shortTokenExpiration=" + shortTokenExpiration
                            + ", longToken=" + longToken + ", longTokenExpiration="
                            + longTokenExpiration + "]";
    }
	
}

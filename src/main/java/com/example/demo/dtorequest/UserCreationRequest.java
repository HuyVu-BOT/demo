package com.example.demo.dtorequest;

import jakarta.validation.constraints.Size;

public class UserCreationRequest {        
    private String username;       
    private String userAddress;
    @Size(min = 10, message="PHONENUMBER_INVALID")  
    private String userPhone;
    @Size(min = 4, message="PASSWORD_INVALID")  
    private String userpw;
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUserAddress() {
        return userAddress;
    }
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    public String getUserPhone() {
        return userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }
}

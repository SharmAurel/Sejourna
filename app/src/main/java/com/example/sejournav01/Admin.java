package com.example.sejournav01;

public class Admin {
    private String Username;
    private String Password;
    public Admin(String Username,String Password)
    {
        this.Username=Username;
        this.Password=Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }
}

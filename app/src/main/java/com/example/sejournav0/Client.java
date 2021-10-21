package com.example.sejournav0;

public class Client {
    private final String Username;
    private final String Name;
    private final String Last_name;
    private final String mail;
    private String password;
    private final String birthday;
    private String phone_number;
    private boolean single;
    private boolean with_kids;

    public Client(String username, String name, String last_name, String mail, String password, String birthday, String phone_number, boolean single, boolean with_kids) {
        Username = username;
        Name = name;
        Last_name = last_name;
        this.mail = mail;
        this.password = password;
        this.birthday = birthday;
        this.phone_number = phone_number;
        this.single = single;
        this.with_kids = with_kids;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    public boolean isWith_kids() {
        return with_kids;
    }

    public void setWith_kids(boolean with_kids) {
        this.with_kids = with_kids;
    }
}

package com.example.sejournav0.activities;

public class Gastronomy extends Activities{
    private String Type;

    public Gastronomy(String country, String city, String street_name, Double cost, int required_age, int number_of_people_required,String type) {
        super(country, city, street_name, cost, required_age, number_of_people_required);
        this.Type=type;
    }
}

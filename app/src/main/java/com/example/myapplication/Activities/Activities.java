package com.example.myapplication.Activities;

public abstract class Activities {
    private String Country;
    private String City;
    private String Street_name;
    private Double Cost;
    private int required_age;
    private int number_of_people_required;

    public Activities(String country, String city, String street_name, Double cost, int required_age, int number_of_people_required) {
        Country = country;
        City = city;
        Street_name = street_name;
        Cost = cost;
        this.required_age = required_age;
        this.number_of_people_required = number_of_people_required;
    }
}

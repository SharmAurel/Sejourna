package com.example.sejournaapi.Activities;

import com.example.sejournaapi.*;

import java.util.ArrayList;

public abstract class Activities {
private double prix;
private ArrayList<Avis>avis;
private int avissurcinq;
private String description;
private String titre;
private int id;
private double latitude;
private double longitude;
private String type;
public Activities(int id,double prix,String description,String titre,double latitude,double longitude,String type)
{
    this.id=id;
    this.prix=prix;
    this.description=description;
    this.avis=new ArrayList<>();
    this.titre=titre;
    this.latitude=latitude;
    this.longitude=longitude;
    this.type=type;
}

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public ArrayList<Avis> getAvis() {
        return avis;
    }

    public void setAvis(ArrayList<Avis> avis) {
        this.avis = avis;
    }

    public int getAvissurcinq() {
        return avissurcinq;
    }

    public void setAvissurcinq(int avissurcinq) {
        this.avissurcinq = avissurcinq;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

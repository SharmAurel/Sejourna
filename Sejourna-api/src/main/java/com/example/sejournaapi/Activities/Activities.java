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

}

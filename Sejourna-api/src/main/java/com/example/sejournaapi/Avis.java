package com.example.sejournaapi;

public class Avis {
    private int surcinq;
    private String description;
    public Avis(int surcing,String description)
    {
        this.surcinq=surcing;
        this.description=description;
    }
    public Avis(int surcinq)
    {
        this.surcinq=surcinq;
        this.description=null;
    }
}

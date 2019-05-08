package edu.eligrow.dbdemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genre {
    @Id
    private String name;
    private int rating;

    public Genre(String n, int r){
        name = n;
        rating = r;
    }

    public Genre(){
        this.name = name;
        this.rating = rating;
    }

    public String getName() { return name; }

    public int getRating() { return rating; }
}

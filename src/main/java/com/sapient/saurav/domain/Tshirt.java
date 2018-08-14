package com.sapient.saurav.domain;

import javax.persistence.*;

@Entity
@Table(name = "TSHIRT")
public class Tshirt {
    @Id
    @Column(name = "TSIRT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "SIZE")
    private String size ;
    @Column(name = "COLOUR")
    private String colour ;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    private long price ;
    @Column(name = "AVAILABLE")
    private long available ;

    public Tshirt() {
    }

    public Tshirt(String size, String colour, String name, long price, long available) {
        this.size = size;
        this.colour = colour;
        this.name = name ;
        this.price = price;
        this.available = available;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    public long getAvailable() {
        return available;
    }

    public void setAvailable(long available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

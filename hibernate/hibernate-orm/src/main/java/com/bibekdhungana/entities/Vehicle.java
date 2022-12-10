package com.bibekdhungana.entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
    @Id
    private int vid;
    private String brand;
    private String color;

    public Vehicle() {
    }

    public Vehicle(int vid, String brand, String color) {
        this.vid = vid;
        this.brand = brand;
        this.color = color;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vid=" + vid +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}

package model.structures.impl;

public class Transformers {

    private String brand;
    private String animal;

    public Transformers(String brand, String animal) {
        this.brand = brand;
        this.animal = animal;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}

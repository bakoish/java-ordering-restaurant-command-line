package io.bakoish.model;

public class Drink extends Food{
    private Double capacity;
    private boolean lemon;
    private boolean iceCube;

    public Drink(String name, Double price, String details, Double capacity) {
        super(name, price, details);
        this.capacity = capacity;
    }

    public void addLemon() {
        lemon = true;
    }

    public void addIceCube() {
        iceCube = true;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public String toString() {
        String message = getName();
        if(lemon) message+=" with lemon";
        if(iceCube) message+=" with ice cubes";
        return message;
    }
}

package com.talevski.viktor.example.bad;

public class ToyPlane implements Toy {
    private String name;
    private Integer price;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public void play() {
        System.out.println("Playing with the " + name + " toy.");
    }

    @Override
    public void move() {
        System.out.println("The " + name + " toy is moving.");
    }

    @Override
    public void fly() {
        System.out.println("The " + name + " toy is flying.");
    }
}

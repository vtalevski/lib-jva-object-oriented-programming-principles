package com.talevski.viktor.example.good;

public class ToyHouse implements Toy {
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
}

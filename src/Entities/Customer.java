package Entities;

import java.util.Random;

public class Customer {
    private Long id;
    private String name;
    private int tier;

    //COSTRUTTORE


    public Customer(String name, int tier) {
        Random random = new Random();
        this.id = random.nextLong();
        this.name = name;
        this.tier = tier;
    }

    //GETTER E SETTER
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }
}



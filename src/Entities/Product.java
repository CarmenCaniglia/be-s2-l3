package Entities;

import java.util.Random;

public class Product {
    private Long id;
    private String name;
    private String category;
    private Double price;

    //COSTRUTTORE


    public Product(String name, String category, Double price) {
        Random random = new Random();
        this.id = random.nextLong();
        this.name = name;
        this.category = category;
        this.price = price;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

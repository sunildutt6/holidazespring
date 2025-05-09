package com.example.demo.model;

public class Listing {
    private Long id;
    private String title;
    private String address;
    private String description;
    private String image_url;
    private int price;

    public Listing() {}

    public Listing(Long id, String title, String address, String description, String image_url, int price) {
        this.id = id;
        this.title = title;
        this.address = address;
        this.description = description;
        this.image_url = image_url;
        this.price = price;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImage_url() { return image_url; }
    public void setImage_url(String image_url) { this.image_url = image_url; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
}

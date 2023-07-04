package com.demo;

public class Product {

    private String name;
    private String description;

    protected Product(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    static class Builder {
        private String name;
        private String description;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Product build() {
           return  new Product(this);
        }

    }
}



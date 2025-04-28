package org.skypro.skyshop.model.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.skypro.skyshop.model.search.Searchable;

import java.util.UUID;

public abstract class Product implements Searchable {
    private UUID id;
    private String name;
    private String searchTerm;
    private String contentType;

    public Product(String name) {
        if (name.isBlank()) throw new IllegalArgumentException("Product name cannot be empty");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public UUID getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public int getPrice();

    abstract public boolean isSpecial();

    @JsonIgnore
    public String getSearchTerm() {
        return searchTerm;
    }

    @JsonIgnore
    public String getContentType() {
        return contentType;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
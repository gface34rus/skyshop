package org.skypro.skyshop.model.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.skypro.skyshop.model.search.Searchable;

import java.util.UUID;

public class SimpleProduct extends Product {

    private final UUID id;

    public int getNormalPrice() {
        return normalPrice;
    }

    final private int normalPrice;

    public SimpleProduct(UUID id, String name, int normalPrice) {
        super(name);
        if (normalPrice <= 0) {
            throw new IllegalArgumentException("Price cannot be less than or equal to zero");
        }
        this.id = id;
        this.normalPrice = normalPrice;
    }

    @Override
    public int getPrice() {
        return normalPrice;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    @JsonIgnore
    public String searchTerm() {
        return getName();
    }

    @Override
    @JsonIgnore
    public String getType() {
        return "PRODUCT";
    }

    @Override
    public void getStringRepresentation(Searchable searchable) {
        super.getStringRepresentation(searchable);
    }

    @Override
    public String toString() {
        return "SimpleProduct{ name= " + getName() +
                " normalPrice=" + normalPrice +
                '}';
    }
}

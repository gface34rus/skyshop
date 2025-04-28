package org.skypro.skyshop.model.product;

import org.skypro.skyshop.model.search.Searchable;

import java.util.UUID;

public class FixPriceProduct extends Product {
    private final UUID id;
    private static final int FIX_PRICE = 1;

    public FixPriceProduct(UUID id, String name) {
        super(name);
        this.id = id;
    }

    @Override
    public String toString() {
        return getName() + ": Фиксированная цена - " + FIX_PRICE;
    }

    @Override
    public int getPrice() {
        return FIX_PRICE;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String searchTerm() {
        return getName();
    }

    @Override
    public String getType() {
        return "PRODUCT";
    }

    @Override
    public void getStringRepresentation(Searchable searchable) {
        super.getStringRepresentation(searchable);
    }
}

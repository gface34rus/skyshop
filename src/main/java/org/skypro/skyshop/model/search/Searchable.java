package org.skypro.skyshop.model.search;

import java.util.UUID;

public interface Searchable {

    String searchTerm();

    String getName();

    String getType();

    UUID getId();

    default void getStringRepresentation(Searchable searchable) {
        System.out.println("Имя- " + searchable.searchTerm() + " Тип- " + searchable.getType());
    }
}

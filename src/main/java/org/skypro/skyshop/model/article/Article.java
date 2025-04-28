package org.skypro.skyshop.model.article;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.skypro.skyshop.model.search.Searchable;

import java.util.UUID;

public class Article implements Searchable {

    private final UUID id;
    private final String title;
    private final String content;

    public Article(UUID id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return title + "\n" + content;
    }

    @Override
    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @JsonIgnore
    public String getSearchTerm() {
        return searchTerm();
    }

    @JsonIgnore
    public String getContentType() {
        return getType();
    }

    @Override
    public String searchTerm() {
        return toString();
    }

    @Override
    public String getName() {
        return title;
    }

    @Override
    public String getType() {
        return "ARTICLE";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Article)) return false;
        Article other = (Article) obj;
        return title.equals(other.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}
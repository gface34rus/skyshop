package org.skypro.skyshop.service;

import org.skypro.skyshop.model.article.Article;
import org.skypro.skyshop.model.product.Product;
import org.skypro.skyshop.model.product.SimpleProduct;
import org.skypro.skyshop.model.search.Searchable;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class StorageService {

    private final Map<UUID, Product> productStorage;
    private final Map<UUID, Article> articleStorage;
    private Map<UUID, Product> availableProducts;


    public StorageService(Map<UUID, Product> availableProducts) {
        this.availableProducts = new HashMap<>();
        this.productStorage = new HashMap<>();
        this.articleStorage = new HashMap<>();
    }

    public StorageService() {
        this.productStorage = new HashMap<>();
        this.articleStorage = new HashMap<>();
        initializeTestData();
    }

    private void initializeTestData() {
        Product product1 = new SimpleProduct(UUID.randomUUID(), "Product 1", 100);
        Product product2 = new SimpleProduct(UUID.randomUUID(), "Product 2", 200);
        Article article1 = new Article(UUID.randomUUID(), "Article 1", "Content 1");
        Article article2 = new Article(UUID.randomUUID(), "Article 2", "Content 2");

        productStorage.put(product1.getId(), product1);
        productStorage.put(product2.getId(), product2);
        articleStorage.put(article1.getId(), article1);
        articleStorage.put(article2.getId(), article2);
    }

    public Collection<Product> getAllProducts() {
        return productStorage.values();
    }

    public Collection<Article> getAllArticles() {
        return articleStorage.values();
    }

    public Collection<Searchable> getAllSearchableItems() {
        return productStorage.values().stream()
                .map(product -> (Searchable) product)
                .collect(Collectors.toList());
    }

    public Optional<Product> getProductById(UUID id) {
        return Optional.ofNullable(availableProducts.get(id));
    }
}

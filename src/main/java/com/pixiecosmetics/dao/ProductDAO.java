package com.pixiecosmetics.dao;

import com.pixiecosmetics.model.Product;

public interface ProductDAO {

    public boolean create(Product product);
    public Product read(String name);
    public boolean update(Product product);
    public boolean delete(Product product);

}

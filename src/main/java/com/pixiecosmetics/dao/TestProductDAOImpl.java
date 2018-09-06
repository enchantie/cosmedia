package com.pixiecosmetics.dao;

import com.pixiecosmetics.model.Product;

public class TestProductDAOImpl implements ProductDAO {

    @Override
    public boolean create(Product product) {
        return false;
    }

    @Override
    public Product read(String name) {
        return null;
    }

    @Override
    public boolean update(Product product) {
        return false;
    }

    @Override
    public boolean delete(Product product) {
        return false;
    }

}

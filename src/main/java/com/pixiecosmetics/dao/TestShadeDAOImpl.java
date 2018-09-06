package com.pixiecosmetics.dao;

import com.pixiecosmetics.model.Product;
import com.pixiecosmetics.model.Shade;

public class TestShadeDAOImpl implements ShadeDAO {

    @Override
    public boolean create(Shade shade) {
        return false;
    }

    @Override
    public Shade read(String shadeName, Product product) {
        return null;
    }

    @Override
    public boolean update(Shade shade) {
        return false;
    }

    @Override
    public boolean delete(Shade shade) {
        return false;
    }

}

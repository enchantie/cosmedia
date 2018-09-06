package com.pixiecosmetics.dao;

import com.pixiecosmetics.model.Product;
import com.pixiecosmetics.model.Shade;

public interface ShadeDAO {

    public boolean create(Shade shade);
    public Shade read(String shadeName, Product product);
    public boolean update(Shade shade);
    public boolean delete(Shade shade);

}

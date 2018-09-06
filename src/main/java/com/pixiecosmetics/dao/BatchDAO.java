package com.pixiecosmetics.dao;

import com.pixiecosmetics.model.Batch;

public interface BatchDAO {

    public boolean create(Batch batch);
    public Batch read(String batchNumber);
    public boolean update(Batch batch);
    public boolean delete(Batch batch);

}

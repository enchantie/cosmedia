package com.pixiecosmetics.dao;

import com.pixiecosmetics.model.Batch;

public class MysqlBatchDAOImpl implements BatchDAO {

    @Override
    public boolean create(Batch batch) {
        return false;
    }

    @Override
    public Batch read(String batchNumber) {
        return null;
    }

    @Override
    public boolean update(Batch batch) {
        return false;
    }

    @Override
    public boolean delete(Batch batch) {
        return false;
    }

}


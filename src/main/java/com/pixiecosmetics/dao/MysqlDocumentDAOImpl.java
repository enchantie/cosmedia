package com.pixiecosmetics.dao;

import com.pixiecosmetics.model.Document;

import java.util.List;

public class MysqlDocumentDAOImpl implements DocumentDAO {

    @Override
    public boolean create(Document document) {
        return false;
    }

    @Override
    public Document read(String id) {
        return null;
    }

    @Override
    public boolean update(Document document) {
        return false;
    }

    @Override
    public boolean delete(Document document) {
        return false;
    }

    @Override
    public List<Document> getAll() {
        return null;
    }

}

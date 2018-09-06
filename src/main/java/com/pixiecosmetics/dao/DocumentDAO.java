package com.pixiecosmetics.dao;

import com.pixiecosmetics.model.Document;

import java.util.List;

public interface DocumentDAO {

    public boolean create(Document document);
    public Document read(String id);
    public boolean update(Document document);
    public boolean delete(Document document);
    public List<Document> getAll();

}

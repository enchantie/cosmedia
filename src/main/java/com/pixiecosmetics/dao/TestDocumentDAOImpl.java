package com.pixiecosmetics.dao;

import com.pixiecosmetics.model.Document;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestDocumentDAOImpl implements DocumentDAO {

    //list is working as a database
    private List<Document> documents;

    TestDocumentDAOImpl() {
        documents = new ArrayList<Document>();
    }

    @Override
    public boolean create(Document document) {
        if (document == null || document.getId() == null || document.getName() == null) {
            System.out.println("Document cannot have null fields");
            return false;
        }
        documents.add(document);
        System.out.println("Stworzono dokument");
        return true;
    }

    @Override
    public Document read(String id) {
        Document find = documents.stream()
                .filter(document -> id.equals(document.getId()))
                .findFirst()
                .orElse(null);
        return find;
    }

    @Override
    public boolean update(Document document) {
        Document readDocument = read(document.getId());
        if (readDocument != null) {
            readDocument.setName(document.getName());
            System.out.println("Zaktualizowano dokument");
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Document document) {
        Document readDocument = read(document.getId());
        if (readDocument != null) {
            documents.remove(readDocument);
            System.out.println("Usunieto dokument");
            return true;
        }
        return false;
    }

    @Override
    public List<Document> getAll() {
        return documents;
    }

}

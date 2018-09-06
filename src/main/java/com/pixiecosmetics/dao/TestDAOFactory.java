package com.pixiecosmetics.dao;

public class TestDAOFactory extends DAOFactory {


    @Override
    public BatchDAO getBatchDAO() {
        return new TestBatchDAOImpl();
    }

    @Override
    public DocumentDAO getDocumentDAO() {
        return new TestDocumentDAOImpl();
    }

    @Override
    public ProductDAO getProductDAO() {
        return new TestProductDAOImpl();
    }

    @Override
    public ShadeDAO getShadeDAO() {
        return new TestShadeDAOImpl();
    }
}

package com.pixiecosmetics.dao;

public class MysqlDAOFactory extends DAOFactory {

    @Override
    public BatchDAO getBatchDAO() {
        return new MysqlBatchDAOImpl();
    }

    @Override
    public DocumentDAO getDocumentDAO() {
        return new MysqlDocumentDAOImpl();
    }

    @Override
    public ProductDAO getProductDAO() {
        return new MysqlProductDAOImpl();
    }

    @Override
    public ShadeDAO getShadeDAO() {
        return new MysqlShadeDAOImpl();
    }
}

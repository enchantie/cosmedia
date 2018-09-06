package com.pixiecosmetics.dao;

import com.pixiecosmetics.model.Document;

public abstract class DAOFactory {

    public static final int MYSQL_DAO = 0;
    public static final int TEST_DAO = 1;
    private static DAOFactory instance;

    public abstract BatchDAO getBatchDAO();
    public abstract DocumentDAO getDocumentDAO();
    public abstract ProductDAO getProductDAO();
    public abstract ShadeDAO getShadeDAO();

    public static DAOFactory getDAOFactory(int factoryType) {
        if (instance == null) {
            if (factoryType == MYSQL_DAO) {
                instance = new MysqlDAOFactory();
            }
            else if (factoryType == TEST_DAO) {
                instance = new TestDAOFactory();
            }
        }
        return instance;
    }
}

package com.pixiecosmetics;

import com.pixiecosmetics.dao.DAOFactory;
import com.pixiecosmetics.dao.DocumentDAO;
import com.pixiecosmetics.model.Document;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.TEST_DAO);
        DocumentDAO documentDAO = factory.getDocumentDAO();
        Document newDocument = new Document("Badanie aplikacyjne Amazon Gold Mineral Foundation", "AG_PIF_APP");
        Document newDocument2 = new Document("Badanie dermatologiczne Amazon Gold Mineral Foundation", "AG_PIF_DER");
        Document newDocument3 = new Document("Badanie fizykochamiczne Amazon Gold Mineral Foundation", "AG_PIF_FIZ");
        documentDAO.create(newDocument);
        documentDAO.create(newDocument2);
        documentDAO.create(newDocument3);
        Document find = documentDAO.read("AG_PIF_DER");
        if (find != null) {
            System.out.println("Znaleziono dokument: " + find.getName());
        } else {
            System.out.println("Nie ma dokumentu o takim ID.");
        }

        printAllDocuments(documentDAO);

        Document documentToBeDeleted = new Document("Badanie dermatologiczne Amazon Gold Mineral Foundation", "AG_PIF_APP");

        documentDAO.delete(documentToBeDeleted);

        printAllDocuments(documentDAO);

        Document newVersionOfDocument = new Document("Badanie dermatologiczne rozszerzone Amazon Gold Mineral Foundation", "AG_PIF_DER");

        documentDAO.update(newVersionOfDocument);

        printAllDocuments(documentDAO);

    }

    private static void printAllDocuments(DocumentDAO documentDAO) {
        System.out.println("Lista dokumentów:");
        for (Document d : documentDAO.getAll()) {
            System.out.println(d);
        }
    }
}

package com.pixiecosmetics.model;

public class Document {

    String name;

    private String id;

    public Document() {
    }

    public Document(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Document(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

}

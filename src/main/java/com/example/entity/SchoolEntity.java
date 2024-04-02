package com.example.entity;

public class SchoolEntity {
    private String id;
    private String name;
    private String location;

    public SchoolEntity(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public SchoolEntity() {}

    @Override
    public String toString() {
        return "School [id=" + id + ", name=" + name + ", location=" + location + "]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

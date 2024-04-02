package com.example.entity;

public class TeacherEntity {
    private String id;
    private String name;
    private int age;
    private String subject;

    public TeacherEntity(String id, String name, int age, String subject) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public TeacherEntity() {}

    @Override
    public String toString() {
        return "Teacher [id=" + id + ", name=" + name + ", age=" + age + ", subject=" + subject + "]";
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

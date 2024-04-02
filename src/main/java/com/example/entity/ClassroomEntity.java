package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class ClassroomEntity {
    private String id;
    private String name;
    private List<StudentEntity> students;
    private TeacherEntity teacher;

    public ClassroomEntity(String id, String name, TeacherEntity teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public ClassroomEntity() {
        this.students = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Classroom [id=" + id + ", name=" + name + ", teacher=" + teacher.getName() + ", numberOfStudents=" + students.size() + "]";
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

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }

    public TeacherEntity getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherEntity teacher) {
        this.teacher = teacher;
    }

    public void addStudent(StudentEntity student) {
        this.students.add(student);
    }

    public void removeStudent(StudentEntity student) {
        this.students.remove(student);
    }
}

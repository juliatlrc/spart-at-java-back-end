package com.example.repository;

import com.example.entity.StudentEntity;

import java.util.HashMap;
import java.util.Map;

public class StudentRepository {
    private static final Map<String, StudentEntity> students = new HashMap<>();

    static {
        students.put("1", new StudentEntity("1", "Ana Silva", 15, "9th Grade"));
        students.put("2", new StudentEntity("2", "Pedro Santos", 14, "8th Grade"));
    }

    public static StudentEntity getStudentById(String id) {
        return students.get(id);
    }

    public static Map<String, StudentEntity> getAllStudents() {
        return students;
    }
}

package com.example.repository;

import com.example.entity.TeacherEntity;

import java.util.HashMap;
import java.util.Map;

public class TeacherRepository {
    private static final Map<String, TeacherEntity> teachers = new HashMap<>();

    static {
        teachers.put("1", new TeacherEntity("1", "João Silva", 35, "Matemática"));
        teachers.put("2", new TeacherEntity("2", "Maria Santos", 42, "História"));
    }

    public static TeacherEntity getTeacherById(String id) {
        return teachers.get(id);
    }

    public static Map<String, TeacherEntity> getAllTeachers() {
        return teachers;
    }
}

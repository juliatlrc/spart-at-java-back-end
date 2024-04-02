package com.example.service;

import com.example.entity.TeacherEntity;
import com.example.repository.TeacherRepository;

import java.util.Map;

public class TeacherService {
    private static final Map<String, TeacherEntity> teachers = TeacherRepository.getAllTeachers();

    public static TeacherEntity getTeacherById(String id) {
        return teachers.get(id);
    }

    public static Map<String, TeacherEntity> getAllTeachers() {
        return teachers;
    }

    public static void addTeacher(TeacherEntity teacher) {
        teachers.put(teacher.getId(), teacher);
    }

    public static void updateTeacher(String id, TeacherEntity teacher) {
        if (teachers.containsKey(id)) {
            teachers.put(id, teacher);
        }
    }

    public static void deleteTeacher(String id) {
        teachers.remove(id);
    }
}

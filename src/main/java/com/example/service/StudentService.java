package com.example.service;

import com.example.entity.StudentEntity;
import com.example.repository.StudentRepository;

import java.util.Map;

public class StudentService {
    private static final Map<String, StudentEntity> students = StudentRepository.getAllStudents();

    public static StudentEntity getStudentById(String id) {
        return students.get(id);
    }

    public static Map<String, StudentEntity> getAllStudents() {
        return students;
    }

    public static void addStudent(StudentEntity student) {
        students.put(student.getId(), student);
    }

    public static void updateStudent(String id, StudentEntity student) {
        if (students.containsKey(id)) {
            students.put(id, student);
        }
    }

    public static void deleteStudent(String id) {
        students.remove(id);
    }
}

package com.example.repository;

import com.example.entity.ClassroomEntity;

import java.util.HashMap;
import java.util.Map;

public class ClassroomRepository {
    private static final Map<String, ClassroomEntity> classrooms = new HashMap<>();

    static {
        // Exemplo de inicialização de algumas salas de aula
        ClassroomEntity classroom1 = new ClassroomEntity("1", "Turma A", TeacherRepository.getTeacherById("1"));
        classroom1.addStudent(StudentRepository.getStudentById("1"));
        classroom1.addStudent(StudentRepository.getStudentById("2"));
        classrooms.put("1", classroom1);

        ClassroomEntity classroom2 = new ClassroomEntity("2", "Turma B", TeacherRepository.getTeacherById("2"));
        classroom2.addStudent(StudentRepository.getStudentById("3"));
        classroom2.addStudent(StudentRepository.getStudentById("4"));
        classrooms.put("2", classroom2);

        ClassroomEntity classroom3 = new ClassroomEntity("3", "Turma C", TeacherRepository.getTeacherById("3"));
        classroom3.addStudent(StudentRepository.getStudentById("5"));
        classroom3.addStudent(StudentRepository.getStudentById("6"));
        classrooms.put("3", classroom3);

        ClassroomEntity classroom4 = new ClassroomEntity("4", "Turma D", TeacherRepository.getTeacherById("4"));
        classroom4.addStudent(StudentRepository.getStudentById("7"));
        classroom4.addStudent(StudentRepository.getStudentById("8"));
        classrooms.put("4", classroom4);

        ClassroomEntity classroom5 = new ClassroomEntity("5", "Turma E", TeacherRepository.getTeacherById("5"));
        classroom5.addStudent(StudentRepository.getStudentById("9"));
        classroom5.addStudent(StudentRepository.getStudentById("10"));
        classrooms.put("5", classroom5);
    }

    public static ClassroomEntity getClassroomById(String id) {
        return classrooms.get(id);
    }

    public static Map<String, ClassroomEntity> getAllClassrooms() {
        return classrooms;
    }
}

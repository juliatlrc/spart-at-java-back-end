package com.example.service;

import com.example.entity.ClassroomEntity;
import com.example.entity.StudentEntity;
import com.example.entity.TeacherEntity;
import com.example.repository.ClassroomRepository;

import java.util.Map;

public class ClassroomService {
    private static final Map<String, ClassroomEntity> classrooms = ClassroomRepository.getAllClassrooms();

    public static ClassroomEntity getClassroomById(String id) {
        return classrooms.get(id);
    }

    public static Map<String, ClassroomEntity> getAllClassrooms() {
        return classrooms;
    }

    public static void addClassroom(ClassroomEntity classroom) {
        classrooms.put(classroom.getId(), classroom);
    }

    public static void updateClassroom(String id, ClassroomEntity classroom) {
        if (classrooms.containsKey(id)) {
            classrooms.put(id, classroom);
        }
    }

    public static void deleteClassroom(String id) {
        classrooms.remove(id);
    }

    public static void addStudentToClassroom(String classroomId, StudentEntity student) {
        ClassroomEntity classroom = classrooms.get(classroomId);
        if (classroom != null) {
            classroom.addStudent(student);
            classrooms.put(classroomId, classroom);
        }
    }

    public static void addTeacherToClassroom(String classroomId, TeacherEntity teacher) {
        ClassroomEntity classroom = classrooms.get(classroomId);
        if (classroom != null) {
            classroom.setTeacher(teacher);
            classrooms.put(classroomId, classroom);
        }
    }


}

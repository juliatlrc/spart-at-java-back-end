package com.example.controller;

import com.example.entity.SchoolEntity;
import com.example.entity.StudentEntity;
import com.example.entity.TeacherEntity;
import com.example.entity.ClassroomEntity;
import com.example.service.SchoolService;
import com.example.service.StudentService;
import com.example.service.TeacherService;
import com.example.service.ClassroomService;
import com.google.gson.Gson;
import static spark.Spark.*;

public class ControllerSpark {

    public static void setupRoutes() {
        port(4567);
        Gson gson = new Gson();

        // Habilitar CORS
        enableCORS();

        // Rotas para escolas
        path("/schools", () -> {
            get("", (req, res) -> {
                res.type("application/json");
                return gson.toJson(SchoolService.getAllSchools().values());
            });

            get("/:id", (req, res) -> {
                String id = req.params(":id");
                SchoolEntity school = SchoolService.getSchoolById(id);
                if (school != null) {
                    res.type("application/json");
                    return gson.toJson(school);
                } else {
                    res.status(404);
                    return "Escola não encontrada";
                }
            });

            post("", (req, res) -> {
                SchoolEntity school = gson.fromJson(req.body(), SchoolEntity.class);
                SchoolService.addSchool(school);
                res.status(201);
                return "Escola adicionada com sucesso";
            });

            put("/:id", (req, res) -> {
                String id = req.params(":id");
                SchoolEntity school = gson.fromJson(req.body(), SchoolEntity.class);
                SchoolService.updateSchool(id, school);
                return "Escola atualizada com sucesso";
            });

            delete("/:id", (req, res) -> {
                String id = req.params(":id");
                SchoolService.deleteSchool(id);
                return "Escola deletada com sucesso";
            });
        });

        // Rotas para alunos
        path("/students", () -> {
            get("", (req, res) -> {
                res.type("application/json");
                return gson.toJson(StudentService.getAllStudents().values());
            });

            get("/:id", (req, res) -> {
                String id = req.params(":id");
                StudentEntity student = StudentService.getStudentById(id);
                if (student != null) {
                    res.type("application/json");
                    return gson.toJson(student);
                } else {
                    res.status(404);
                    return "Aluno não encontrado";
                }
            });

            post("", (req, res) -> {
                StudentEntity student = gson.fromJson(req.body(), StudentEntity.class);
                StudentService.addStudent(student);
                res.status(201);
                return "Aluno adicionado com sucesso";
            });

            put("/:id", (req, res) -> {
                String id = req.params(":id");
                StudentEntity student = gson.fromJson(req.body(), StudentEntity.class);
                StudentService.updateStudent(id, student);
                return "Aluno atualizado com sucesso";
            });

            delete("/:id", (req, res) -> {
                String id = req.params(":id");
                StudentService.deleteStudent(id);
                return "Aluno deletado com sucesso";
            });
        });

        // Rotas para professores
        path("/teachers", () -> {
            get("", (req, res) -> {
                res.type("application/json");
                return gson.toJson(TeacherService.getAllTeachers().values());
            });

            get("/:id", (req, res) -> {
                String id = req.params(":id");
                TeacherEntity teacher = TeacherService.getTeacherById(id);
                if (teacher != null) {
                    res.type("application/json");
                    return gson.toJson(teacher);
                } else {
                    res.status(404);
                    return "Professor não encontrado";
                }
            });

            post("", (req, res) -> {
                TeacherEntity teacher = gson.fromJson(req.body(), TeacherEntity.class);
                TeacherService.addTeacher(teacher);
                res.status(201);
                return "Professor adicionado com sucesso";
            });

            put("/:id", (req, res) -> {
                String id = req.params(":id");
                TeacherEntity teacher = gson.fromJson(req.body(), TeacherEntity.class);
                TeacherService.updateTeacher(id, teacher);
                return "Professor atualizado com sucesso";
            });

            delete("/:id", (req, res) -> {
                String id = req.params(":id");
                TeacherService.deleteTeacher(id);
                return "Professor deletado com sucesso";
            });
        });

        // Rotas para turmas
        path("/classrooms", () -> {
            get("", (req, res) -> {
                res.type("application/json");
                return gson.toJson(ClassroomService.getAllClassrooms().values());
            });

            get("/:id", (req, res) -> {
                String id = req.params(":id");
                ClassroomEntity classroom = ClassroomService.getClassroomById(id);
                if (classroom != null) {
                    res.type("application/json");
                    return gson.toJson(classroom);
                } else {
                    res.status(404);
                    return "Turma não encontrada";
                }
            });

            post("", (req, res) -> {
                ClassroomEntity classroom = gson.fromJson(req.body(), ClassroomEntity.class);
                ClassroomService.addClassroom(classroom);
                res.status(201);
                return "Turma adicionada com sucesso";
            });

            put("/:id", (req, res) -> {
                String id = req.params(":id");
                ClassroomEntity classroom = gson.fromJson(req.body(), ClassroomEntity.class);
                ClassroomService.updateClassroom(id, classroom);
                return "Turma atualizada com sucesso";
            });

            delete("/:id", (req, res) -> {
                String id = req.params(":id");
                ClassroomService.deleteClassroom(id);
                return "Turma deletada com sucesso";
            });
        });
    }

    // Método para habilitar CORS
    private static void enableCORS() {
        options("/*", (request, response) -> {
            String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
            if (accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
            }

            String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
            if (accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
            }

            return "OK";
        });

        before((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
        });
    }
}

package com.example.service;

import com.example.entity.SchoolEntity;
import com.example.repository.SchoolRepository;

import java.util.Map;

public class SchoolService {
    private static final Map<String, SchoolEntity> schools = SchoolRepository.getAllSchools();

    public static SchoolEntity getSchoolById(String id) {
        return schools.get(id);
    }

    public static Map<String, SchoolEntity> getAllSchools() {
        return schools;
    }

    public static void addSchool(SchoolEntity school) {
        schools.put(school.getId(), school);
    }

    public static void updateSchool(String id, SchoolEntity school) {
        if (schools.containsKey(id)) {
            schools.put(id, school);
        }
    }

    public static void deleteSchool(String id) {
        schools.remove(id);
    }
}

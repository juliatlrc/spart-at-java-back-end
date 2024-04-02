package com.example.repository;

import com.example.entity.SchoolEntity;

import java.util.HashMap;
import java.util.Map;

public class SchoolRepository {
    private static final Map<String, SchoolEntity> schools = new HashMap<>();

    static {
        schools.put("1", new SchoolEntity("1", "Escola Primária", "Localização 1"));
        schools.put("2", new SchoolEntity("2", "Escola Secundária", "Localização 2"));
    }

    public static SchoolEntity getSchoolById(String id) {
        return schools.get(id);
    }

    public static Map<String, SchoolEntity> getAllSchools() {
        return schools;
    }
}

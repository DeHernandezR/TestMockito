package com.minsait.repositories;

import com.minsait.models.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findAll();
    Examen save(Examen examen);
}

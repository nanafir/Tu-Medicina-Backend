package com.TuMedicinaBack.back.repositorries

import com.TuMedicinaBack.back.models.enfermedades
import com.TuMedicinaBack.back.models.medicamentos
import org.springframework.data.jpa.repository.JpaRepository

interface EnfermedadRepository: JpaRepository<enfermedades, Int> {
}
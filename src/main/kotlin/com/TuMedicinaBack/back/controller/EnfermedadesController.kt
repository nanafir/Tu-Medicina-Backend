package com.TuMedicinaBack.back.controller

import com.TuMedicinaBack.back.models.enfermedades
import com.TuMedicinaBack.back.models.medicamentos
import com.TuMedicinaBack.back.repositorries.EnfermedadRepository
import com.TuMedicinaBack.back.repositorries.MedicamentoRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class EnfermedadesController ( private val enfermedadesRepository: EnfermedadRepository) {

    @GetMapping("/enfermedades")
    fun frontend(): ResponseEntity<List<enfermedades>> {
        return ResponseEntity.ok(this.enfermedadesRepository.findAll())
    }
}
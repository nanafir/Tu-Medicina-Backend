package com.TuMedicinaBack.back.controller

import com.TuMedicinaBack.back.models.medicamentos
import com.TuMedicinaBack.back.models.usuarios
import com.TuMedicinaBack.back.repositorries.MedicamentoRepository
import com.TuMedicinaBack.back.repositorries.UsuarioRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api")
class MedicamentosController ( private val medicamentosRepository: MedicamentoRepository) {

    @GetMapping("/medicamentos")
    fun frontend(): ResponseEntity<List<medicamentos>> {
        return ResponseEntity.ok(this.medicamentosRepository.findAll())
    }
}
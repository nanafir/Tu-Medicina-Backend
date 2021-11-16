package com.TuMedicinaBack.back.controller

import com.TuMedicinaBack.back.models.usuarios
import com.TuMedicinaBack.back.repositorries.UsuarioRepository
import org.aspectj.apache.bcel.classfile.Constant
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.awt.AWTEventMulticaster.add


@RestController
@RequestMapping("api")
class UsuariosController {

    @Autowired
    private lateinit var usuarioRepository: UsuarioRepository

    @GetMapping("/usuario")
    fun frontend(): ResponseEntity<List<usuarios>> {
        return ResponseEntity.ok(this.usuarioRepository.findAll())
    }

    @PostMapping("/insertar")

    fun insertar(@RequestBody usuarios: usuarios):  usuarios = usuarios.apply {

        usuarioRepository.save(usuarios)

    }
}


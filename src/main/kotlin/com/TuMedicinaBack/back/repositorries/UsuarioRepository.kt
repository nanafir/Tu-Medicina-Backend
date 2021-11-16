package com.TuMedicinaBack.back.repositorries

import com.TuMedicinaBack.back.models.usuarios
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository : JpaRepository<usuarios,Long> {

}
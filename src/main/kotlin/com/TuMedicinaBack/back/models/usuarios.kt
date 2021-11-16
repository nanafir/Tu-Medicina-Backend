package com.TuMedicinaBack.back.models

import java.sql.Date
import javax.persistence.*

@Entity
class usuarios {

    @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    var documento =""

    @Column
    var primerNombre=" "
    @Column
    var segundoNombre=""
    @Column
    var primerApellido=""
    @Column
    var segundoApellido=""
    @Column
    var usuario=""
    @Column
    var contrasena=""
    @Column
    var tipoDocumento=""
    @Column
    var correo =""
    @Column
    var fechaNacimiento=" "


} 
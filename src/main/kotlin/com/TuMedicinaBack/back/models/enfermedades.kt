package com.TuMedicinaBack.back.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class enfermedades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idEnfermedades = 0
    var codEnfermedad = " "
    var enfermedad =" "

}
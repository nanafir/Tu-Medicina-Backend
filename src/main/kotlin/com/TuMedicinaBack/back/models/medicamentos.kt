package com.TuMedicinaBack.back.models

import javax.persistence.*

@Entity
class medicamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idMedicamentos = 0

    @Column
    var nombreMedicamento = " "

    @Column
    var descripcion = " "

    @Column
    var viaAdministracion = " "

    @Column
    var unidadReferencia = " "

    @Column
    var tipoMedicamento = " "
}
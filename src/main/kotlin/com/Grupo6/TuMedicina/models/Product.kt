package com.Grupo6.TuMedicina.models

import javax.persistence.*


@Entity


class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id = 0
   @Column
    var title =""

    @Column
    var descripcion = ""

    @Column
    var image =""

    @Column
    var precio =0

}
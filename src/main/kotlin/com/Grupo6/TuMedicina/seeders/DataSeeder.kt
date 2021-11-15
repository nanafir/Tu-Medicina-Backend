package com.Grupo6.TuMedicina.seeders

import com.Grupo6.TuMedicina.models.Product
import com.Grupo6.TuMedicina.repositories.ProductRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import kotlin.random.Random


@Component
class DataSeeder(private val productRepository: ProductRepository):ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
     // for(i in 1..50){
    // val product = Product()

       //    product.title="este es el" +i
         // product.descripcion="esta  es la description"+i
          //product.image= "http://lorentpixel.com/200/200?" + Random.nextInt(10000)
          //product.precio = Random.nextInt(10,100)
          //this.productRepository.save(product)

      //}
    }
}
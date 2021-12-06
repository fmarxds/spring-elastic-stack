package br.com.fmarxds.springelasticstack.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal

@Document(collection = "produtos")
data class Produto(

    @Id
    val id: String,

    val nome: String,

    val valor: BigDecimal,

)
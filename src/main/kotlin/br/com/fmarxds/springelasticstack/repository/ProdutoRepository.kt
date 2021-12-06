package br.com.fmarxds.springelasticstack.repository

import br.com.fmarxds.springelasticstack.model.Produto
import org.springframework.data.mongodb.repository.MongoRepository

interface ProdutoRepository : MongoRepository<Produto, String>
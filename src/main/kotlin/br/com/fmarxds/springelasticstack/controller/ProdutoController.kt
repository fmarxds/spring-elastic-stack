package br.com.fmarxds.springelasticstack.controller

import br.com.fmarxds.springelasticstack.model.Produto
import br.com.fmarxds.springelasticstack.service.ProdutoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/produtos")
class ProdutoController(
    private val produtoService: ProdutoService,
) {

    @GetMapping
    fun buscarTodos(): ResponseEntity<Collection<Produto>> {
        val produtos = produtoService.buscarTodos()
        return ResponseEntity.ok(produtos)
    }

}
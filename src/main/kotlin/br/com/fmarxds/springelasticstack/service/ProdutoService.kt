package br.com.fmarxds.springelasticstack.service

import br.com.fmarxds.springelasticstack.model.Produto
import br.com.fmarxds.springelasticstack.repository.ProdutoRepository
import org.springframework.stereotype.Service

@Service
class ProdutoService(
    private val produtoRepository: ProdutoRepository,
) {

    fun buscarTodos(): Collection<Produto> {
        return produtoRepository.findAll()
    }

}
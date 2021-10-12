package br.com.douglasmotta.whitelabeltutorial.domain.useCase

import br.com.douglasmotta.whitelabeltutorial.domain.model.Product

interface GetProductsUseCase {

    suspend operator fun invoke(): List<Product>
}
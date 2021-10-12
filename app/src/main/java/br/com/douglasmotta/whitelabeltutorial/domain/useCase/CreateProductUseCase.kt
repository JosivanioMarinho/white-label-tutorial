package br.com.douglasmotta.whitelabeltutorial.domain.useCase

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.domain.model.Product

interface CreateProductUseCase {

    suspend operator fun invoke(description: String, price: Double, imageUri: Uri): Product
}
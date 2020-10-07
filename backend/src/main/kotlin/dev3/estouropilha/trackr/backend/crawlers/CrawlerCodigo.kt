package dev3.estouropilha.trackr.backend.crawlers

import dev3.estouropilha.trackr.backend.models.Entrega

interface CrawlerCodigo {
    fun consultarEntregas(cpfDestinatario: String): Entrega
}
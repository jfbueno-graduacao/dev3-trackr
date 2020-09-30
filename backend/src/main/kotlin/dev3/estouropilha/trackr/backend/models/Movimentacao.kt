package dev3.estouropilha.trackr.backend.models

import java.time.LocalDateTime

data class Movimentacao(val titulo: String, val data: LocalDateTime, val unidade: String, val detalhes: String)
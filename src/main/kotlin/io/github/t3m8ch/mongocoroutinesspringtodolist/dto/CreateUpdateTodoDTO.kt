package io.github.t3m8ch.mongocoroutinesspringtodolist.dto

data class CreateUpdateTodoDTO(
    val text: String,
    val isCompleted: Boolean = false,
)

package io.github.t3m8ch.mongocoroutinesspringtodolist.controllers

import io.github.t3m8ch.mongocoroutinesspringtodolist.dto.CreateUpdateTodoDTO
import io.github.t3m8ch.mongocoroutinesspringtodolist.services.TodoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("todos")
class TodoController(private val todoService: TodoService) {
    @GetMapping
    fun getAll() = todoService.getAll()

    @PostMapping
    suspend fun create(@RequestBody todo: CreateUpdateTodoDTO) = todoService.create(todo)
}

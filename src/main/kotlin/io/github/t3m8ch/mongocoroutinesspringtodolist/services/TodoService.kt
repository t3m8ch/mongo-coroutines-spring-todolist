package io.github.t3m8ch.mongocoroutinesspringtodolist.services

import io.github.t3m8ch.mongocoroutinesspringtodolist.dto.CreateUpdateTodoDTO
import io.github.t3m8ch.mongocoroutinesspringtodolist.models.TodoModel
import io.github.t3m8ch.mongocoroutinesspringtodolist.repositories.TodoRepository
import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service

interface TodoService {
    fun getAll(): Flow<TodoModel>
    suspend fun create(todo: CreateUpdateTodoDTO): TodoModel
}

@Service
class TodoServiceImpl(private val todoRepo: TodoRepository) : TodoService {
    override fun getAll() = todoRepo.findAll()

    override suspend fun create(todo: CreateUpdateTodoDTO) = todoRepo.save(
        TodoModel(text = todo.text, isCompleted = todo.isCompleted)
    )
}

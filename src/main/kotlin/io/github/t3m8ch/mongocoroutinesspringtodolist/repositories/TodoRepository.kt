package io.github.t3m8ch.mongocoroutinesspringtodolist.repositories

import io.github.t3m8ch.mongocoroutinesspringtodolist.models.TodoModel
import org.bson.types.ObjectId
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface TodoRepository : CoroutineCrudRepository<TodoModel, ObjectId>

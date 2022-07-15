package io.github.t3m8ch.mongocoroutinesspringtodolist.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("Todos")
data class TodoModel(
    @Id val id: ObjectId = ObjectId.get(),
    val text: String,
    val isCompleted: Boolean = false,
)

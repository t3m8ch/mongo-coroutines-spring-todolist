package io.github.t3m8ch.mongocoroutinesspringtodolist

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongoCoroutinesSpringTodolistApplication

fun main(args: Array<String>) {
    runApplication<MongoCoroutinesSpringTodolistApplication>(*args)
}

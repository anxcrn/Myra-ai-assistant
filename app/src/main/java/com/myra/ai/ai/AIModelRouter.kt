package com.myra.ai.ai

class AIModelRouter {

    fun route(input: String): String {
        return if (input.contains("vision")) {
            "Vision Model"
        } else {
            "Conversation Model"
        }
    }
}

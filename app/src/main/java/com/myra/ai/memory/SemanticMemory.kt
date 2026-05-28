package com.myra.ai.memory

class SemanticMemory {
    private val memories = mutableListOf<String>()

    fun store(memory: String) {
        memories.add(memory)
    }

    fun all(): List<String> {
        return memories
    }
}

package com.myra.ai.agents

class AgentOrchestrator {

    private val agents = mutableListOf<String>()

    fun register(agent: String) {
        agents.add(agent)
    }

    fun allAgents(): List<String> {
        return agents
    }
}

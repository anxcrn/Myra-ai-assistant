package com.myra.ai.emotion

enum class EmotionMode {
    HAPPY,
    CARING,
    SERIOUS,
    EXCITED
}

class EmotionEngine {
    private var currentEmotion = EmotionMode.CARING

    fun current(): EmotionMode {
        return currentEmotion
    }
}

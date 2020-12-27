package com.example.speech

import androidx.lifecycle.LiveData
import com.example.data.primary.Exercise

enum class VoiceType {
    MAN,
    WOMAN
}

data class Config(val voiceType: VoiceType)
interface SpeechAssistant {
    fun start(exercise: Exercise, config: Config)
    fun pause()
    fun resume()
    fun getAssistantInfo(): LiveData<AssistantInfo>
}
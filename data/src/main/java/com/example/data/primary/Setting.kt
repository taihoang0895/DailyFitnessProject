package com.example.data.primary

enum class VoiceType {
    MAN,
    WOMEN
}

data class Setting(
    val isMute: Boolean,
    val voiceGuice: Boolean,
    val coachTips: Boolean,
    val voiceType: VoiceType
)
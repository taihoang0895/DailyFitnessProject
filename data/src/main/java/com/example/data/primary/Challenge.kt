package com.example.data.primary

abstract class Challenge(
    id: Int,
    title: String,
    description: String,
    previewImage: String,
    thumbnail: String,
    val tags: List<Tag>,
    val duration: Int,
    val secondPerDay: Int,
    val tagSuggestion: List<Tag>,
    val challengeSuggestion: List<Challenge>,
    val totalExercises: Int,
    val durationInSec: Int,
    val totalDays: Int,
    val totalKcal: Int,
    val currLevel: Int,
    val maxLevel: Int
) : Content(id, title, description, previewImage, thumbnail) {
    abstract fun listDailyChallenges(): List<DailyChallenge>
    abstract fun isReady(): Boolean

}
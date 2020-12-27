package com.example.data.primary

abstract class Workout(
    id: Int,
    title: String,
    description: String,
    previewImage: String,
    thumbnail: String,
    val tags: List<Tag>,
    val duration: Int,
    val secondPerDay: Int,
    val tagSuggestion: List<Tag>,
    val workoutSuggestion: List<Workout>,
    val totalExercises: Int,
    val durationInSec: Int
) : Content(id, title, description, previewImage, thumbnail) {
    abstract fun listExercises(): List<Exercise>
    abstract fun isReady(): Boolean

}
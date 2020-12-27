package com.example.data.primary

abstract class DailyChallenge(
    id: Int,
    title: String,
    description: String,
    previewImage: String,
    thumbnail: String,
    val totalCompleteExercises: Int,
    val isRestDay: Boolean,
    val totalExercises: Int,
    val totalKcal: Int
) : Content(id, title, description, previewImage, thumbnail) {
    abstract fun listExercises(): List<Exercise>
    abstract fun isReady(): Boolean

    fun percent(): Int {
        if (totalExercises == 0) {
            return 0
        }
        return (totalCompleteExercises * 100) / totalExercises
    }
}
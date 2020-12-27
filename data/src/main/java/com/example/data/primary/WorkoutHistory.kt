package com.example.data.primary

data class WorkoutHistory(
    val id: Int,
    val workout: Workout,
    val created: Long,
    val duration: Int,
    val totalKcalConsumed: Int
) {
    fun name(): String {
        return workout.title
    }
}
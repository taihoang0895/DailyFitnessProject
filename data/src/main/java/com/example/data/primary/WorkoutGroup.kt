package com.example.data.primary

enum class DisplayType{
    GRID,
    HORIZONTAL,
    VERTICAL
}
abstract class WorkoutGroup(
    id: Int,
    title: String,
    description: String,
    previewImage: String,
    thumbnail: String,
    val displayType: DisplayType,
    val totalSessions:Int,
    val durationInSec:Int
) : Content(id, title, description, previewImage, thumbnail){
    abstract fun listWorkouts(): List<Workout>
}
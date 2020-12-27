package com.example.data.complex

import com.example.data.primary.WorkoutGroup
import com.example.data.primary.WorkoutHistory

data class ListWorkoutHistory(
    val listWorkoutHistory: List<WorkoutHistory>,
    val fromDate: Long,
    val toDate: Long,
    val firstDate: Long?
)
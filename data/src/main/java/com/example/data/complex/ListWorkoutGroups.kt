package com.example.data.complex

import com.example.data.primary.WorkoutGroup

data class ListWorkoutGroups(val listWorkoutGroup: List<WorkoutGroup>,  val offset: Int,
                             val limit: Int,
                             val totalItem: Int)
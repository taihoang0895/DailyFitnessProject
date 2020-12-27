package com.example.data.complex

import com.example.data.primary.Challenge
import com.example.data.primary.WorkoutGroup

data class ListChallenges(
    val listChallenges: List<Challenge>,
    val offset: Int,
    val limit: Int,
    val totalItem: Int
)
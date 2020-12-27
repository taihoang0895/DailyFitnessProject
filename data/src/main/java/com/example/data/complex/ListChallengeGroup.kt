package com.example.data.complex

import com.example.data.primary.Challenge
import com.example.data.primary.Workout

data class ListChallengeGroup(
    val listChallengesMap: HashMap<String, List<Challenge>>
)